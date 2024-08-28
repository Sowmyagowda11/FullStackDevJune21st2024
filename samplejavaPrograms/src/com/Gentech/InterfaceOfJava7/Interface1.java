package com.Gentech.InterfaceOfJava7;

interface University
{
	void ShowUniversityName(String name);
}
class LVDCollege implements University
{
	@Override
	public void ShowUniversityName(String name)
	{
		System.out.println("the University name is:"+name);
	}
	void displayaddress(String Address)
	{
		System.out.println("the address is:"+Address);
	}
}
public class Interface1 {

	public static void main(String[] args)
	{
		LVDCollege o=new LVDCollege();
		o.ShowUniversityName("VTU");
		o.displayaddress("Near govt hospital,Belgaum");
	}

}
