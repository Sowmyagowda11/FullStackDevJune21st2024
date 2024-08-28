package com.Gentech.programs;
class Country
{
	String CountryName; 
}
class State
{
	String StateName;
}
class Distric
{
	String DistricName;
}
class Village
{
	String VillageName;
}
public class CSDV {
	public static void main(String args[])
	{
		Country CName=new Country();
		CName.CountryName="India";
		System.out.println("Country name is:"+CName.CountryName);
		State SName=new State();
		SName.StateName="Karnataka";
		System.out.println("State name is:"+SName.StateName);
		Distric DName=new Distric();
		DName.DistricName="Ramanagara";
		System.out.println("State name is:"+DName.DistricName);
		Village VName=new Village();
		VName.VillageName="Harihara";
		System.out.println("Village name is:"+VName.VillageName);

}
}
