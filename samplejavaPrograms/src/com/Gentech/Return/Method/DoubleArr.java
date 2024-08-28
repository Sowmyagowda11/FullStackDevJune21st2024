package com.Gentech.Return.Method;
class GetArray
{
	double[] array1(double k[])
	{
		double v[]=new double[k.length];
		for(int i=k.length-1;i>=0;i--)
		{
			v[i]=k[i];
		}return v;
	}
}

public class DoubleArr {
public static void main(String args[])
{
	GetArray g=new GetArray();
	 double s[]={10.0,13.0,34.6,56.0,77.0,90.0};
	 double t[]=g.array1(s);
	for(int i=t.length-1;i>=0;i--)
	{
		System.out.print(t[i]+" ");
	}
	 
	
}
}
