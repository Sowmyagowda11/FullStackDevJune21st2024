package com.gentech.excel;



import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;

	public class FruitNameReadAndWrite {
	    public static void main(String[] args) throws IOException {
	        // Read from existing Excel file
	        FileInputStream fileIn = new FileInputStream("D:\\Excel\\credential.xlsx");
	        Workbook workbook = new XSSFWorkbook(fileIn);
	        Sheet sheet1 = workbook.getSheetAt(0);
	        Sheet sheet2 = workbook.getSheetAt(1);

	      
	        for (int i = 0; i < 21; i++)
	        {
	            Row row = sheet1.getRow(i);
	            Cell cell = row.getCell(0);
	            String fruit = cell.getStringCellValue();

	            
	            Row row2 = sheet2.getRow(0);
	            if (row2 == null) 
	            {
	                row2 = sheet2.createRow(0);
	            }
	            Cell cell2 = row2.createCell(i);
	            cell2.setCellValue(fruit);
	        }

	   
	        try (FileOutputStream fileOut = new FileOutputStream("D:\\Excel\\FruitRead")) {
	            workbook.write(fileOut);
	        }

	        workbook.close();
	    }
	}


