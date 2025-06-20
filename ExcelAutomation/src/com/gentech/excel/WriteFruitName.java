package com.gentech.excel;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteFruitName {

	public static void main(String[] args) 
	{
		FruitName();

	}
	private static void FruitName()
	{	FileOutputStream fout=null;
		Workbook wb=new XSSFWorkbook();
		Sheet sh=wb.createSheet("Fruits");
		try
		{

		String Fruit[]= {" banana","Apple","Watermelon","pomegranate","Orange","Grapes","Guava","straberry","mango","Cherry","Blueberry",
				"berry","lemon","plum","papaya","grapefruit","kiwi","pineapple","Avacado"};
		Row row=sh.createRow(9);
		for(int i=0;i<Fruit.length;i++)
		{
			
			Cell cell=row.createCell(i);
			cell.setCellValue(Fruit[i]);
			fout=new FileOutputStream("D:\\Excel\\Fruits.xlsx");
			wb.write(fout);
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				fout.close();
				wb.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		
		}
		
		
	}

}
