package fileReader;
import java.util.*;
public class arrylist {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("suneel");
		al.add("kalyani");
		al.add("sumanth");
		al.add("sudhakar");
		System.out.println("size of the array list are" +al.size());
		System.out.println("array list values");
		System.out.println("-------------------------");
		System.out.println(al);
		System.out.println("        ");
		System.out.println("Array list values are listed below");

	
		System.out.println("======================================");
		for(String alist: al) {
			System.out.println(alist);
		}
		al.add(0,"durga");
		System.out.println("  ");
		System.out.println("Size of array list after adding a value" +"  " +al.size());
		System.out.println(al.get(0));
		System.out.println("   ");
		for(String am: al) {
			System.out.println(am);
		}
	}
}
