package sample;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/*
* @auther Ajay A
* Time : 2:07:04 AM
* Date : Nov 6, 2023
* Project Name : SpiceJetProject
*/

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        String excelPath = System.getProperty("user.dir");
        FileInputStream excelFile = new FileInputStream(excelPath + "/src/test/resources/testData/LogInData.xlsx");
        try (XSSFWorkbook workBook = new XSSFWorkbook(excelFile)) {
			XSSFSheet sheet = workBook.getSheet("LogInData");
			int rows = sheet.getPhysicalNumberOfRows();
			int columns = sheet.getRow(0).getLastCellNum();
			String[][] data = new String[rows][columns];
			for (int i = 0; i < rows; i++) {
			    for (int j = 0; j < columns; j++) {
			        XSSFCell cell = sheet.getRow(i).getCell(j);
			        DataFormatter value = new DataFormatter();
			        data[i][j] = value.formatCellValue(cell);
			        System.out.println(i+" "+j);
			        System.out.println(data[i][j]);
			        
			        
			    }
			    System.out.println(rows+"--------------------------------"+ columns);
			}
			excelFile.close();
			//return data;
			
		}
		
	}

}
