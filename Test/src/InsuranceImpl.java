import java.util.Scanner;
import java.util.function.Function;

public class InsuranceImpl {

	public static void main(String[] args) {
    String str="suneel  from  united  statas ";
   Function<String,Integer> fun=v->v.length()-v.replace(" ", "").length();
     int op=fun.apply(str); 
    System.out.println(op);
		Insurance i = () -> {
			int x = 20;
			System.out.println("please  give  your  id ");
			Scanner s = new Scanner(System.in);
			int y = s.nextInt();
			x += y;

			System.out.println("my insurance id is ->" + x);

		};

		Runnable r = () -> System.out.println("main method");
		Thread t = new Thread(r);
		t.start();
		i.getInsurenceId();

	}

}
