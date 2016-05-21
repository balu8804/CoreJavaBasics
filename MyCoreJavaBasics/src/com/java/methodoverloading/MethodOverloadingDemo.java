package com.java.methodoverloading;

public class MethodOverloadingDemo {
	public void addingTheNumbers()
	{
		int a=10;;
		int b=5;
		int c=a+b;
		System.out.println("Reault is :"+c);
	}
     public void addingTheNumbers(int a,int b)
     {
    	 
    	  int c=a+b;
    	 System.out.println("result is:"+c);
     }
	public static void main(String[] args) {
		MethodOverloadingDemo methodoverloading=new MethodOverloadingDemo();
		methodoverloading.addingTheNumbers();
		methodoverloading.addingTheNumbers(40, 60);

	}

}
