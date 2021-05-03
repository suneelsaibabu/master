package assign;

public class Right {
	
	public void myValues(String name) {
		if(name.equalsIgnoreCase("BF"))
		    System.out.println(Values.BF);
	}

	public static void main(String[] args) {
		Right r=new Right();
		r.myValues("bf");
				
	}
}
