package com.gentech.excel;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteColorName2 {

	public static void main(String[] args) 
	{
		ColorName();

	}
	private static void ColorName()
	{	FileOutputStream fout=null;
		Workbook wb=new XSSFWorkbook();
		Sheet sh=wb.createSheet("Fruits");
		try
		{

		String Fruit[]= {" black","blue","Orange","pink","Skyblue","Green","DarkGreen","White","brown","Voilet","lavender","yellow","purple","red","lightpink","brown","pink","orange","Voilet","red"};
		Row row=sh.createRow(9);
		for(int i=0;i<Fruit.length;i++)
		{
			
			Cell cell=row.createCell(i);
			cell.setCellValue(Fruit[i]);
			fout=new FileOutputStream("D:\\Excel\\Colors.xlsx");
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
