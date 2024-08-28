package com.Gentech.Constructor.NoArgs;
class Student1
{
	String StdName;
	String RigNo;
	int Phnno;
	String Address;
	String ParentName;
	int ParentPhnno;
	Student1()
	{
		StdName="DARSHAN";
		RigNo="4MG20CS043";
		Phnno=90373937;
		Address="Attiguppe";
		ParentName="Raju";
		ParentPhnno=83363363;
		System.out.println("StdNAme is:"+StdName);
		System.out.println("RigNo is:"+RigNo);
		System.out.println("Phonenum is:"+Phnno);
		System.out.println("Parent name is:"+ParentName);
		System.out.println("Parent phone no is:"+ParentPhnno);		
	}
}
class Library1
{
	String LibName;
	String Location;
	int LibId;
	int NoOfBooks;
	Library1()
	{

		LibName="Physics";
		Location="Jaynagar";
		LibId=100;
		NoOfBooks=20000;
		System.out.println("Lib name is:"+LibName);
		System.out.println("Lib Location is:"+Location);
		System.out.println("Lib Id is:"+LibId);
		System.out.println("Lib no of books is:"+NoOfBooks);
		
	}
}class Sports1
{
	 int SportsId;
	 String SportsName;
	 String Item;
	 String Participate;
	 Sports1()
	 {
		 int SportsId=1000;
		 String SportsName="khokho";
		 String Item="poll";
		 String Participate="Rahul";
		 System.out.println("Sportsid :"+SportsId);
		 System.out.println("SportsNameS:"+SportsName);
		 System.out.println("Sportsitem:"+Item);
		 System.out.println("Participate:"+Participate);
	 }
}
class ComputerLab1
{
	int Labid;
	int Noofsystem;
	String Faculty;
	String Rule;
	ComputerLab1()
	{
		Labid=1;
		Noofsystem=100;
		Faculty="Rani";
		Rule="Turn of System before leave";
		System.out.println("Lab id is:"+Labid);
		System.out.println("No of system:"+Noofsystem);
		System.out.println("rule is:"+Rule);
		System.out.println("Faculty is:"+Faculty);
		
	}
}	 
		 
public class College {
	public static void main(String args[])
	{
	Student1 Std1=new Student1();
	Library1 lib1=new Library1();
	Sports1 sp1=new Sports1();
	ComputerLab1 Comp1=new ComputerLab1();
	}
}
