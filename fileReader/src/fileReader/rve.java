package fileReader;
import java.util.*;
public class rve {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		String reverse=" ";
		for(int i=s1.length()-1; i>=0; i--) {
			
			reverse=reverse+s1.charAt(i);
			System.out.println(reverse);
		}
	}

}
