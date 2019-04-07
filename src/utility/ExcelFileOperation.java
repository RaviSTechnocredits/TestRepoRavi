package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileOperation {
	Workbook myworkbook;

	public ExcelFileOperation(String path) throws IOException {
		File file = new File(path);
		FileInputStream inStream = new FileInputStream(file);
		myworkbook = new XSSFWorkbook(inStream);
	}

	public Object[][] readData(String sheetName) throws IOException {
		// repeated operation so placed in constructor
		/*
		 * File file=new File(path); FileInputStream inStream=new
		 * FileInputStream(file); Workbook myworkbook=new
		 * XSSFWorkbook(inStream);
		 */
		Sheet mySheet = myworkbook.getSheet(sheetName);
		int totalRows = mySheet.getLastRowNum();
		int totalCol = mySheet.getRow(0).getLastCellNum();

		Object[][] data = new Object[totalRows][totalCol];
		for (int rowIndex = 1; rowIndex <= totalRows; rowIndex++) {
			for (int colIndex = 0; colIndex < totalCol; colIndex++) {
				Cell cell = mySheet.getRow(rowIndex).getCell(colIndex);
				if (cell== null) {
					data[rowIndex - 1][colIndex] ="";
				}
				else if (cell.getCellType() == CellType.NUMERIC) {
					data[rowIndex - 1][colIndex] = cell.getNumericCellValue();
				} else if (cell.getCellType() == CellType.STRING) {
					try{
					data[rowIndex - 1][colIndex] = cell.getStringCellValue();
					}catch(Exception e){
						data[rowIndex - 1][colIndex] = "";
					}
				} else if (cell.getCellType() == CellType.BOOLEAN) {
					data[rowIndex - 1][colIndex] = cell.getBooleanCellValue();
				} /*else if (cell.getCellType() == CellType.BLANK) {
					data[rowIndex - 1][colIndex] = "";
				}*/
			}
		}
		return data;
	}
}
