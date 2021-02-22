package objectoriented;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lambdas {
	
	public static void main(String[]args) {
		
		ArrayList<Integer> oneToFive = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		// Similar Lambda functions as in python 
		oneToFive.forEach(x -> System.out.println("Multiplied by 2:"+x*2));
		// These are similar lambda functions as in python. 
		oneToFive.forEach(x->{if (x%2==0) System.out.println("Evens :"+x); });
		
		List<Integer> fib = new LinkedList <Integer>();
		
		fib = Stream.iterate(new int [] {0,1}, 
				t -> new int [] {t[1], t[0]+t[1]}).limit(10).map(n->n[0])
				.collect(Collectors.toList());
		
		fib.forEach(x->System.out.println("Fibs :" + x));
		
		
	}

}
