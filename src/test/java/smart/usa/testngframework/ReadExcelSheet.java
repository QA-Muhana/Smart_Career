package smart.usa.testngframework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelSheet {

	
static String fileLocation ="C:\\Users\\muhan\\eclipse-workspace\\Smart_Career\\TestData\\read excel sheeet.xlsx";	

@Test
public static void getReadExecl () throws IOException {
	FileInputStream file = new 	FileInputStream(fileLocation); //FileInputStream class from java
	XSSFWorkbook book = new XSSFWorkbook(file);      //XSSFWorkbook from apache poi
	XSSFSheet sheet = book.getSheet("Sheet1");         //XSSFSheet from apache poi
	Iterator<Row> rowNumber = sheet.iterator();    //Iterator from java util, Row from apache poi
	rowNumber.next();                             //this step to avoid the header
	
	ArrayList<String> lists = new ArrayList<String>();
	
	   while(rowNumber.hasNext()) {
		   lists.add(rowNumber.next().getCell(0).getStringCellValue());
		   System.out.println("My Execel sheet data is: " + lists);
	   }
	}
}
