package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadandWrite {
	
	 public static String ReadExcel(int rows,int column) throws InvalidFormatException, IOException {
			
		   File file=new File("C:\\Users\\sathi\\OneDrive\\Documents\\Adactin login.xlsx");
			Workbook book=new XSSFWorkbook(file);
		Sheet sheet=book.getSheetAt(0);
	 		
		Row row =sheet.getRow(rows);
		Cell cell=row.getCell(column);
		
		DataFormatter dataFormat=new DataFormatter();
		String testData=dataFormat.formatCellValue(cell);
		System.out.println(testData);
		
		return testData;
				
		}
	 
	 public static String ReadExcel1(int rows,int column) throws InvalidFormatException, IOException {
			
		   File file=new File("C:\\Users\\sathi\\OneDrive\\Documents\\Adactin login.xlsx");
			Workbook book=new XSSFWorkbook(file);
		Sheet sheet=book.getSheetAt(0);
	 		
		Row row =sheet.getRow(rows);
		Cell cell=row.getCell(column);
		
		DataFormatter dataFormat=new DataFormatter();
		String Data=dataFormat.formatCellValue(cell);
		System.out.println(Data);
		
		return Data;
				
		}

	 
	 public static void WriteExcel() throws IOException {
		 
		 File file=new File("C:\\\\Users\\\\sathi\\\\OneDrive\\\\Documents\\\\Book1.xlsx")	;
			FileInputStream fileInput=new FileInputStream(file);
			
			Workbook book=new XSSFWorkbook(fileInput);
			
			book.getSheet("Students").createRow(0).createCell(0).setCellValue("Helen");
			
			book.getSheet("Students").getRow(0).createCell(1).setCellValue("1234");
				
				
			FileOutputStream fileOutput=new FileOutputStream(file)	;
			book.write(fileOutput);
			book.close();
			System.out.println("-----Success----");
				
			}
	
	
	public static void main(String[] args) throws InvalidFormatException, IOException {
		// TODO Auto-generated method stub
		
//		ReadExcel(0, 1);
//		ReadExcel1(1,1);
    WriteExcel();
		
	}
}

