package objectoriented;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaTutStreams {
	
	public static void main(String []args) {
		
		// Generate a range of values from One to Ten. 
		List<Integer> oneToTen = IntStream.rangeClosed(1,10).boxed().collect(Collectors.toList());
		
		// Use Map to get squares of the values 
		List<Integer> squares =  oneToTen.stream().map(x-> x*x ).collect(Collectors.toList());
		
		for(Integer x : squares) System.out.println(x);
		
		// Filter the values to only even nos. 
		List<Integer> evens = oneToTen.stream().filter(x->(x%2)==0).collect(Collectors.toList());
		for(Integer x:evens) System.out.println("Evens :"+x);
		
		// Limit the stream ot 5 nos 
		IntStream limitTo5 = IntStream.range(1,10).limit(5);
		limitTo5.forEach(System.out::println);
		//(Integer x: limitTo5) System.out.print(x);
		
		//Peform a reduce operation on the list(Multiply all the values together)
		int multAll = IntStream.range(1,5).reduce(1,(x,y)-> (x*y));
		System.out.println("Multi all :"+multAll);
		
		// Generate a double stream 
		DoubleStream stream = IntStream.range(1,5).mapToDouble(x->x);
		stream.forEach(System.out::println);
		
		IntSummaryStatistics iStats = IntStream.range(1,10).summaryStatistics();
		System.out.println("Average :"+iStats.getAverage());
		System.out.println("Sum :"+iStats.getSum());
		System.out.println("Min :"+iStats.getMin());
		System.out.println("Max :"+iStats.getMax());
		
	}

}
