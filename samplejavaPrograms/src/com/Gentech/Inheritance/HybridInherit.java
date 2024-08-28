//hybrid superclass

package com.Gentech.Inheritance;

class Department 
{
    Department(int dno, String Dname)
    {
        System.out.println("Department no is: " + dno);
        System.out.println("Department name is: " + Dname);
    }
}

class Employee1 extends Department 
{
    Employee1(int dno, String Dname) 
    {
        super(dno, Dname);
    }

    void Employee1(int Eno, String Ename, String Dname) {
        System.out.println("Employee no is: " + Eno);
        System.out.println("Employee name is: " + Ename);
        System.out.println("Department name is: " + Dname);
    }
}

class Employee2 extends Department 
{
    Employee2(int dno, String Dname)
    {
        super(dno, Dname);
    }

    void Employee2(int Eno2, String Ename2, String Dname2)
    {
        System.out.println("2nd Employee no is: " + Eno2);
        System.out.println("2nd Employee name is: " + Ename2);
        System.out.println("2nd Department name is: " + Dname2);
    }
}

class EmpAddress extends Employee2 
{
    EmpAddress(int dno, String Dname)
    {
        super(dno, Dname);
    }

     void EmpAddress( String Location) 
    {
     
        System.out.println(" 2nd Employee location is: " + Location);
    }
}

public class HybridInherit 
{
    public static void main(String[] args)
    {
        Employee1 o = new Employee1(11, "Manager");
        o.Employee1(50, "Darshan", "Research");

        EmpAddress o1 = new EmpAddress(12, "Scientist");
        o1.Employee2(51, "Jeevan", "Manager");
        o1.EmpAddress("New York");
    }
}

