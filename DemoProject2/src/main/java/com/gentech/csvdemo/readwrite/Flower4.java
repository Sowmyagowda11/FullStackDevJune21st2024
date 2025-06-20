package com.gentech.csvdemo.readwrite;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Flower4 {

	public static void main(String[] args) 
	{
		Flowers();

	}
	private static void Flowers()
	{	FileOutputStream fout=null;
		Workbook wb=new XSSFWorkbook();
		Sheet sh=wb.createSheet("Fruits");
		try
		{

		     String[] flowers = {"Rose", "Lily", "Sunflower", "Daisy", "Tulip", "Violet", "Poppy", "Iris", "Orchid", "Carnation", "Jasmine", "Gardenia", "Hibiscus", "Lavender", "Peony", "Hydrangea", "Snapdragon", "Gerbera", "Calla", "Lilac"};
		        String[] colors = {"Red", "White", "Yellow", "White", "Red", "Purple", "Red", "Purple", "Pink", "Red", "White", "White", "Pink", "Purple", "Pink", "Blue", "Red", "Pink", "White", "Purple"};

		      
		        for (int i = 0; i < flowers.length; i++) {
		            Row row = sh.createRow(i);
		            Cell cell1 = row.createCell(0);
		            cell1.setCellValue(flowers[i]);
		            Cell cell2 = row.createCell(1);
		            cell2.setCellValue(colors[i]);
		        
			fout=new FileOutputStream("D:\\Excel\\Flowers46.xlsx");
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