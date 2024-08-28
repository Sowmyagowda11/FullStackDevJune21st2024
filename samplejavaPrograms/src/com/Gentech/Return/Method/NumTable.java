package com.Gentech.Return.Method;
class tables1
{
	int[] tab(int num)
	{
		int a[]=new int[10];
		for(int i=1;i<=10;i++)
		{
			a[i-1]=num*i;
		}
		return a;
	}
}
public class NumTable {

	public static void main(String[] args) {
		tables1 t=new tables1();
		int num=9;
		int r[]=t.tab(num);
		for(int i=0;i<=9;i++)
		{
			System.out.println(num+" * "+(i+1)+ " = "+r[i]);
		}

	}
}
