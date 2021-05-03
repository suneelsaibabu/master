package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectStream {

	public static void main(String[] args) {

		List<String> li = new ArrayList<String>();
		li.add("suneel");
		li.add("chiranjeevi");
		li.add("balayya");
		li.add("nagrjuna");

		List<String> list = li.stream().filter(s -> s.length() >= 9).collect(Collectors.toList());
		System.out.println(list);

		Long l = li.stream().filter(s -> s.length() >= 7).count();
		System.out.println(l);

		List<Integer> lis = new ArrayList<Integer>();
		lis.add(10);
		lis.add(1);
		lis.add(3);
		lis.add(2);

		List<Integer> list1 = lis.stream().sorted((i1, i2) -> -i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(list1);
	}
}
