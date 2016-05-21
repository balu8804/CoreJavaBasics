package com.java.inheritance;

class Creature {
	 private static String name = "Balasubramanyam";
	final int age = 20;
	final String pancardnumber = "";

	 protected void findTheFeatures()

	{

		System.out.println("The behaviour of Creatures");
		System.out.println("Name is: " +name);
		System.out.println("Age is " + age);

	}
	protected void behaviour()
	{
		System.out.println("method for behaviour");
	}
}
