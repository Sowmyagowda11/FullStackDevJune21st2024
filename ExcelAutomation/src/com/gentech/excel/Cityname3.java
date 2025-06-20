package com.gentech.excel;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Cityname3 {

	public static void main(String[] args) 
	{
		Cityname();

	}
	private static void Cityname()
	{	FileOutputStream fout=null;
		Workbook wb=new XSSFWorkbook();
		Sheet sh=wb.createSheet("Fruits");
		try
		{

		String City[]= {" Vijaynagar","Hattiguppe","yalechenalli","banashankri","Hosalli","Jp nagar","jaynagar","Mandya","ramnagar","Mysore","Banglore",
				"chennai","Goa","Panji","maharashtra","Whitfield","Challagatta","Market","Chikpete","Shivajinagar"};
		
		for(int i=0;i<City.length;i++)
		{
			Row row=sh.createRow(i);
			Cell cell=row.createCell(i);
			cell.setCellValue(City[i]);
			fout=new FileOutputStream("D:\\Excel\\City.xlsx");
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
