package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ArrayCollections {

	public static void main(String args[]) {

		HashMap hm = new HashMap();
		// Put elements to the map
		hm.put("Zara", new Double(3434.34));
		hm.put("Mahnaz", new Double(123.22));
		hm.put("Ayan", new Double(1378.00));
		hm.put("Daisy", new Double(99.22));
		hm.put("Qadir", new Double(-19.08));

		Set set=hm.entrySet();
		Iterator i=set.iterator();
		
		while(i.hasNext())
		
		{
			Map.Entry me=(Entry) i.next();
			System.out.print(me.getKey()+":");
			System.out.println(me.getValue());

			
		}
		double balance=((Double)hm.get("Qadir")).doubleValue();
		hm.put("Qadir",new Double(balance+100) );
		System.out.println("Qadir new balance : "+hm.get("Qadir"));
		}
}