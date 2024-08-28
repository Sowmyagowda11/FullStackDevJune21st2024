package com.Gentech.Polymorphism;

abstract class AnimalSounds
	{
		abstract void sounds();
	}
	class DogSound extends AnimalSounds
	{
		void sounds()
		{
			System.out.println("dog sound like :bow bow");
		}
	}
	class CatSound extends AnimalSounds 
	{
		void sounds()
		{
			System.out.println("Cat sound like:meow meow");
		}
	}
	class CowSounds extends AnimalSounds
	{
		void sounds()
		{
			System.out.println("cow sound:moo moo");
		}
	}

public class Polymorph1 
{
		


	public static void main(String[] args) 
	{
		AnimalSounds o=null;
		DogSound o1=new DogSound();
		CatSound o2=new CatSound();
		CowSounds o3=new CowSounds();
		
		o=o1;
		o.sounds();
		o=o2;
		o.sounds();
		o=o3;
		o.sounds();

	}

}
