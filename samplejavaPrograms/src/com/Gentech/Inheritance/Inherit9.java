//8
package com.Gentech.Inheritance;
class Animal
{
	int Nooflegs;
	int age;
	Animal(int Nooflegs,int age)
	{
		this.Nooflegs=Nooflegs;
		this.age=age;
	}
	void Show()
	{
		System.out.println("1 no of legs is:"+Nooflegs);
		System.out.println("1 animal age is:"+age);
	}
}
class Birds extends Animal
{
	
	Birds( int Nooflegs,int age)
	{
		super(Nooflegs,age);
		
	}
	void Print(int Nooflegs,int age)
	
	{
		super.Show();
		System.out.println("2 no of legs is:"+Nooflegs);
		System.out.println("2 animal age is:"+age);
	}
}
class Human extends Birds
{
	int Nooflegs;
	int age;
	Human(int Nooflegs,int age)
	{
		super(Nooflegs,age);
	}
	void Click(int Nooflegs,int age)
	{
	
		System.out.println(" 3 no of legs is:"+Nooflegs);
		System.out.println("3 animal age is:"+age);
	}
}

public class Inherit9 {
	public static void main(String[] args)
	{
		Human o=new Human(12,3);
		o.Print(9,3);
		o.Click(7,3);
		
	}

}
