//4 multilevel

package com.Gentech.Inheritance;
class  Box {
	   
	  
	   Box(double w,  double h,  double d)
	   {
	       
	       System.out.println("box width is: "+w);
	       System.out.println("box heigth is: "+h);
	       System.out.println("box depth is: "+d);
	   }
	   
	   
	}
	class  BoxWeight  extends  Box
	{
	   double weight; 
	   
	   BoxWeight(double w,  double h,  double d,  double m)
	   {
	       super(w, h, d);  
	       weight = m;
	       m=w*h*d;
	       System.out.println("weigth is: "+m);
	   }
	}

	
	class  Shipment  extends  BoxWeight 
	{
	   double cost;
  
	   Shipment(double w,  double h,  double d,  double m,  double c)
	   {
	       super(w, h, d, m);  
	       cost = c;
	       System.out.println("Cost of parcel is: "+cost);
	   }
	}

	public class  TestMultilevel
	{
	   public  static  void  main(String args[])
	   {
		     Shipment o=new Shipment(12.2,5.0,5.99,0,1000.00);
	   }
	}
