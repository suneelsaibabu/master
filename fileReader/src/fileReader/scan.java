package fileReader;
import java.util.*;
public class scan {
public static void main(String[] args)
{
	int[] x=new int[3];
         x[0]=1;
         x[1]=2;
         x[2]=3;
	System.out.println(x.getClass().getName());
	
	{
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
	}
}
}