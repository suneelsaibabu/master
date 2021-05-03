package assign;

public class reduce {
	
public void map() {
	
	int[] a=new int[10];
	for(int i=0; i<=9;i++) {
		
		a[i]=i;
		
	}
		for( int s:a) {
			
			System.out.println(s+1);
		}
	


}
public static void main(String[] args) {
	reduce r=new reduce();
	r.map();
}
}
