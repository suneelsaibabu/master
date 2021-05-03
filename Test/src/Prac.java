
public class Prac implements Interf1 {

	public void test() {
		System.out.println("suneel");
	}

	public static void eat() {
		System.out.println("suneel is eating");
	}

	public void m1() {
		System.out.println("my own implemntation");
	}

	public void m2() {
		Interf1.super.m1();
	}

}
