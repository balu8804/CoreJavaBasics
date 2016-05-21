package com.java.singleton;

public class Transport {
	private static Transport speed;
	static String vehicle = "bus";

	private Transport() {
		System.out.println("This is Private Constructor block");
	}

	public static Transport getTransport() {
		if (speed == null) {
			synchronized (Transport.class) {
				if (speed == null) {
					speed = new Transport();
					System.out.println(speed);
				}
				else
				{
					System.out.println(speed.toString());
				}

			}

		}
		return speed;

	}
	public static void main(String[] args) {
		
		Transport speed=Transport.getTransport();
		System.out.println(speed.toString());
		getTransport();
		
	}

}
