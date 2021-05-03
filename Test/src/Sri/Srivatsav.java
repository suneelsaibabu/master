package Sri;

public class Srivatsav {

	private String firstName = "Srivatsav";
	private String lastName = "raju";

	public String UserDetails(String firstName) {
		if (firstName.equalsIgnoreCase("srivatsav")) {

			System.out.println(this.firstName);
			System.out.println(this.lastName);
		}
		return firstName;

	}

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				Synchro obj = Synchro.getInstance();

			}
		});
		Thread t2 = new Thread(() -> {
			Synchro obj1 = Synchro.getInstance();
			System.out.println("t2 executed");
		});

		t1.start();
		t1.join();
		t2.start();

		Test1 t = new Test1();
		t.test();
	}

}

class Synchro {

	public static Synchro s = null;

	private Synchro() {
		System.out.println("private block executed");

	}

	public static Synchro getInstance() {
		if (s == null) {
			synchronized (Synchro.class) {
				if (s == null) {
					s = new Synchro();
					System.out.println("object initiated");
				}
			}

		}
		return s;
	}
}

//the main advantage of maintaing threads 
//in the form of thread group is we can 
//perform common operations versy easly 

class Test1 {

	public void test() {
		System.out.println(Thread.currentThread().getThreadGroup().getName());
	}

}