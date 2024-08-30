package com.gentech.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo2 {
	public static void main(String[] args) {
	//	patternMatching();
	//	patternMatching2();
	//	patternMatching3();
		patternMatchingWords();
	}
	
	private static void patternMatching()
	{
		Pattern pattern=Pattern.compile("[0-9][0-9][0-9]");
		String str="Bangalore received 125 mili meter of rain yesterday";
		Matcher match=pattern.matcher(str);
		boolean v1=match.find();
		System.out.println(v1);
	}

	private static void patternMatching2()
	{
		Pattern pattern=Pattern.compile("[0-9][0-9][0-9]");
		String str="Bangalore received 125 mili meter of rain yesterday";
		Matcher match=pattern.matcher(str);
		String v1=match.replaceAll("many");
		System.out.println(v1);
	}
	
	private static void patternMatching3()
	{
		Pattern pattern=Pattern.compile("[0-9]{3}");
		String str="Bangalore received 125 mili meter of rain yesterday";
		Matcher match=pattern.matcher(str);
		String v1=match.replaceAll("many");
		System.out.println(v1);
	}
	
	private static void patternMatchingWords()
	{
		Pattern pattern=Pattern.compile("[a-zA-Z]+");
		String str="The temple is at the top of the hill";
		Matcher match=pattern.matcher(str);
		while(match.find())
		{
			System.out.print(match.group()+" ");
		}
	}
}
