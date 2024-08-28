//2 hybrid 
package com.Gentech.Inheritance;
class GrandFather
{
	void GrandFatherName(String GName)
	{
		System.out.println("Grandpa name is:"+GName);
	}
}
class Father extends GrandFather
{
	void FatherName(String FName)
	{
		System.out.println("father name is:"+FName);
	}
}
class Uncle extends GrandFather
{
	void Unclename(String UName)
	{
		System.out.println("Uncle name is:"+UName);
	}
}
class Son extends Father
{
	void SonName(String SName)
	{
		System.out.println("SonName is:"+SName);
	}
}

public class HybridFamily {
	public static void main(String[] args)
	{
		Son o=new Son();
		o.GrandFatherName("Girish");
		o.FatherName("Raju");
		o.SonName("Darshan");
		Uncle o1=new Uncle();
		o1.GrandFatherName("Girish");
		o1.Unclename("Ravi");
	}
	

}
