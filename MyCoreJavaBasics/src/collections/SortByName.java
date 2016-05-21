package collections;

import java.util.Comparator;

public class SortByName implements Comparator<Student> {

	public int compare(Student a, Student b) {
		// TODO Auto-generated method stub
		return a.name.compareTo(b.name);
	}

}
