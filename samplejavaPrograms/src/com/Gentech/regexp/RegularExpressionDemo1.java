package com.gentech.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo1 {

	public static void main(String[] args) {
	//	matchesDemo();
	//	findDemo();
	//	countOfMatch();
	//	displayMatch();
	//	displayPositionOfMatch();
	//	replaceDemo();
		splitDemo();
	}
	
	private static void matchesDemo()
	{
		Pattern pattern=Pattern.compile("Welcome");
		Matcher match=pattern.matcher("Welcome");
		boolean v1=match.matches();
		System.out.println(v1);
	}
	
	private static void findDemo()
	{
		Pattern pattern=Pattern.compile("Welcome");
		Matcher match=pattern.matcher("Welcome Hello Hi Good Hey Welcome");
		boolean v1=match.find();
		System.out.println(v1);
	}
	
	private static void countOfMatch()
	{
		Pattern pattern=Pattern.compile("Welcome");
		Matcher match=pattern.matcher("Welcome Hello Hi Good Hey Welcome");
		int count=0;
		while(match.find())
		{
			count=count+1;
		}
		System.out.println("# of Count:"+count);
	}
	
	private static void displayMatch()
	{
		Pattern pattern=Pattern.compile("Welcome");
		Matcher match=pattern.matcher("Welcome Hello Hi Good Hey Welcome");
		while(match.find())
		{
			System.out.println(match.group());
		}
		
	}

	private static void displayPositionOfMatch()
	{
		Pattern pattern=Pattern.compile("Welcome");
		Matcher match=pattern.matcher("Welcome Hello Hi Good Hey Welcome");
		while(match.find())
		{
			System.out.println(match.group()+" start Pos:"+match.start()+"  End Pos:"+match.end());
		}
		
	}
	
	private static void replaceDemo()
	{
		Pattern pattern=Pattern.compile("Welcome");
		Matcher match=pattern.matcher("Welcome Hello Hi Good Hey Welcome");
		String str=match.replaceAll("Good");
		System.out.println(str);
	}
	
	private static void splitDemo()
	{
		Pattern pattern=Pattern.compile("[!@#$]");
		String s[]=pattern.split("Mango!Apple@Ornage$Grapes$Banana");
		for(String kk:s)
		{
			System.out.println(kk);
		}
		
	}
}
