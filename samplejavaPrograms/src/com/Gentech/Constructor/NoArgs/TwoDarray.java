package com.Gentech.Constructor.NoArgs;
class Twod
{
	void array(char ch[][])
	{
		String con=" ";
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<ch[i].length;j++)
			{
				con+=ch[0][j];
				
			}System.out.println(con+" ");
		break;
		}
		
	}
}

public class TwoDarray {
	public static void main(String[] args)
	{
		char b[][]= {{'c','b','r'},{'z','s','d'}};
		Twod o2=new Twod();
		o2.array(b);
		
		
	}

}
