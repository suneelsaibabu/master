package fileReader;
import java.util.Scanner;

public class Buffer 
{
	public static void main(String[] args)
	  	{
		String original=" ";
		String rev=" ";
		System.out.println("Enter the strign you want to reverse");
		Scanner s=new Scanner(System.in);
		original=s.nextLine();
		StringBuffer sb= new StringBuffer(original);
		 rev=sb.reverse().toString();
		 for(int i= original.length() -1; i>=0; i--)
		 {
			 rev=rev+original.charAt(i);
			 System.out.println("this is the original string--->"+original);
			 System.out.println("this is the reverse string--->" +rev);
		 }
	  	}
	  	}