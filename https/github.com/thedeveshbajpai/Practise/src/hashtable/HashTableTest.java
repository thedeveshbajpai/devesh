package hashtable;

import java.util.Hashtable;

public class HashTableTest {

	public static void main(String[] args) {

		/*in hashtable null key or value is not allowed gives nullpointer exception, and if same is
		 * used twice then first value is overwritten*/

		Hashtable<String, String> hst=new Hashtable<String, String>();
		hst.put("de", "123");
		hst.put("de","100");
		hst.put("sw","234");
		System.out.println("HashTableTest contains= "+hst.contains("234"));
		System.out.println("HashTableTest containsValue= "+hst.containsValue("100"));
		System.out.println("HashTableTest containsKey= "+hst.containsKey("de"));
		System.out.println("HashTableTest= "+hst);
		hst.remove("de");
		System.out.println("new HashTableTest= "+hst);


	}

}
