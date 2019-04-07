package excelOparation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheetReading {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Ravi Sawarker\\Downloads\\TestData.xlsx");
		FileInputStream input = new FileInputStream(file);

		Workbook myworkbook = new XSSFWorkbook(input);
		Sheet sheet = myworkbook.getSheet("Data");
		/*
		 * Row row=sheet.getRow(0); Cell cell=row.getCell(0); String
		 * uname=cell.getStringCellValue();
		 */
		/*
		 * String uname=sheet.getRow(0).getCell(0).getStringCellValue(); String
		 * password=sheet.getRow(0).getCell(1).getStringCellValue();
		 */

		int totalRows = sheet.getLastRowNum();
		int firstRow = sheet.getFirstRowNum();
		int firstColumn=sheet.getRow(firstRow).getFirstCellNum();
		// int totalColumns = sheet.getRow(0).getLastCellNum();
		int totalColumns = sheet.getRow(firstRow).getLastCellNum();
		// System.out.println(totalColumns);
		boolean isHeader = true; // to avoid operations on header line
		// int firstRow=0;
		if (isHeader) {
			firstRow++;
		}
		for (int i = firstRow; i <= totalRows; i++) {
			for (int j = firstColumn; j < totalColumns; j++) {
				try{
					if(CellType.NUMERIC==sheet.getRow(i).getCell(j).getCellType()){
						double cellData=sheet.getRow(i).getCell(j).getNumericCellValue();
						System.out.print(cellData + "\t");
					}
					else if(CellType.STRING==sheet.getRow(i).getCell(j).getCellType()){
						String cellData = sheet.getRow(i).getCell(j).getStringCellValue();
						System.out.print(cellData + "\t");
					}
					
					//String cellData = sheet.getRow(i).getCell(j).getStringCellValue();
					//System.out.print(cellData + "\t");
				}
				catch(NullPointerException ne){
					System.out.print("NA \t");
				}
				/*String cellData = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(cellData + "\t");*/
				/*
				 * String uname=sheet.getRow(i).getCell(0).getStringCellValue();
				 * String
				 * password=sheet.getRow(i).getCell(1).getStringCellValue();
				 * System.out.println(uname); System.out.println(password);
				 */
			}
			System.out.println();
		}
		/*
		 * System.out.println(uname); System.out.println(password);
		 */
		myworkbook.close();
	}
}
