
public class Employee {
	int x = 20;

	public void m2() {
		interf i = () -> {
			int x = 10;
			System.out.println(x);
		};
		i.m1();

	}

	public static void main(String[] args) throws InterruptedException {
		Employee e = new Employee();
		e.m2();
	}
}

interface interf {

	public void m1();
}