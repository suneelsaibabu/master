package fileReader;
import java.util.*;
public class list {

public static void main(String[] args)throws Exception
{
	ArrayList<String> l=new ArrayList<String>();
	l.add("A");
	l.add("B");
	l.add("D");
	Iterator itr=l.iterator();
	while(itr.hasNext())
	{
		String s=(String)itr.next();
		if(s == "D")
		{
			itr.remove();
			System.out.println(l);
			
				System.out.println("Thread is in sleep state");
				l.add("M");
				System.out.println(l);
			}
		
		}
		
	}

}
