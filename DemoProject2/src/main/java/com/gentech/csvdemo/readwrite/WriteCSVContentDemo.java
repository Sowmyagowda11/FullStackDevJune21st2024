package com.gentech.csvdemo.readwrite;

import java.io.FileWriter;

public class WriteCSVContentDemo {

	public static void main(String[] args) {
		writeContent();

	}
	
	private static void writeContent()
	{
		FileWriter fw=null;
		
		try
		{
			fw=new FileWriter("E:\\Example\\Employees.csv");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
