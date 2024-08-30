package com.gentech.regexp;
class Maths2
{
	static Maths2 obj=null;
	private Maths2()
	{
		//private constructor
	}
    void addition(int x,int y)
    {
        int res=(x+y);
        System.out.println("Addition Result:"+res);
    }
    void multiplication(int x,int y)
    {
        int res=(x * y);
        System.out.println("Multiplication Result:"+res);
    }
    
    public static Maths2 getInstance()
    {
    	if(obj==null)
    	{
    		obj=new Maths2();
    	}
    	return obj;
    }
}
public class SingletonDesignPatternDemo {

	public static void main(String[] args) {
		Maths2 o1=Maths2.getInstance();
        o1.addition(20,40);
        o1.multiplication(12,10);

        Maths2 o2=Maths2.getInstance();
        o2.addition(130,50);
        o2.multiplication(15,9);

        Maths2 o3=Maths2.getInstance();
        o3.addition(25,75);
        o3.multiplication(20,15);
        
        if(o1==o2 && o2==o3)
        {
        	System.out.println("We have achieved Singleton");
        }
        else
        {
        	System.out.println("We have not achieved Singleton");
        }

	}

}
