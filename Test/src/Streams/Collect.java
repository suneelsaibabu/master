package Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Collect{


public static void main(String[] args) {
	List<String> li= new ArrayList<String>();
	li.add("suneel");
	li.add("jef Bezoze");
	li.add("elon musk");
	li.add("mark zukerburg");

	List<String> l1=li.stream().
			filter(s->s.length() >=9).
			collect(Collectors.toList());
			
	System.out.println(l1);
	
	long l = li.stream().filter(s->s.length()>=9)
			.count();
	System.out.println(l);
	
	List<Integer> ll=new ArrayList<Integer>();
	
	ll.add(3);
	ll.add(1);
	ll.add(2);
	ll.add(5);
	ll.add(4);
	ll.stream().forEach(System.out::println);
	ll.stream().forEach(s->System.out.println(s + "musko"));
	
	List<Integer> sort=ll.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
	
	Integer i=ll.stream().min((i1,i2)->i1.compareTo(i2)).get();
	System.out.println(sort);
	System.out.println(i +" is the min value");
	
	
}
}