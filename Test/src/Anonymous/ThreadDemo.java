package Anonymous;

public class ThreadDemo extends Reverse{

	public static void main(String[] args) throws InterruptedException {
	Reverse s=new Reverse();
	s.reverse("suneel");
		
		
		Runnable r = new Runnable() {
			public void run() {
				for (int i = 0; i <= 10; i++) {
					System.out.println("child thread");
				}
			}
		};
		Thread t= new Thread(r);
		t.start();
		t.join();
		for(int i=0;i<=10;i++) {
			System.out.println("main thread");
		}
		
	}
}

class Reverse{
	
	public void reverse(String name) {
		
		char[] ch=name.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			System.out.println(ch[i]);
		}
	}
	
	
	
}