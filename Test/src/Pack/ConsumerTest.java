package Pack;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);

		Consumer<Integer> c = s -> {
			if (s > 20) {
				System.out.println(s);
			}
		};

		for (int val : l) {
			c.accept(val);
		}
	}
}
