package objectoriented;

import java.util.ArrayList;
import java.util.Arrays;

public class GenericsTut {
	
	public static void main(String []args) {
		// Check the difference in the type declarations int is Integer boolean is Boolean
		String [] strs = {"Musoke","Micah", "Muluuta,", "James"};
		Integer [] nos = {1,2,3,4,5,5,6};
		Boolean [] bls = {true, false, true, false};
		ArrayList<Integer> arraylis = new ArrayList<>(Arrays.asList(1,2,3,3,4,4,5,5));
		
		MyGeneric<Integer> test = new MyGeneric<Integer>();
		test.setVal(12);
		System.out.println("Class generic :"+test.getVal());
		
		MyGeneric<String> str = new MyGeneric<String>();
		str.setVal("Mose");
		System.out.println("Class generic :"+str.getVal());
		
		
		printStuff(strs);
		printStuff(nos);
		printStuff(bls);
		Arraylists(arraylis);
		
		
	}
	// This function takes in any type either strings or doubles 
	public static <E> void printStuff(E [] arr) {
		
		for(E x: arr) System.out.println(x);
	}
	
	public static void Arraylists(ArrayList<?> al) {
		
		for(Object x:al) System.out.println("ArrayList :"+x);
	}
	
}

class MyGeneric<T>{
	
	T val;
	
	public void setVal(T val) {
		this.val = val;
	}
	
	public T getVal() {
		return val;
	}
	
}
