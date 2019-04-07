package excelProgramsPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NormalExcelDataPrint {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Ravi Sawarker\\Downloads\\Registration.xlsx");
		FileInputStream inStream = new FileInputStream(file);
		Workbook mybook = new XSSFWorkbook(inStream);
		Sheet sheet = mybook.getSheet("LoginData");
		int totalRows = sheet.getLastRowNum();
		int totalColumns = sheet.getRow(0).getLastCellNum();
		//String[][] data = new String[totalRows][totalColumns];
		String cellData = "";

		for (int i = 1; i <= totalRows; i++) {
			for (int j = 0; j < totalColumns; j++) {
				cellData = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(cellData + "\t");
			}
			System.out.println("");
		}
		mybook.close();
	}
}
