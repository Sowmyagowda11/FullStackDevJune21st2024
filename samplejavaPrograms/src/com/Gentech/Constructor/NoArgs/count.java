package com.Gentech.Constructor.NoArgs;
class Count1
{
	void count2()
	{
		 int count=0;
		for(int i=50;i<=150;i++)
		{
			if(i%6==0)
			{
				count++;
			}
		}System.out.println("count is:" +count);
	}
}
public class count {
	public static void main(String args[])
	{
		Count1 o=new Count1();
		o.count2();
	}

}
