package com.Gentech.Abstract;


abstract class Animal
{
    abstract String getCollegeName();// does not contain body
}


class ConcreteCollege extends Animal 
{
   
    String getCollegeName() 
    {
        return "Gentech Academy";
    }
}

public class Abstract4 {
    public static void main(String[] args) {
        ConcreteCollege college = new ConcreteCollege();
        System.out.println("Academy name is: " + college.getCollegeName());
    }
}