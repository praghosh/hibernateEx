package package2;

import java.util.*;
import java.util.Map.Entry;
public class MapInterface {
	public static void main(String args[]) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Cricket");
		map.put(2, "Hockey");
		map.put(3, "Archery");
		for (Iterator<Entry<Integer, String>> iterator = map.entrySet().iterator(); iterator.hasNext();) {
			Entry<Integer, String> m = iterator.next();
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
