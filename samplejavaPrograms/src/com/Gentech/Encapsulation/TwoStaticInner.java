package com.Gentech.Encapsulation;
class Outer4
{
    String name;
    void showMarks1()
    {
        Inner4a inner4a=new Inner4a();
        inner4a.marks1=45;
        System.out.println("Marks1 = "+inner4a.marks1);
    }
    void showMarks2()
    {
        Inner4b inner4b=new Inner4b();
        inner4b.marks2=48;
        System.out.println("Marks2 = "+inner4b.marks2);
    }

    static class Inner4a
    {
        int marks1;
    }
    static class Inner4b
    {
        int marks2;
    }
    void showName()
    {
        name="Aishwarya";
        System.out.println("name:"+name);
    }
}
public class TwoStaticInner {
    public static void main(String[] args) {
        Outer4 o4=new Outer4();
        o4.showName();
        o4.showMarks1();
        o4.showMarks2();
    }

}
