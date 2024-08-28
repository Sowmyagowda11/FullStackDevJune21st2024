package com.Gentech.Return.Method;
class NumSquare
{
	int[] Square()
	{
		
	     int c[]=new int[10];
		for(int i=1;i<=10;i++)
		{
            c[i-1]=i*i;
			
		}return c;
		
	}
}
public class SquareArr {
	public static void main(String[] args)
	{
		NumSquare o1=new NumSquare();
		 	int k[]=o1.Square();
		 	for(int kk:k)
		 	{
		 		System.out.println(kk);
		 	}
		
	}

}
