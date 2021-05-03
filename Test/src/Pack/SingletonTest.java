package Pack;

public class SingletonTest {
	
	  
	static SingletonTest t = new SingletonTest();

	private SingletonTest() {

	}

	public static SingletonTest getInstance() {
		return t;
	}

	public static void main(String[] args) {
		
		SingletonTest t1=t.getInstance();
		SingletonTest t2=t.getInstance();

	}
}
