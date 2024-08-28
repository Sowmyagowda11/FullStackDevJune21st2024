package com.Gentech.programs;
class Sum
{
	void SumofNumbers()
	{
		int add=0;
		for( int i=1;i<=50;i++)
		{
			add+=i;
		}System.out.println("sum of numbers is:"+add);
	}
}
public class ss1 {
	
	public static void main(String[] args)
	{
		Sum obj1=new Sum();
		obj1.SumofNumbers();
	
		
	}

}
