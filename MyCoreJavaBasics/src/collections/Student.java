package collections;
import java.util.*;

public class Student {
	int rollno;
	String name, address;

	Student(int rollno, String name, String address) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;

	}

	public String toString() {
		return this.rollno + " " + name + " " + address + " ";

	}

}
