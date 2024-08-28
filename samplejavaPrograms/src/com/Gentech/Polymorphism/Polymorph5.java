package com.Gentech.Polymorphism;
abstract class singing
{
	abstract void sing(String name);
}
class typeofSinging1 extends singing
{
	void sing(String name)
	{
		System.out.println("she sing "+name);
	}
}
class typeofSinging2 extends singing
{
	void sing(String name)
	{
		System.out.println("she sing "+name);
	}
}
class typeofSinging3 extends singing
{
	void sing(String name)
	{
		System.out.println("she sing "+name);
	}
}

public class Polymorph5
{
public static void main(String[] args) 
{
	singing o=null;
	typeofSinging1 o1=new typeofSinging1();
	typeofSinging2 o2=new typeofSinging2();
	typeofSinging3 o3=new typeofSinging3();	
	o=o1;
	o.sing("Devotional songs");
	o=o2;
	o.sing("Love songs");
	o=o3;
	o.sing("Feeling songs");

}

}