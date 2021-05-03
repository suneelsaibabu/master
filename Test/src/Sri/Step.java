package Sri;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Step {

	public static void main(String[] args) {
		List<Character> list = new ArrayList<Character>();
		String name = "suneeeeel";
		int count = 0;
		char[] ch = name.toCharArray();

		for (char c : ch) {
			if (!list.contains(c)) {
				list.add(c);

			} else {
				count++;
				if (count == 1) {
					System.out.println(c + "," + count + "'st' time");

				} else if (count == 2) {
					System.out.println(c + "," + count + "'nd' time");

				} else if (count == 3) {
					System.out.println(c + "," + count + "'rd' time");

				} else {
					System.out.println(c + "," + count + "'th' time");
				}

			}
		}
	}
}
