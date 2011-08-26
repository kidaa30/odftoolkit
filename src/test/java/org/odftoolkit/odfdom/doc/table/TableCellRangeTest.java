/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 * 
 * Copyright 2009 IBM. All rights reserved.
 * 
 * Use is subject to license terms.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0. You can also
 * obtain a copy of the License at http://odftoolkit.org/docs/license.txt
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ************************************************************************/
package org.odftoolkit.odfdom.doc.table;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.odftoolkit.odfdom.doc.OdfSpreadsheetDocument;
import org.odftoolkit.odfdom.doc.OdfTextDocument;
import org.odftoolkit.odfdom.utils.ResourceUtilities;
import org.odftoolkit.odfdom.dom.element.table.TableCoveredTableCellElement;

public class TableCellRangeTest {

	final String filename = "TestSpreadsheetTable";
	final String odtfilename = "TestTextTable";
	OdfSpreadsheetDocument odsdoc;
	OdfTextDocument odtdoc;
	OdfTable odsTable, odtTable;

	@Before
	public void setUp() {
		try {
			odsdoc = (OdfSpreadsheetDocument) OdfSpreadsheetDocument.loadDocument(ResourceUtilities.getTestResourceAsStream(filename + ".ods"));
			odtdoc = (OdfTextDocument) OdfTextDocument.loadDocument(ResourceUtilities.getTestResourceAsStream(odtfilename + ".odt"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testTextCellMerge() {
		//get cell range, then merge
		OdfTable table1 = odtdoc.getTableByName("Table1");
		//get the first two cell
		OdfTableCellRange cellRange = table1.getCellRangeByPosition(0, 0, 1, 0);
		cellRange.merge();
		OdfTableCell cell = cellRange.getCellByPosition(0, 0);
//    	Assert.assertEquals(cell.getDisplayText(), "cell1cell2");
		saveodt("MergeTwoCell");
		try {
			OdfTextDocument saveddoc = (OdfTextDocument) OdfTextDocument.loadDocument(ResourceUtilities.getTestResourceAsStream(odtfilename + "MergeTwoCell.odt"));
			OdfTable savedTable1 = saveddoc.getTableByName("Table1");
			//get the cell range which the first cell is the covered cell.
			//so the cell range will be enlarged
			OdfTableCellRange savedCellRange = savedTable1.getCellRangeByPosition(1, 0, 2, 0);
			savedCellRange.merge();
			Assert.assertTrue(savedCellRange.getColumnNumber() == 3);
			OdfTableCell savedCell = savedCellRange.getCellByPosition(0, 0);
//        	NodeList paraList = savedCell.getOdfElement().getChildNodes();
//        	OdfWhitespaceProcessor textProcessor = new OdfWhitespaceProcessor();
//        	Assert.assertTrue(paraList.item(2) instanceof OdfTextParagraph);
//        	Assert.assertEquals(textProcessor.getText(paraList.item(2)),"0.00");
			saveddoc.save(ResourceUtilities.newTestOutputFile(odtfilename + "MergeCoveredCell.odt"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			OdfTextDocument saveddoc = (OdfTextDocument) OdfTextDocument.loadDocument(ResourceUtilities.getTestResourceAsStream(odtfilename + "MergeTwoCell.odt"));
			OdfTable savedTable1 = saveddoc.getTableByName("Table1");
			//get the cell range which the first cell is the covered cell.
			//so the cell range will be enlarged
			OdfTableCellRange savedCellRange = savedTable1.getCellRangeByPosition(0, 0, 0, 1);
			savedCellRange.merge();
			Assert.assertTrue(savedCellRange.getColumnNumber() == 2);
			Assert.assertTrue(savedCellRange.getRowNumber() == 2);
			OdfTableCell savedCell = savedCellRange.getCellByPosition(0, 1);
			//Assert.assertTrue(savedCell.getOdfElement() instanceof OdfCoveredTableCell);
			Assert.assertTrue(savedCell.getOdfElement() instanceof TableCoveredTableCellElement);
			saveddoc.save(ResourceUtilities.newTestOutputFile(odtfilename + "MergeCoveredCell2.odt"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/////////////////////////////////////////
	//issue: removeColumnByIndex removeRowByIndex removeCellByIndex
	@Test
	public void testTextTableMerge() {
		OdfTable table1 = odtdoc.getTableByName("Table1");
		//merge whole table
		OdfTableCellRange cellRange = table1.getCellRangeByPosition(0, 0, table1.getColumnCount() - 1, table1.getRowCount() - 1);
		cellRange.merge();
		Assert.assertEquals(table1.getColumnCount(), 2);
		Assert.assertEquals(table1.getRowCount(), 1);
		saveodt("MergeTable");
	}

	@Test
	public void testTextColumnMerge() {
		//merge first column
		OdfTable table1 = odtdoc.getTableByName("Table1");
		OdfTableCellRange firstColumn = table1.getCellRangeByPosition(0, 0, 0, table1.getRowCount() - 1);
		firstColumn.merge();
		OdfTableCell cell = firstColumn.getCellByPosition(0, 2);
		OdfTableCell firstCell = firstColumn.getCellByPosition(0, 0);
		Assert.assertTrue(cell.getOwnerTableCell().equals(firstCell));
		saveodt("MergeFirstColumn");
		try {
			OdfTextDocument saveddoc = (OdfTextDocument) OdfTextDocument.loadDocument(ResourceUtilities.getTestResourceAsStream(odtfilename + "MergeFirstColumn.odt"));
			OdfTable savedTable = saveddoc.getTableByName("Table1");
			OdfTableCellRange firstTwoColumn = savedTable.getCellRangeByPosition(0, 0, 1, savedTable.getRowCount() - 1);
			firstTwoColumn.merge();
			OdfTableCell cell1 = firstTwoColumn.getCellByPosition(0, 2);
			OdfTableCell firstCell1 = firstTwoColumn.getCellByPosition(0, 0);
			Assert.assertTrue(cell1.getOwnerTableCell().equals(firstCell1));
			saveddoc.save(ResourceUtilities.newTestOutputFile(odtfilename + "MergeFirstTwoColumn.odt"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testTextRowMerge() {
		//merge first two row
		OdfTable table1 = odtdoc.getTableByName("Table1");
		int rowCount = table1.getRowCount();
		OdfTableCellRange firstTwoRow = table1.getCellRangeByPosition(0, 0, table1.getColumnCount() - 1, 1);
		firstTwoRow.merge();
		Assert.assertTrue(rowCount == (table1.getRowCount() + 1));
		saveodt("MergeFirstTwoRow");
	}

	@Test
	public void testSpreadSheetMerge() {
		//get cell range, set name
		OdfTable sheet1 = odsdoc.getTableByName("Sheet1");
		OdfTableCellRange cellRange = sheet1.getCellRangeByPosition(28, 0, 28, 5);
		cellRange.setCellRangeName("test");
		cellRange.merge();
		OdfTableCellRange cellRange1 = sheet1.getCellRangeByPosition("$E1", "$E6");
		cellRange1.setCellRangeName("TimeCellRange");
		cellRange1.merge();

		saveods("CellRangeName");
		try {
			OdfSpreadsheetDocument saveddos = (OdfSpreadsheetDocument) OdfSpreadsheetDocument.loadDocument(ResourceUtilities.getTestResourceAsStream(filename + "CellRangeName.ods"));
			OdfTable savedSheet = saveddos.getTableByName("Sheet1");
			OdfTableCellRange namedCellRange = savedSheet.getCellRangeByName("TimeCellRange");
			OdfTableCell cell = namedCellRange.getCellByPosition("A1");
			Assert.assertTrue(cell.getRowSpannedNumber() == 6);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testChangeCell() {
		//get cell range by name
		//set the cell with the same background color
		//and format String
	}

	public void testGetCell() {
		//cellrange.getcell = OdfTable.getCell
		//=FTableRow.getCell
	}

	private void saveods(String name) {
		try {
			odsdoc.save(ResourceUtilities.newTestOutputFile(filename + name + ".ods"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void saveodt(String name) {
		try {
			odtdoc.save(ResourceUtilities.newTestOutputFile(odtfilename + name + ".odt"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
