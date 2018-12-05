package fileReader;
import java.util.*;
import java.util.concurrent.*;
public  class make extends Thread
{
	static CopyOnWriteArrayList<String> l=new CopyOnWriteArrayList<String>();
   public void run()
   {
	   try {
		   Thread.sleep(3000);
	   }catch(Exception e)
	   {
	  
	   }
	   System.out.println("child thread is ready to update" );
	   l.add("C");
   }
 
public static void main(String[] args)throws Exception
{
	l.add("A");
	l.add("B");
	Thread t=new Thread();
	t.start();
	Iterator<String> itr=l.iterator();
	while(itr.hasNext());
	{
	String s=(String)itr.next();
	System.out.println("main thread started executing" +s);
	Thread.sleep(1000);
	}
	System.out.println(l);
}
}