
public class Threading implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i <= 2; i++) {
			System.out.println("child thread");
			Thread.yield();
		}

	}

	public static void main(String[] args) throws InterruptedException {

		//System.out.println(Thread.currentThread().getName());
		Threading td = new Threading();
		Thread t = new Thread(td);
		t.start();
		
		for(int i=0; i<=2;i++) {
			System.out.println("main thread");
		}
		
	}

}

//Thread t=new Thread();
//Thread t1=new Thread(Runnable r);
//Thread t1=new Thread(String name);
//Thread t1=new Thread(Runnable r,String name);
//Thread t1=new Thread(ThreadGroup t,Runnable r);