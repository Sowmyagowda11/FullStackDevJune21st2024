package com.Gentech.Constructor.NoArgs;
class Employee1
{
		int EmpNo;
		String EmpName;
		String Adress;
		int Phoneno;
		String DOJ;
		int salary;
	
		Employee1()
		{
			EmpNo=11;
			EmpName="Akash";
			Adress="Bengaluru";
			Phoneno=995658875;
			DOJ="2024-05-08";
			salary=12222;
			System.out.println("Empno is:"+EmpNo);
			System.out.println("EmpName is:"+EmpName);
			System.out.println("Adress is:"+Adress);
			System.out.println("Phoneno is:"+Phoneno);
			System.out.println("Date of joining is:"+DOJ);
			System.out.println("salary is:"+salary);
			
	}
}class Department1
{
	int DeptNo;
	String DeptName;
	String Location;
	int WorkingHours;
	int NoOfEmployees;
	Department1()
	{
		DeptNo=11;
		DeptName="Reserch";
		Location="Hassan";
		WorkingHours=9;
		NoOfEmployees=10;
		System.out.println("Deptno is"+ DeptNo);
		System.out.println("DeptName is"+ DeptName);
		System.out.println("Dept location is"+ Location);
		System.out.println("Dept WorkingHours is"+ WorkingHours);
		System.out.println("Dept Number of employees is"+ NoOfEmployees);
		
	}
}
class Insurence1
{
	String InsName;
	int InsNo;
	String InsType;
	int Amount;
	String Duration;
	Insurence1()
	{
		 InsName="LIC";
		 InsNo=100;
		 InsType="HealthCare";
		 Amount=10000;
		 Duration="20 years";
		 System.out.println("InsurenceName is "+InsName);
		 System.out.println("InsurenceNois "+InsNo);
		 System.out.println("Insurence type is:"+InsType);
		 System.out.println("Amount:"+Amount);
		 System.out.println("Duration is:"+Duration);	
	}
}
public class Members1 {
	public static void main(String[] args)
	{
		Employee1 Emp1=new Employee1();
		Department1 Dept1=new Department1();
		Insurence1 Insu1=new Insurence1();
	}

}
