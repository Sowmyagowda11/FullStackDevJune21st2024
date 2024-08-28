package com.Gentech.Return.Method;
class outer
{
	String firstname;
	inner o=new inner();
	void show()
	{
		o.age=30;
		System.out.println("age is"+o.age);
	}
	class inner
	{
		int age;
		void print()
		{
			firstname="sowmya";
			System.out.println("name is:"+firstname);
		}
	}
}
public class Array6
{
	public static void main(String[] args)
	{
		outer o1=new outer();
		o1.show();
		o1.o.print();
	}
}