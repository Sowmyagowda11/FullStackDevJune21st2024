//8

package com.Gentech.Inheritance;

class Coach {
    String name;
    String DOB;

    Coach(String name,String DOB)
    {
        this.name = name;
        this.DOB=DOB;
    }

    void show() 
    {
        System.out.println("Student name is: " + name);
        System.out.println("Student Dob is:"+DOB);
    }
}
class CoachB extends Coach
{
    CoachB(String name, String DOB)
    {
        super(name, DOB);
    }

    void printName(String name, String DOB) 
    {
        super.show();
        System.out.println("Second Student name is: " + name);
        System.out.println("Second Student DOB is: " + DOB);
    }
}

class CoachC extends CoachB 
{
    CoachC(String name, String DOB) 
    {
        super(name, DOB); 
    }

    void CoachName(String name, String DOB)
    {
    	
        System.out.println("Third Student name is: " + name);
        System.out.println("Third Student date of birth is: " + DOB);
    }
}
public class StudentMultilevel {
    public static void main(String[] args) {
       CoachC o = new CoachC("Sowmya", "04/08/2002");
       
        o.printName("Krishna","9/08/2021");
        o.CoachName("Manasa","09/3/2022");
        
    }
}

