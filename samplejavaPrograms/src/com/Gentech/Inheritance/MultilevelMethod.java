package com.Gentech.Inheritance;

class Student {
    String name;

    Student(String name) {
        this.name = name; 
        System.out.println("Student name is: " + name);
    }

    void StudentName() {
        System.out.println("Student name is: " + name);
    }
}

class Student2 extends Student 
{
    String name;

    Student2(String name) 
    {
        super(name);  
        this.name = name; 
    }

    
    void StudentName(String name)
    {
    	super.StudentName();
        System.out.println("Second Student name is: " + name);
    }
}

class Student3 extends Student2 {
    String name;

    Student3(String name) {
        super(name); 
        this.name = name; 
    }

    
    void StudentName(String name) 
    {
    	super.StudentName();
        System.out.println("Third Student name is: " + name);
    }
}

public class MultilevelMethod {
    public static void main(String[] args) {
        Student3 o = new Student3("Sowmaya");
       ( (Student2)o).StudentName("Sneha");
        o.StudentName("Darshan");
    }
}


