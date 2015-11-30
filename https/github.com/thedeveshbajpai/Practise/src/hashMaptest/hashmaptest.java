package hashMaptest;

import java.util.HashMap;
import java.util.Iterator;

public class hashmaptest {

	public static void main(String args[]){

	HashMap<Number,String> hm=new HashMap<>();

		Integer one=new Integer(1);
		hm.put(new Double("2"),"d");
		hm.put(one,null);
		hm.put(null,"dev");
		hm.put(null,"devNew");
		System.out.println("hashmaptest.main()"+hm);
		Iterator itr=hm.entrySet().iterator();
		while(itr.hasNext()){
			System.out.print(" "+itr.next());
		}
	}
}
