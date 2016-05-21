package com.java.objects;
import java.util.*;

public class Square implements Shape {
	
public void findTheArea()
{
	Scanner scanner=new Scanner(System.in);
	System.out.println("Square :");
	System.out.println("Enter the Side Value");
	double side=scanner.nextDouble();
	double area=(side*side);
	System.out.println("Area of Square is: "+area);
}
}
