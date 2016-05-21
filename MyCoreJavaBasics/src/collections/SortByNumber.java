package collections;

import java.util.Comparator;



public class SortByNumber implements Comparator<Student> {

	public int compare(Student a,Student b) {
		
		return a.rollno-b.rollno;
	}

}
