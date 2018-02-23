/**
 *
 */
package com.marshall.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @author Vis
 *
 */
public class ExcelHandlerUtil {

	public static List<List<String>> readExcel(InputStream inputStream) {
		List<List<String>> excelList = new ArrayList<>();
		try {

			// Create Workbook instance holding reference to .xlsx file
			XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
			Sheet datatypeSheet = workbook.getSheetAt(0);
			Iterator<Row> iterator = datatypeSheet.iterator();

			while (iterator.hasNext()) {

				Row currentRow = iterator.next();
				Iterator<Cell> cellIterator = currentRow.cellIterator();
				List<String> rowList = new ArrayList<>();

				while (cellIterator.hasNext()) {
					Cell currentCell = cellIterator.next();
					if (currentCell.getCellTypeEnum() == CellType.STRING) {
						rowList.add(currentCell.getStringCellValue().trim());
					} else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
						rowList.add(Double.toString(currentCell.getNumericCellValue()));
					}
				}
				excelList.add(rowList);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return excelList;

	}

	public static void main(String args[]) {

		// System.out.println(readExcel(new
		// File("R:/Java_Workspace/Marshall/MarshallRA/src/main/resources/ra_data_classifier.xlsx")));
	}

}
