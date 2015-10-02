//import java.util.HashMap;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;

//import java.util.LinkedHashMap;

public class del3 {

	public static void main(String[] args) {
		NavigableMap<String, Integer> map = new TreeMap<String, Integer>();

		map.put("Anil", 10);
		map.put("Litu", 10);
		map.put("Chintu", 10);
		map.put("Pintu", 10);
		map.put("Asit", 10);
		map.put("KAsit", 10);

		Entry<String, Integer> lastEntry;
		// = map.Entry();

		// Entry<String, Integer> lastEntry = map.lastEntry();

		System.out.println(map);
		int count = 0;
		while (true) {
			lastEntry = map.lastEntry();
			if (lastEntry == null || count == 3) {
				break;

			}
			count++;
			System.out.println(lastEntry);

			// System.out.println(lastEntry.getKey());
			map.remove(lastEntry.getKey());

		}

		System.out.println(map);
	}
}