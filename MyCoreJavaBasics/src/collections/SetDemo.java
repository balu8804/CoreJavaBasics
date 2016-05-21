package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashMap;

public class SetDemo {

	public static void main(String[] args) {

		String s = "balasubramanyam";

		LinkedHashSet<Character> lhs = new LinkedHashSet<Character>();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		{

			for (char c : s.toCharArray()) {
				System.out.println("Char is: "+c);
				if (hm.get(c) != null) {
					Integer occ = hm.get(c);
					hm.put(c, ++occ);
					if (++occ > 1) {
						// O(1) operation
						lhs.remove(c);
					}
					System.out.println("if: "+hm);
					System.out.println("if: "+lhs);
				} else {
					
					// O(1) operation
					hm.put(c, 1);
					lhs.add(c);
					System.out.println("ELSE hm: "+hm);
					System.out.println("else lhs: "+lhs);
				}
			}
			// O(1) operation
			Iterator<Character> itr = lhs.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next());
				break;
			}
		}
	}
}