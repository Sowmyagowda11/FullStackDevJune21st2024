package com.Gentech.Return.Method;
class Turn
{
	int add1(int x,int y)
	{
		int res=(x+y);
		return res;
	}
	int sub1(int a,int b)
	{
		int res=(a-b);
		return res;
	}void multiplication()
	{
		int a=this.add1(10, 5);
		int b=this.sub1(10, 5);
		int res=(a*b);
		System.out.println("Multiplaction result:"+res);
	}
	
}

public class Returnmethod {
	public static void main(String[] args)
	{
		Turn t=new Turn();
		t.multiplication();
		
	}

}
