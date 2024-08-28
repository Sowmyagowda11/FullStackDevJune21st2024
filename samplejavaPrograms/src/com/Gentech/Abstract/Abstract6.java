package com.Gentech.Abstract;

abstract class School1
{
	int schoolId;
	String schoolName;
	abstract void getName(String schoolName);
	School1(String schoolName)
	{
		this.schoolName=schoolName;
		System.out.println("school name :"+this.schoolName);
	}
	School1(int schoolId)
	{
		this.schoolId=schoolId;
		System.out.println("school id :"+this.schoolId);
	}
}
class Student1 extends School1
{
	int age;
	String studentName;
	
	Student1(int id)
	{
		super(id);
	}
	Student1(String studentName,int age)
	{
		super("GECK");
		this.age=age;
		this.studentName=studentName;
		System.out.println("student name :"+this.studentName);
		System.out.println("student age :"+this.age);
	}
	void getName(String schoolName)
	{
		System.out.println("school name :"+schoolName);
	}
}
class Library1 extends Student1
{
	String bookName;
	int bookId;
	Library1(int id)
	{
		super(id);
	}
	
	Library1(String studentName,int age,String bookName,int bookId)
	{
		super(studentName,age);
		this.bookId=bookId;
		this.bookName=bookName;
		System.out.println("book name :"+this.bookName);
		System.out.println("Book id :"+this.bookId);
	}
}
public class Abstract6 {

	public static void main(String[] args) {
		Library1 obj1=new Library1("Rahul",23,"design",1001);
		obj1.getName("Geck");
		Library1 obj2=new Library1(10);
	}

}