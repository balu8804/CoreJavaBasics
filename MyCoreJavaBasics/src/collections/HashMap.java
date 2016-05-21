package collections;
import java.util.*;

public  class HashMap implements Map {
	
	

	public static void main(String[] args) {
		 //ArrayList 
	      List a1 = new ArrayList();
	      a1.add("Zara");
	      a1.add("Mahnaz");
	      a1.add("Ayan");
	      System.out.println(" ArrayList Elements");
	      System.out.print("\t" + a1);

	      //LinkedList
	      List l1 = new LinkedList();
	      l1.add("Zara");
	      l1.add("Mahnaz");
	      l1.add("Ayan");
	      System.out.println();
	      System.out.println(" LinkedList Elements");
	      System.out.print("\t" + l1);

	      //HashSet
	      Set s1 = new HashSet(); 
	      s1.add("Zara");
	      s1.add("Mahnaz");
	      s1.add("Ayan");
	      System.out.println();
	      System.out.println(" Set Elements");
	      System.out.print("\t" + s1);

	      //HashMap
	      Map m1 = new HashMap(); 
	      m1.put("Zara", "8");
	      m1.put("Mahnaz", "31");
	      m1.put("Ayan", "12");
	      m1.put("Daisy", "14");
	      System.out.println();
	      System.out.println(" Map Elements");
	      System.out.print("\t" + m1);
	   }
		// TODO Auto-generated method stub

	public void clear() {
		// TODO Auto-generated method stub
		
	}

	public boolean containsKey(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean containsValue(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public Set entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object get(Object arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	public Set keySet() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object put(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	public void putAll(Map arg0) {
		// TODO Auto-generated method stub
		
	}

	public Object remove(Object arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Collection values() {
		// TODO Auto-generated method stub
		return null;
	}

	}


