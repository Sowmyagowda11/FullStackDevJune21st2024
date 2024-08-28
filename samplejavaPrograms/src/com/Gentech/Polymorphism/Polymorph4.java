package com.Gentech.Polymorphism;
abstract class Paymentmethod
{
	abstract void payment(String name);
}
class payment1 extends Paymentmethod
{
	void payment(String name)
	{
		System.out.println(name+" payment");
	}
}
class payment2 extends Paymentmethod
{
	void payment(String name)
	{
		System.out.println(name+"  payment");
	}
}
class payment3 extends Paymentmethod
{
	void payment(String name)
	{
		System.out.println(name+" payment");
	}
}

public class Polymorph4
{
public static void main(String[] args) 
{
	Paymentmethod o=null;
	payment1 o1=new payment1();
	payment2 o2=new payment2();
	payment3 o3=new payment3();	
	o=o1;
	o.payment("Google-pay");
	o=o2;
	o.payment("PhonePay");
	o=o3;
	o.payment("Phaytm");

}

}