package excelOparation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheetModular {

	Workbook myworkbook = null;

	ExcelSheetModular(String filePath) throws IOException {
		File file = new File(filePath);
		FileInputStream input = new FileInputStream(file);
		myworkbook = new XSSFWorkbook(input);
	}

	/*
	 * ExcelSheetModular(String filePath,int sheetIndex) {
	 * 
	 * }
	 */

	public String[][] getRow(int rowIndex, String sheetName) {
		Sheet sheet = myworkbook.getSheet(sheetName);
		Row row = sheet.getRow(rowIndex);
		int start = row.getFirstCellNum();
		int end = row.getLastCellNum();
		String[][] data = new String[1][end];

		for (int i = start; i < end; i++) {
			// System.out.print(row.getCell(i).getStringCellValue());
			data[0][i] = row.getCell(i).getStringCellValue();
		}
		return data;
	}

	public String[][] getAllRows(String sheetName) {
		int totalRows = myworkbook.getSheet(sheetName).getLastRowNum();
		int totalColumns = myworkbook.getSheet(sheetName).getRow(0).getLastCellNum();
		String[][] data = new String[totalRows][totalColumns]; // -1 as removing
																// header

		for (int i = 1; i <= totalRows; i++) {
			for (int j = 0; j < totalColumns; j++) {
				data[i - 1][j] = myworkbook.getSheet(sheetName).getRow(i).getCell(j).getStringCellValue();
			}
		}
		return data;
	}
}
