package utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] readExcel(String fileName) throws IOException {
		// TODO Auto-generated method stub


	FileInputStream file = new FileInputStream(".\\src\\main\\resources\\"+fileName+".xlsx");
	XSSFWorkbook book = new XSSFWorkbook(file);
	XSSFSheet sheet = book.getSheet("Sheet1");
	int rows = sheet.getLastRowNum();
	short cells = sheet.getRow(0).getLastCellNum();
	String[][] data = new String[rows][cells];
	for (int i = 1; i <=rows; i++) {
		for (int j = 0; j <cells; j++) {
			 XSSFCell cell = sheet.getRow(i).getCell(j);
			 String cellValue = cell.getStringCellValue();
			data[i-1][j] = cellValue;
			
		}
	}
	book.close();
	return data;
}
}