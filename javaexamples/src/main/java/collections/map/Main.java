package collections.map;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String [] args) {
		/**
		 * Can a Map have duplicate values? No, unless a custom Map was implemented.
		 * From docs:
		 * If the map previously contained a mapping for the key, the old value is replaced
		 * by the specified value. (A map m is said to contain a mapping for a key k
		 * if and only if m.containsKey(k) would return true.
		 */
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(0, "zero");
		map1.put(1, "one");
		map1.put(1, "oneDup");
		map1.put(2, "two");

		/**
		 * Output is:
		 * 0 zero
		 * 1 oneDup
		 * 2 two
		 */
		for(Map.Entry<Integer, String> m : map1.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
}
