package hashMaptest;

import java.util.HashMap;

public class hashmaptest {

	public static void main(String args[]){

	HashMap<Number,String> hm=new HashMap<>();

		Integer one=new Integer(1);
		hm.put(new Double("2"),"d");
		hm.put(one,"e");
		System.out.println("hashmaptest.main()"+hm);
	}
}
