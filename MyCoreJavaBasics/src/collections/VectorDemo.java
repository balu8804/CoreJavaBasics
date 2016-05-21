package collections;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
      Vector<Comparable> vector=new Vector<Comparable>();
      vector.add(5);
      vector.add("balu");
      vector.add(5.5);
      vector.add('a');
      vector.add(false);
      vector.add(5.98);
      System.out.println(vector);
      if(vector.contains(null))
      {
    	  System.out.println(vector.firstElement());
      }
      else
      {
    	  System.out.println(vector.indexOf("balu"));
      }
      
	}

}
