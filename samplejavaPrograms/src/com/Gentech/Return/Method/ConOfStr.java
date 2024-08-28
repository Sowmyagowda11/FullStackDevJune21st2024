package com.Gentech.Return.Method;
class getStr
{
	String Concat(String[] s)
	{
		String Con=" ";
		for(int i=0;i<s.length;i++)
		{
			Con+=(s[i]+" ");
			
		}
		return Con;
	
	}
}

public class ConOfStr {
	public static void main(String[] args)
	{
		getStr w=new getStr();
		String[] s={"kruthika","is","good","girl"};
		String t=w.Concat(s);
		System.out.print(t);
		
	}
}
