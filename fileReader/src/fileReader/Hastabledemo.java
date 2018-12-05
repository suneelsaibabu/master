package fileReader;
import java.util.*;


public class Hastabledemo {
	public static void main(String[] args)
	{
		Hashtable<temp,String> t=new Hashtable<temp,String>(25);
		t.put(new temp(2), "sd");
		t.put(new temp(3),"sd");
		t.put(new temp(42),"we");
		
		System.out.println(t);
		Date d=new Date();
		System.out.println(d);
	
	}
}

	
	class temp
	{	
		int i;
		temp(int i)
		{
			this.i=i;
		}
		public int hashcode()
		{
			return i;
		}
		public String toString()
		{
			return i+" ";
		}
	}

