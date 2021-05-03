import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CallableDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
		ExecutorService es = Executors.newFixedThreadPool(10);
		List<Future<Integer>> list=new ArrayList<>();
		for(int i=0;i<5;i++) {
		Future<Integer> future = es.submit(new Callable(i));
		//int val = future.get();
		list.add(future);
		}
		
		for(Future f:list) {
			System.out.println(f.get(2000,TimeUnit.MILLISECONDS));
		}
	}

}
