package com.Gentech.Return.Method;
class fact
{
	int factor(int a)
	{
		int fact=1;
		for(int i=1;i<=a;i++)
		{
			fact*=i;
		}return fact;
	}
}

public class factorial {
	public static void main(String[] args)
	{
		fact n=new fact();
		int c=n.factor(9);
		System.out.println(c);
		
	}

}
