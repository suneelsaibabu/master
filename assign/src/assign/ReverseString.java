package assign;

public class ReverseString {
	public void reverse(String name) {
		String str = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			char ch = name.charAt(i);
			str = str + ch;

		}
		System.out.println(str);
	}

	public static void main(String[] args) {
		ReverseString rs = new ReverseString();
		rs.reverse("suneel");

	}
}
