package com.Gentech.programs;

class TwoWheeler
{
	String WheelerName;
	String WheelerNo;
	String Owner;
}
class FourWheeler
{
	String FourWheelerName;
	String FourWheelerNo;
	String FourWheelerOwner;
}
class HeavyVehicle
{
	String HeavyVehicleName;
	String HeavyVehicleNo;
	String HeavyVehicleOwner;
}

public class Vehicle {
	public static void main(String[] args)
	{
		TwoWheeler TwoWhDetails=new TwoWheeler();
		TwoWhDetails.WheelerName="NS200";
		TwoWhDetails.WheelerNo="KA975F";
		TwoWhDetails.Owner="Vinay";
		 System.out.println("2Wheelervehicle name is :"+TwoWhDetails.WheelerName);
		 System.out.println("2Wheelervehicle no  is :"+TwoWhDetails.WheelerNo);
		 System.out.println("2Wheelervehicle of owner is :"+TwoWhDetails.Owner);
		FourWheeler FourWhDetails=new FourWheeler(); 
		FourWhDetails.FourWheelerName="Car";
		FourWhDetails.FourWheelerNo="KA97865F";
		FourWhDetails.FourWheelerOwner="Vinay";
		 System.out.println("vehicle name is :"+FourWhDetails.FourWheelerName);
		 System.out.println("vehicle no  is :"+FourWhDetails.FourWheelerNo);
		 System.out.println("owner of vehicle is :"+FourWhDetails.FourWheelerOwner);
		 HeavyVehicle HeavyWhDetails=new HeavyVehicle(); 
		 HeavyWhDetails.HeavyVehicleName="Truck";
		 HeavyWhDetails.HeavyVehicleNo="KA97865F";
		 HeavyWhDetails.HeavyVehicleOwner="vijith";
			 System.out.println("vehicle name is :"+HeavyWhDetails.HeavyVehicleName);
			 System.out.println("vehicle no  is :"+HeavyWhDetails.HeavyVehicleNo);
			 System.out.println("owner of vehicle is :"+HeavyWhDetails.HeavyVehicleOwner);
			 
	}

}
