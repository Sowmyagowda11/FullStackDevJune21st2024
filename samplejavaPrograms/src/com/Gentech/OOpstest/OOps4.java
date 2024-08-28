package com.Gentech.OOpstest;
 class main1
{
	int x;int y;
	void addition(int x,int y)
	{
		x+=100;
		y*=3;
		System.out.println(x);
		System.out.println(y);
	}
}
 public class OOps4
 {
	 
	public static void main(String[] args)
	{
		main1 o=new main1();
		int x;int y;
		x=10;
		y=12;
		System.out.println(x);
		System.out.println(y);
		o.addition(x,y);
		System.out.println(x);
		System.out.println(y);
		
	}

}
