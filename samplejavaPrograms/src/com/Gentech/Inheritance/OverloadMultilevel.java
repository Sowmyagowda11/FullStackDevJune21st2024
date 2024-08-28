//6 constructor overloading 

package com.Gentech.Inheritance;

class Car {
    Car(int no) {
        System.out.println("Car number is: " + no);
    }
    
    Car(String CName, String OwnerName) {
        System.out.println("Car name is: " + CName);
        System.out.println("Owner name is: " + OwnerName);
    }
    
    Car(String Location) {
        System.out.println("Location of Car is: " + Location);
    }
}

class Bike extends Car {
    Bike(int no) {
        super(no); 
        System.out.println("Bike number is: " + no);
    }
    
    Bike(String CName, String OwnerName) {
        super(CName, OwnerName); 
        System.out.println("Bike name is: " + CName);
        System.out.println("Bike owner name is: " + OwnerName);
    }
    
    Bike(String Location) {
        super(Location); 
        System.out.println("Bike location is: " + Location);
    }
}
class Truck extends Bike 
{
    Truck(int no) {
        super(no); 
        System.out.println("Truck number is: " + no);
    }
    
    Truck(String CName, String OwnerName) {
        super(CName, OwnerName); 
        System.out.println("Truck name is: " + CName);
        System.out.println("Truck owner name is: " + OwnerName);
    }
    
    Truck(String Location) {
        super(Location); 
        System.out.println("Truck location is: " + Location);
    }
}


public class OverloadMultilevel {
    public static void main(String[] args) {
        
        Truck b1 = new Truck(123);
        Truck b2 = new Truck("Harley", "John Doe");
        Truck b3 = new Truck("California");
   
       
    }
}
