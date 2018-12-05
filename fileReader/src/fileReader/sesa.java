package fileReader;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
public class sesa {

	public static void main(String[] args) {
		ArrayList s=new ArrayList();
		s.add("suneel");
		s.add("Sun");
	System.out.println(" My fav game is");
	
    for( int i=s.addAll(s); i<=0; i++) 
    {
    	
    	System.out.println(i);
    	
    }
    System.out.println(s);

    Iterator itr=s.iterator();
    while(itr.hasNext())
    {
    	String l=(String)itr.next();
    	System.out.println(l);
    }
    

	         System.out.print("COD" +" "   +"\n" +"nfs"+" "   +"\n" +"mk9");
	         
		
}
}