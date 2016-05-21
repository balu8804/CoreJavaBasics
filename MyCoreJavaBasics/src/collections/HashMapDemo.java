package collections;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put("balu",25.42);
		hm.put("krishna",29.54);
		hm.put("Ramu",45.45);
		hm.put("Davis",46.78);
		hm.put("balu",47.54);
		Set set=hm.entrySet();
		Iterator itr=set.iterator();
		System.out.println(hm);
		while(itr.hasNext())
		{
			 Map.Entry mv=(Entry) itr.next();
			 System.out.println(mv.getKey()+":"+mv.getValue());
			 
		}
		double marks=((Double)hm.get("Ramu")).doubleValue();
		hm.put("krishna", new Double(marks +11.46));
		System.out.println(hm.get("krishna"));

	}

}
