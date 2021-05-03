
public class Recursion {

	public static int add(int k) {
		if (k > 0) {
			return k + add(k - 1);
		} else {
			return k;
		}
	}

	public static void main(String[] args) {
		
		int value = add(10);
		System.out.println(value);

	}

}
