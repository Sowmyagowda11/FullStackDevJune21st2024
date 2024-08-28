package com.Gentech.OOpstest;

abstract class Collage 
{
    Collage() 
    {
        System.out.println("it is super collage");
    }

    //abstract void show();
}
interface University 
{
    void display();
}
interface Libarary
{
    void print();
}
class Sports extends Collage implements University, Libarary {
    Sports() 
    {
        System.out.println("Sportsname");
    }

   // @Override
   // void show() {
    //    System.out.println("it is ");
   // }

    @Override
    public void display() {
        System.out.println("It is university");
    }

    @Override
    public void print() {
        System.out.println("It is library");
    }
}

public class oops2 {

	public static void main(String[] args) 
	{
		Sports d=new Sports();
		d.display();
		d.print();
		//d.show();

	}

}
