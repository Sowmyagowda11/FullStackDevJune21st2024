//3 hyrarchy

package com.Gentech.Inheritance;
class BankName
{
	void BName(String name)
	{
		System.out.println("Bank name is:" +name);
	}
}
class CustomerName  extends BankName
{
	void AccHolderName(String CName)
	{
		System.out.println("customer name is "+CName);
	}
}
class CustomerId extends BankName
{
	void Id(String Cid)
	{
		System.out.println("Customer id is: "+Cid);
	}
}
class AccountNo extends BankName
{
	void ActNo(long AccNo)
	{
		System.out.println("account number is:"+AccNo);
	}
}

public class HyrarchialBank {
	public static void main(String[] args)
	{
		
		CustomerName o1=new CustomerName();
		o1.BName("Karnataka");
		o1.AccHolderName("Lakshmi");
		CustomerId o2=new CustomerId();
		o2.BName("Karnataka");
		o2.Id("Ka73232");
		AccountNo o=new  AccountNo();
		o.BName("Karnataka");
		o.ActNo(879468967);
	}

}
