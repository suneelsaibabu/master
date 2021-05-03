
public class Test {

	float a = 2.32f;	
	int b = 2;

	public void add() {
		if(b==3) {
			float c = Math.round(a + b);
			System.out.println(c);
		}		
	}

	public void sub() {
		float c = a - b;
		System.out.println(c);

	}

	public static void main(String[] ars) {
		Test shirish = new Test();
		shirish.add();
		shirish.sub();
	}




///float a=2.13234f
	//double a=3.423432424244423
	//Long d=35.543553453543543453345




}
