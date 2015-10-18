package com.concretepage;

import java.util.*;

public class HashsetTest {

	public static void main (String[] args){
		HashSet<String> hash=new HashSet<>();
		hash.add("a");
		hash.add("z");
		hash.add("devesh");
		hash.add("devesh");
		hash.add("deVesh");
		hash.add("C");
		hash.add("c");
		hash.add("123");
		hash.add("t");
		hash.add("k");

		System.out.println("hash set unsorted");

	    Iterator<String> itr=hash.iterator();
		while(itr.hasNext()){

			System.out.print(itr.next()+"  ");

		}
		System.out.format("\n\n\n");
		System.out.println("Hash set sorted");

		List<String> lli=new ArrayList<String>(hash);
		Collections.sort(lli);
		Iterator<String> rti=lli.iterator();
		while(rti.hasNext())
			System.out.print(rti.next()+"  ");

	}

}
