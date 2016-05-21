package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Compare {

	public static void main(String[] args) {
		ArrayList<Student> arraylist = new ArrayList<Student>();
		arraylist.add(new Student(20, "balu", "Hyderabad"));
		arraylist.add(new Student(45, "Lanka", "California"));
		arraylist.add(new Student(30, "Kumar", "Secunderabad"));
		System.out.println( "UnSorted List are: ");
		for(int i=0;i<arraylist.size();i++)
		{
			System.out.println(arraylist.get(i));
		}
		Collections.sort(arraylist,new SortByNumber());
		System.out.println("Sorted by RollNumber");
		for(int i=0;i<arraylist.size();i++)
		{
			System.out.println(arraylist.get(i));
		}
		Collections.sort(arraylist,new SortByName());
		System.out.println("Sorted By Name are: ");
		for(int i=0;i<arraylist.size();i++)
		{
			System.out.println(arraylist.get(i));
		}
	}

}
