package com.Gentech.Return.Method;
class Sum
{
	int sum(int a[])
	{
		int sum=0;
		for(int i=0;i<=a.length-1;i++)
		{
			sum+=a[i];
		}
		return sum;
	}
}
public class SumArr {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60};
		Sum s=new Sum();
		int total=s.sum(a);
		System.out.println("The sum of the elements is "+total);

	}

}

