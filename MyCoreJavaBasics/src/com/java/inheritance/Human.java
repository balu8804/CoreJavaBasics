package com.java.inheritance;

public class Human extends Creature {

	public void findTheFeatures() {
		System.out.println(" Human methods: " + super.age);
		behaviour();
	}
       
	void displayfeatures() {
		findTheFeatures();
		super.findTheFeatures();
		System.out.println("Age is"+age);
	}

	public static void main(String[] args) {

		Creature creature = new Creature();
		Human human = new Human();
		creature.findTheFeatures();
		human.findTheFeatures();
		human.displayfeatures();
	}

}
