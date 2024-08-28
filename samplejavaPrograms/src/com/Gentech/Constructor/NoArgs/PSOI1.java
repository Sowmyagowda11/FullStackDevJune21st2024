package com.Gentech.Constructor.NoArgs;
class Product1 {
    String name;
    int price;
    int ProdID;
    int Quantity;
    String Category;
    
    Product1()
    {
    	name="PHONE";
        price=50000;
        ProdID=1;
        Quantity=1;
        Category="ELECTRONICS";
        System.out.println("PRODUCT NAME : "+name);
        System.out.println("Price"+price);
        System.out.println("PRODUCT ID "+ProdID);
        System.out.println("Quantity: "+Quantity);
        System.out.println("Category: "+Category);
        System.out.println();
    }
}

class Sales1{
    String name;
    int price;
    int SalesID;
    String Address;
    String Status;
    Sales1() 
    {
    	name="ECOMMERCE";
        price=20883;
        SalesID=1;
        Address="BANGALORE";
        Status="COMPLETED";
        System.out.println("SALES NAME : "+name);
        System.out.println("Price"+price);
        System.out.println("Sales ID "+SalesID);
        System.out.println("ADDRESS: "+Address);
        System.out.println("Status : "+Status);
    	System.out.println();
    }
}

class Order1 {
    String name;
    int price;
    int CustomerID;
    String StatusPayment;
    String feedback;
    Order1()
    {
    	name="AMAZON";
        price=36480;
        CustomerID=5001;
        StatusPayment="PAID";
        feedback="GOOD";
        System.out.println("ORDER NAME : "+name);
        System.out.println("Price"+price);
        System.out.println("Customer ID "+CustomerID);
        System.out.println("StatusPayment: "+StatusPayment);
        System.out.println("feedback : "+feedback);
        System.out.println();
    }
}

class Invent1 {
    String name;
    int price;
    int ItemId;
    String Brand;
    String Location;
    Invent1()
    {
    	name="LAPTOP";
        price=299872;
        ItemId=11;
        Brand="HP";
        Location="BANGALORE";
        System.out.println("PRODUCT NAME : "+name);
        System.out.println("Price"+price);
        System.out.println("ItemId "+ItemId);
        System.out.println("Brand: "+Brand);
        System.out.println("Location : "+Location);
    }
}
public class PSOI1 {

	public static void main(String[] args) {
		Product1 product1 = new Product1();
		Sales1 sal1 = new Sales1();
		Order1 ord1 = new Order1();
		Invent1 inv = new Invent1();
	}

}
