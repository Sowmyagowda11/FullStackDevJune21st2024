package com.Gentech.programs;
class Employee
{
	int EmpNo;
	String EmpName;
	String Adress;
	int salary;
}
class Depertment
{
	int Deptno;
	String DeptName;
}
class Insurence
{
	int InsurenceNo;
	String InsurenceName;
	String InsurenceType;
}

public class Members {

	public static void main(String[] args) {
		Employee EmpDetais=new Employee();
		 EmpDetais.EmpNo=1;
		 EmpDetais.EmpName="Santhosh";
		 EmpDetais.Adress="Bengaluru";
		 EmpDetais.salary=12000;
		 System.out.println("Empno is :"+EmpDetais.EmpNo);
		 System.out.println("EmpName is :"+EmpDetais.EmpName);
		 System.out.println("Emp Adress is :"+EmpDetais.Adress);
		 System.out.println("Emp Salary is :"+EmpDetais.salary);
		 Depertment DeptDetails=new Depertment(); 
		 DeptDetails.Deptno=15;
		 DeptDetails.DeptName="Manager";
		 System.out.println("Deptno is :"+DeptDetails.Deptno);
		 System.out.println("DeptName is :"+DeptDetails.DeptName);
		 Insurence InsurenceDetails=new Insurence();
		 InsurenceDetails.InsurenceNo=200;
		 InsurenceDetails.InsurenceName="JeevaVima";
		 InsurenceDetails.InsurenceType="lifeTime";
		 System.out.println("insurence no :"+InsurenceDetails.InsurenceNo);
		 System.out.println("insurence name is:"+InsurenceDetails.InsurenceName);
		 System.out.println("insurence type is:"+InsurenceDetails.InsurenceType);
	}
	
}

	
