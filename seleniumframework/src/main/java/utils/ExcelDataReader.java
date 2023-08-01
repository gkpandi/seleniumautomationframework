package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelDataReader {

	public String[][] getData(String sheetName) throws BiffException, IOException {

		String testData[][] = null;
		
		FileInputStream fis = new FileInputStream(new File(
				System.getProperty("user.dir") + File.separator + "testdata" + File.separator + "userdetails.xls"));
		
		Workbook book = Workbook.getWorkbook(fis);
		Sheet sheet = book.getSheet(sheetName);
		
		int rows = sheet.getRows();
		int cols = sheet.getColumns();
		testData = new String[rows][cols];
		
		for (int row = 0; row < rows; row++)
		{
			for (int col=0; col < cols; col++) {
				testData[row][col] = sheet.getCell(col,row).getContents();
			}
		}
		return testData;
	}
}