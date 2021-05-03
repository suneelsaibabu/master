import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class PredicatVerification {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int[] val = { 4, 5, 6, 7, 8 };

		List<Integer> li = new ArrayList<Integer>();
		for (int a : arr) {
			for (int va : val) {
				if (a == va) {
					li.add(a);
					break;
				}
			}
		}
		System.out.println(li);
		for (int vals : li)
			System.out.println("values which are in common between both the array objects are " + vals);

	}
}
