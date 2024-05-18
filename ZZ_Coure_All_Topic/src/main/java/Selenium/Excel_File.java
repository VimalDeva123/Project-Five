package Selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.collections4.Get;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excel_File {
	
	
	@Test
	public void File_Handling() throws IOException
	{
		//Reach the File 
		File F = new File("C:\\Users\\Swarnalakshmi G\\OneDrive - NextPoint\\Documents\\FIle_Reading.xlsx");
		
		//Get the File
		FileInputStream FIS = new FileInputStream(F);
		
		//Convert the File as Workbook
		
		XSSFWorkbook Excel = new XSSFWorkbook( FIS);
		
		//Get the Sheet
		
		XSSFSheet sheet =    Excel.getSheetAt(0);
		
		System.out.println(sheet.getLastRowNum());
		 
	}
	
	

}
