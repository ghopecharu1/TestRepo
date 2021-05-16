package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Collections1 {

	public static void main(String[] args) {
		
		ArrayList<String> mylist = new ArrayList<String>(); //for using multiple datatypes in array..useArrayList<ClassA> and then add objects.
		
		
		mylist.add("Raj");
		mylist.add("Tina");
		mylist.add("Geeta");
		mylist.add("Deeps");
		mylist.add("Uma");
		
		ArrayList<Integer> intlist = new ArrayList<Integer>();
		intlist.add(1);
		intlist.add(2);
		intlist.add(2);
		intlist.add(2);
		intlist.add(2); //done..
		System.out.println(intlist);
		System.out.println(mylist);
		
		Collections.sort(mylist);
		
		System.out.println("After sorting: "+mylist);
		
		Collections.sort(mylist,Collections.reverseOrder());
		
		System.out.println("After desc order: "+mylist);
		
	    Stack<String> mystack = new Stack<String>();
	    
	    mystack.push("abc");
	    mystack.push("xyz");
	    mystack.pop();
	    mystack.push("pqr");
	    System.out.println("Stack: "+mystack);
	}

}
