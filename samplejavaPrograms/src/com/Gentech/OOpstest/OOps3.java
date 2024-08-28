package com.Gentech.OOpstest;
abstract class main
{
	void show()
	{
		System.out.println("it is a instance method");
	}
	static
	{
		System.out.println("it is a static block");
	}
}
class print extends main
{
	
}
public class OOps3
{
	public static void main(String[] args)
	{
		print o=new print();
		o.show();
	}
}