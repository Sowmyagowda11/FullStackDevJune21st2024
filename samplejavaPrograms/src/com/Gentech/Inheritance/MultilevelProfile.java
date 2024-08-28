//1 multilevel
package com.Gentech.Inheritance;
class InstagramProfile
{
	void Name(String UserName)
	{
		System.out.println("Username is:"+UserName);
	}
}
class InstaProf extends InstagramProfile
{
	void PassWord(String password)
	{
		System.out.println("password is:" +password);
	}
}
class Insta extends InstaProf
{
	void Phnono(int PhoneNumber)
	{
		System.out.println("phone no is:"+PhoneNumber);
	}
}
class Instagram extends Insta
{
	void  EmailId(String email)
	{
		System.out.println("Email is:" +email);
		
	}
}

public class MultilevelProfile {
	public static void main(String[] args)
	{
		Instagram o=new Instagram();
		o.Name("sowmya_gowdaa");
		o.PassWord("sowmya@123");
		o.Phnono(990182016);
		o.EmailId("sowmyagowda561@gmail.com");
		
	}

}
