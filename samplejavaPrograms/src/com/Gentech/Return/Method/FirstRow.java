package com.Gentech.Return.Method;
class First
{
	char[][] arr(char[][] a)
	{
		char[][] m=new char[a.length][a[0].length];
		for(int i=0;i<a.length;i++)
		{
			m[i]=a[i];
		}return a;
	}
}

public class FirstRow {
	public static void main(String args[])
	{
		First b=new First();
		char s[][]= {{'v','s','k'},{'m','n','l'},{'z','k','j'}};
		char t[][]=b.arr(s);
		for(int i=0;i<t.length;i++)
		{
			System.out.print(t[0][i]+" ");
		}
		
	}

}
