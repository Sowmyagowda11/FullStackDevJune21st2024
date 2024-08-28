package com.Gentech.InterfaceOfJava7;
interface University3
{
	void ShowUniversityName(String Name);
}
interface College3 extends University3
{
	void ShowCollegeName(String Name);
}
class LvDCollege3 implements College3
{
	@Override
	public void ShowUniversityName(String Name)
	{
		System.out.println("the university name is:"+Name);
	}
	@Override
	public void ShowCollegeName(String Name)
	{
		System.out.println("The college name is:"+Name);
	}
	void DisplayAddress(String Address)
	{
		System.out.println("the address is:"+Address);
	}
}
public class Interface3 
{
	public static void main(String[] args)
	{
		LvDCollege3 o=new LvDCollege3();
		o.ShowUniversityName("VTU");
		o.ShowCollegeName("GMIT");
		o.DisplayAddress("Bharathinagar,Mandya");
	}

}
