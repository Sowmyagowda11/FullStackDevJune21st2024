package com.Gentech.Return.Method;
class Table
{
	int[] table()
	{
		int[] a=new int[10];
		for(int i=9;i>=0;i--)
		{
			a[i]=7*(i+1);
			
		}return a;
	}
	
}

public class tableof7 {
	public static void main(String[] args)
	{
		Table t=new Table();
		int k[]=t.table();
		for(int i=k.length;i>=1;i--)
		{
			System.out.println(k[i-1]);
		}
		 
	}

}
