package com.utility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	
	public static String getParticularCell(int rows,int column) throws InvalidFormatException, IOException {
		
		File file=new File("C:\\Users\\sathi\\OneDrive\\Documents\\Book1.xlsx");
		Workbook book=new XSSFWorkbook(file);
	Sheet sheet=book.getSheetAt(0);
		
	Row row =sheet.getRow(rows);
	Cell cell=row.getCell(column);
	
	DataFormatter dataFormat=new DataFormatter();
	String testData=dataFormat.formatCellValue(cell);
	System.out.println(testData);
	
	return testData;
			
	}
	
   public static void getParticularCellMultipleRow() throws InvalidFormatException, IOException {
		
	   File file=new File("C:\\Users\\sathi\\OneDrive\\Documents\\Book1.xlsx");
		Workbook book=new XSSFWorkbook(file);
	Sheet sheet=book.getSheetAt(0);
		
	int noofRows=sheet.getLastRowNum();
	System.out.println("NO OF Rows: "+noofRows);
	
	Short noofCells=sheet.getRow(0).getLastCellNum();
	System.out.println("NO OF Cells: "+noofCells);
	
	Row row =sheet.getRow(1);
	
	for(int i=0;i<noofCells;i++) {
	Cell cell=row.getCell(i);
	DataFormatter dataFormat=new DataFormatter();
	String Data=dataFormat.formatCellValue(cell);
	System.out.println(Data);
	
	}
	
	}
   
   private static String getAllData() throws InvalidFormatException, IOException {
	   
	   File file=new File("C:\\Users\\sathi\\OneDrive\\Documents\\Book1.xlsx");
	 		Workbook book=new XSSFWorkbook(file);
	 	Sheet sheet=book.getSheetAt(0);
	 		
	 	int noofRows=sheet.getLastRowNum();
	 	System.out.println("NO OF Rows: "+noofRows);
	 	
	 	Short noofCells=sheet.getRow(0).getLastCellNum();
	 	System.out.println("NO OF Cells: "+noofCells);
	 	
	 	
	 	for(int i=1;i<noofRows;i++) {
	 	
	 		Row row=sheet.getRow(i);
	 		
	 		for(int j=0;j<=noofRows;j++) {
	 			
	 			Cell cell=row.getCell(j);
	 			
	 	DataFormatter dataFormat=new DataFormatter();
	 	String data=dataFormat.formatCellValue(cell);
	 	System.out.println(data);
	 		}
	 	}
   }
   
   public static void main(String args[]) throws InvalidFormatException, IOException {
  
//	   getParticularCell(2, 1);
//	   getParticularCellMultipleRow() ;
	   getAllData();
	  
   }
}
