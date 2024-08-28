package com.Gentech.Abstract;

abstract class Employee1
{
	abstract void getDetails(String empName,double salary);
}
class Employee2 extends Employee1
{
	String empName;
	double salary;
	void getDetails(String empName,double salary)
	{
		this.empName=empName;
		this.salary=salary;
		System.out.println("Employee Name :"+this.empName);
		System.out.println("salary : "+this.salary);
	}

}
class Employee3 extends Employee2
{
	String empName;
	double salary;
	void getDetails(String empName,double salary)
	{
		super.getDetails(empName,salary);
		this.empName=empName;
		this.salary=salary;
		System.out.println(" 2 Employee Name :"+this.empName);
		System.out.println("2 salary : "+this.salary);
	}
}
public class Abstract5 {

	public static void main(String[] args) {
		Employee3 obj1=new Employee3();
		obj1.getDetails("Rohith", 50000);
		Employee2 obj=new Employee2();
		obj.getDetails("sowmya", 3444.00);
	}
}
