package com.Gentech.InterfaceOfJava7;
interface University1
{
	void ShowUniversityName(String Name);
}
interface College
{
	 void ShowCollegeName(String name);
}
class LvdCollege1 implements University1,College
{
	@Override
	public void ShowUniversityName(String Name)
	{
		System.out.println("universityname is:"+Name);
	}
	@Override
	public void ShowCollegeName(String name)
	{
		System.out.println("the college name is:"+name);
	}
	void displayAdress(String Address)
	{
		System.out.println("the address is:"+Address);
	}

}
public class Interface2 {

	public static void main(String[] args)
	{
		LvdCollege1 o=new LvdCollege1();
		o.ShowUniversityName("VTU");
		o.ShowCollegeName("GMIT");
		o.displayAdress("Bharathingar,Mandya");
	}

}
