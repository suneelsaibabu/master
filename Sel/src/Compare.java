import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

import javax.tools.Tool;

public class Compare implements Runnable {

	public Tool tol;

	List<Integer> l;

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		if (name.equals("Thread-0")) {
			l = new ArrayList<Integer>();
			l.add(22);
			l.add(20);
			l.add(24);
			Collections.sort(l, (obj1, obj2) -> {
				if (obj1 > obj2) {
					return -1;
				} else if (obj2 < obj2) {
					return +1;
				} else {
					return 0;

				}

			});

		}
		System.out.println(l);
	}

	public Boolean getTollDeatail() {

		Predicate<Collection> p = i ->i.isEmpty();
		
		return p.test(l);

	}

	public static void main(String[] args) throws InterruptedException {
		Compare c = new Compare();
		Thread t = new Thread(c);
		t.start();
		t.sleep(2000);
		t.join();
		System.out.println("array list is sorted");
		Thread t1 = new Thread(c);
		t1.start();

		System.out.println(c.getTollDeatail());
	}

}
