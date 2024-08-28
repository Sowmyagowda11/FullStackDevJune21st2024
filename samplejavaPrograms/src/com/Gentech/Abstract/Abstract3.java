package com.Gentech.Abstract;

abstract class AbstractClass 
{
    {
        System.out.println("Instance block executed");
    }
}
class birds extends AbstractClass 
{
	
}

public class Abstract3
{
    public static void main(String[] args)
    {
        birds instance = new birds();
    }
}

