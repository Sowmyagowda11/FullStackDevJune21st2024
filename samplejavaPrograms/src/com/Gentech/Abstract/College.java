package com.Gentech.Abstract;

 abstract class Sports
 {
	 static void sports(String SportsName)
	 {
		System.out.println("Sports name is "+SportsName);
	 }
	 static void CulturalActivity(String  Activityname)
	 {
		 System.out.println("activity name is:"+Activityname);
	 }
	 static void Participates(int members)
	 {
		 System.out.println("number of members is:"+members);
	 }
	 
 }
public class College {
	public static void main(String[] args)
	{
		Sports.sports("Kho KHo");
		Sports.CulturalActivity("Dance");
		Sports.Participates(6);
	}

}
