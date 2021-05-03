import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		int[] x = { 1, 2, 3, 4, 5, 6, 7, 8 };
		Predicate<Integer> p1 = i -> i > 4;
		Predicate<Integer> p2 = i -> i % 2 == 0;
		PredicateTest t = new PredicateTest();
		t.m1(p1, x);
		System.out.println("###############");
		t.m1(p1.negate(), x);
		System.out.println("----------------");
		t.m1(p1.and(p2), x);
		System.out.println("================");
		t.m1(p1.or(p2), x);

		String[] s = { "Sunny", "", null, "kajal", "sunny" };

		Predicate<String> pp = i -> i != null && i.length() != 0;
		List<String> li = new ArrayList<String>();
		for (String ss : s) {
			if (pp.test(ss)) {
				li.add(ss);

			}

		}
		System.out.println(li);

	}

	public void m1(Predicate<Integer> p, int[] x) {

		for (int x1 : x) {
			if (p.test(x1)) {
				System.out.println(x1);
			} else {
				System.out.println("no valid");
			}
		}

	}

}
