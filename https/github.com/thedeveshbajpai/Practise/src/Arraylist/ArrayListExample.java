package Arraylist;
import java.util.*;

public class ArrayListExample {
   public static void main(String args[]) {
      /*Creation of ArrayList: I'm going to add String
       *elements so I made it of string type */
	  ArrayList<String> obj = new ArrayList<String>();

	  /*This is how elements should be added to the array list*/
	  obj.add(null);
	  obj.add(null);
	  obj.add("Chaitanya");
	  obj.add("Steve");
	  obj.add("Anuj");

	  /* Displaying array list elements */
	  System.out.println("Currently the array list has following elements:"+obj);

	  /*Add element at the given index*/
	  obj.add(0, "Rahul");
	  obj.add(1, "Justin");

	  /*Remove elements from array list like this*/
	  obj.remove("Chaitanya");
	  obj.remove("Harry");

	  System.out.println("Current array list is:"+obj);

	  /*Remove element from the given index*/
	  obj.remove(1);

	 for (ListIterator<String> iterator = obj.listIterator(obj.size()); iterator.hasPrevious();) {
		  final Object listElement = iterator.previous();
		  System.out.println("Previous= "+listElement);
		}
	 ListIterator<String> itr=obj.listIterator();
	  while(itr.hasNext()){

		  System.out.println("ARRAYLIST NEXT= "+itr.next());
	  }
	  System.out.println("Current array list is:"+obj);
   }
}