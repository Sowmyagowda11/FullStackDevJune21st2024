package com.Gentech.InterfaceOfJava7;
interface University4
{
	void ShowUniversityName(String name);
}
interface College4
{
	void ShowCollegeName(String name);
}
class GmitCollege implements College4,University4
{
	@Override
	public void ShowUniversityName(String name)
	{
		System.out.println("the university name:"+name);
	}
	@Override
	public void ShowCollegeName(String name)
	{
		System.out.println("the college name is:"+name);
	}
}
public class Interface4 {

	public static void main(String[] args) {
		University4 o=new GmitCollege();
		o.ShowUniversityName("VTU");

	}

}
