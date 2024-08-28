package com.Gentech.Encapsulation;
class Outer
{
	
    String firstName;
    Inner inner=new Inner();
    void showAge()
    {
        inner.age=22;
        System.out.println("Age:"+inner.age);
    }

    private class Inner

    {
      int age;
    }
    void showFN()
    {
        firstName="Sowmya";
        System.out.println("FirstName:"+firstName);
    }
}
public class OuterClass {
    public static void main(String[] args) {
        Outer outer=new Outer();
        outer.showFN();
        outer.showAge();
    }
}
