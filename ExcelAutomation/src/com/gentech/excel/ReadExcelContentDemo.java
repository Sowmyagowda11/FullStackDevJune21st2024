package com.gentech.excel;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelContentDemo {
	public static void main(String[] args) {
		readContent();
	}
	
	private static void readContent()
	{
		FileInputStream fin=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		try
		{
			fin=new FileInputStream("D:\\EXCEL\\Test.xlsx");
			wb=new XSSFWorkbook(fin);
			//Sheet Object
			sh=wb.getSheet("Sheet1");
			//Row Object
			int rc=sh.getPhysicalNumberOfRows();
			for(int r=0;r<rc;r++)
			{
				row=sh.getRow(r);
				int cc=row.getPhysicalNumberOfCells();
				String data="";
				for(int c=0;c<cc;c++)
				{
					cell=row.getCell(c);
					if(cell.getCellType()==CellType.BLANK)
					{
						data="";
					}
					if(cell.getCellType()==CellType.STRING)
					{
						data=cell.getStringCellValue();
						System.out.print("   "+data);
					}
					
					if(cell.getCellType()==CellType.NUMERIC)
					{
						data=String.valueOf(cell.getNumericCellValue());
						System.out.print("   "+data);
					}
				}
				System.out.println();
			}
			
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fin.close();
				wb.close();
				sh=null;
				row=null;
				cell=null;
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}

}
