package com.Gentech.Polymorphism;
abstract class Language
{
	abstract void Mothertongue(String name);
}
class language1 extends Language
{
	void Mothertongue(String name)
	{
		System.out.println(name+"  is her Mothertongue");
	}
}
class language2 extends Language
{
	void Mothertongue(String name)
	{
		System.out.println(name+"   is her Mothertongue");
	}
}
class language3 extends Language
{
	void Mothertongue(String name)
	{
		System.out.println(name+"  is her Mothertongue");
	}
}

public class Polymorph3 
{
public static void main(String[] args) 
{
	Language o=null;
	language1 o1=new language1();
	language2 o2=new language2();
	language3 o3=new language3();	
	o=o1;
	o.Mothertongue("Kannada");
	o=o2;
	o.Mothertongue("English");
	o=o3;
	o.Mothertongue("Hindi");

}

}