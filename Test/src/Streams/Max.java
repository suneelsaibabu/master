package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Max {
	
	public static void main(String[] args) {
		
		List<Integer> li=new ArrayList<Integer>();
		
		li.add(10);
		li.add(5);
		li.add(20);
		li.add(25);
		
		int maxValue=li.stream()
				.max((i1,i2)->i1.compareTo(i2))
				.get();
		System.out.println(maxValue);
		 	
		int minValue=li.stream()
				.min((i1,i2)->i1.compareTo(i2))
				.get();
		System.out.println(minValue);
				Stream<Integer> s=Stream.of(1,22,333,4444,5555);
				s.forEach(System.out::println);

	Integer[] d= {1,23,4,5,6,7};
	Stream<Integer> s1=Stream.of(d);
	s1.forEach(System.out::println);
	
	}

}
