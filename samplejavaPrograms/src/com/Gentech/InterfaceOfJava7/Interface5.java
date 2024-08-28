
package com.Gentech.InterfaceOfJava7;

interface University5
{
	void ShowUniversityName(String name);
}
interface College5
{
	void ShowCollegeName(String name);
}
abstract class departments
{
	abstract void department(String dept[]);
}
class GmitCollege5 extends departments implements College5,University5
{
	public void ShowUniversityName(String name)
	{
		System.out.println("the university name:"+name);
	}
	public void ShowCollegeName(String name)
	{
		System.out.println("the college name is:"+name);
	}
	void department(String dept[])
	{
		System.out.println("departments!!");
		for(String depts:dept)
		{
			System.out.println(depts);
		}
	}
}
public class Interface5 {

	public static void main(String[] args)
	{
		GmitCollege5 o=new GmitCollege5();
		o.department(new String[] {"mech","CS","CIVIL"});
		o.ShowCollegeName("GMIT");
		o.ShowUniversityName("VTU");

	}

}
