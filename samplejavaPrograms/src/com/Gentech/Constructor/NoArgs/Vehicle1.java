package com.Gentech.Constructor.NoArgs;
class TwoWheeler1
{
	 String TwoWhName;
	 String TwoWhNo;
	 String TwoWhColor;
	 String Owner;
	 int Amount;
	 TwoWheeler1()
	 {
		 TwoWhName="Rx";
		 TwoWhNo="KA0836";
		 TwoWhColor="Black";
		 Owner="Akash";
		 Amount=10000;
		 System.out.println("TwoWhaname:"+TwoWhName);
		 System.out.println("TwoWhaNo:"+TwoWhNo);
		 System.out.println("twoWhColor:"+TwoWhColor);
		 System.out.println("TwoWhowner:"+Owner);
		 System.out.println("Amount is:"+Amount);
	 }
}class FourWheeler1
{
	 String FourWhName;
	 String FourWhNo;
	 String FourWhColor;
	 String Owner;
	 int Amount;
	 FourWheeler1()
	 {
		 FourWhName="Thar";
		 FourWhNo="KA083FF";
		 FourWhColor="RED";
		 Owner="VINU";
		 Amount=13000; 
		 System.out.println("FourWhaname:"+FourWhName);
		 System.out.println("FourWhaNo:"+FourWhNo);
		 System.out.println("FourWhColor:"+FourWhColor);
		 System.out.println("FourWhowner:"+Owner);
		 System.out.println("Amount is:"+Amount);
		 
	 } 
}
class HeavyVehicle1
{
	 String HeavyVehicleName;
	 String HeavyVehicleNo;
	 String HeavyVehicleColor;
	 String Owner;
	 int Amount;
	 HeavyVehicle1()
	 {
		 HeavyVehicleName="JCB";
		 String HeavyVehicleNo="KA096F";
		 String HeavyVehicleColor="Yellow";
		 String Owner="Madumitha";
		 int Amount=13333; 
		 System.out.println("HeavyVehiclename:"+HeavyVehicleName);
		 System.out.println("HeavyVehicleNo:"+HeavyVehicleNo);
		 System.out.println("HeavyVehicleColor:"+HeavyVehicleColor);
		 System.out.println("HeavyVehicleowner:"+Owner);
		 System.out.println("Amount is:"+Amount);
	 } 
}


public class Vehicle1 {
	public static void main(String[] args)
	{
		TwoWheeler1 Wh2=new TwoWheeler1();
		FourWheeler1 Wh4=new FourWheeler1();
		HeavyVehicle1 HeavyVeh=new HeavyVehicle1();
	}

}

