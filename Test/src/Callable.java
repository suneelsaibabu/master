

public class Callable implements java.util.concurrent.Callable<Integer> {

	
	private int input;
	
	public Callable(int input) {
		super();
		this.input=input;
	}
	

	@Override
	public Integer call() throws Exception {
		//Thread.sleep(1000);
		int sum=2;
		for(int i=1;i<=input;i++) {
			sum=sum+i;//=1,1+2=3,3+3=6,6+4=10,10+5=15,15+6=21,21+7=28,28+8=36,36+9=45,45+10=55
		}
		return sum;
	}

}
