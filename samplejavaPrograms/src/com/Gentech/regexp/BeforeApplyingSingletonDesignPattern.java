package com.gentech.regexp;
class Maths1
{
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
}
public class BeforeApplyingSingletonDesignPattern {
	public static void main(String[] args) {
		Maths1 o1=new Maths1();
        o1.addition(20,40);
        o1.multiplication(12,10);

        Maths1 o2=new Maths1();
        o2.addition(130,50);
        o2.multiplication(15,9);

        Maths1 o3=new Maths1();
        o3.addition(25,75);
        o3.multiplication(20,15);

	}

}
