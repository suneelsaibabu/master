package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
	
	
	public static void main(String[]args) {
		
		List<Integer> list=new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(35);
		
		
		List<Integer> l1=list.stream()
			.filter(s->s%2==0)
			.collect(Collectors.toList());
		System.out.println(l1);
				
		List<Integer> l2=list.stream()
				.map(s->s*2)
				.collect(Collectors.toList());
		System.out.println(l2);
		
		
	}

}
