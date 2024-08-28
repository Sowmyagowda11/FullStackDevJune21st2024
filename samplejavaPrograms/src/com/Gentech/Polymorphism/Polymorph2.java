package com.Gentech.Polymorphism;
abstract class ProgrammingSkills
{
	abstract void skills(String name);
}
class Clanguage extends ProgrammingSkills
{
	void skills(String name)
	{
		System.out.println(name+"  is have very much knowledge about C language");
	}
}
class Python extends ProgrammingSkills 
{
	void skills(String name)
	{
		System.out.println(name+" is have very much knowledge about python language");
	}
}
class java extends ProgrammingSkills
{
	void skills(String name)
	{
		System.out.println(name+"  is have very much knowledge about java language");
	}
}

public class Polymorph2 
{
public static void main(String[] args) 
{
	ProgrammingSkills o=null;
	Clanguage o1=new Clanguage();
	Python o2=new Python();
	java o3=new java();	
	o=o1;
	o.skills("Darshan");
	o=o2;
	o.skills("jeevan");
	o=o3;
	o.skills("Vishal");

}

}
