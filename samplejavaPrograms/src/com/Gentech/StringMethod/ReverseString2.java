package com.Gentech.StringMethod;

public class ReverseString2 {

	public static void main(String[] args) {
		reverse1();
		reverse2();
		reverse3();
		
	}
	static void reverse1()
	{
		String s="Welcome HOME";
		char[] k=s.toCharArray();
		for(int i=k.length-1;i>=0;i--)
		{
			System.out.print(k[i]);
		}System.out.println();
	}
	static void reverse2()
	{
		String m="GENTECH ACADEMY!";
		String reverse="";
		for(int i=m.length()-1;i>=0;i--)
		{
			reverse+=m.charAt(i);
		}System.out.print(reverse);
		System.out.println();
	}
	static void reverse3()
	{
		String n="G Madhegowda Institute of Technology";
		String reverse="";
		for(int i=n.length()-1;i>=0;i--)
		{
			reverse+=n.substring(i, i+1);
		}System.out.println(reverse);
	}
	
}


