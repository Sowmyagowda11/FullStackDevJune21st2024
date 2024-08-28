package com.Gentech.Encapsulation;
class Outer2
{
    int age;
    InnerStatic2 o=new InnerStatic2();
    void showName()
    {
        o.name="Sowmya";
        System.out.println("Name:"+o.name);
    }

    static class InnerStatic2
    {
        String name;
    }
    void showAge()
    {
        age=17;
        System.out.println("age: "+age);
    }
}
public class StaticInner
{
    public static void main(String[] args)
    {
        Outer2 obj=new Outer2();
        obj.showAge();
        obj.showName();
    }

}
