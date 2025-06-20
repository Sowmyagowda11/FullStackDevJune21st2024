package com.gentech.excel;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PresonName5 {

	public static void main(String[] args) 
	{
		 VegatbleName();

	}
	private static void VegatbleName()
	{	FileOutputStream fout=null;
		Workbook wb=new XSSFWorkbook();
		Sheet sh=wb.createSheet("Fruits");
		try
		{

		String vegetable[]= {"Vijith","vinu","Priya","Varsh","Raksh","Anu","Radhika","pushpa","Shivu","Darshan","Raju","Lakshmi","Vishal","Jeevan","Baneeth","Harshi","chaithra","shilpa","Liki","Himani"
				
				};
		
		for(int i=0;i<vegetable.length;i++)
		{
			Row row=sh.createRow(i);
			
			Cell cell=row.createCell(9);
			cell.setCellValue(vegetable[i]);
			fout=new FileOutputStream("D:\\Excel\\PersonName.xlsx");
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
