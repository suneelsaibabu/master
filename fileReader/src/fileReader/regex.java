package fileReader;
import java.util.Scanner;

public class regex 
{
	public static void main(String[] args)
	{
String original=" ";
String rev=" ";
System.out.println("Enter the string you want to reverse");
Scanner s=new Scanner(System.in);
original=s.nextLine();
StringBuffer sb=new StringBuffer(original);
rev=sb.reverse().toString();
		int len= original.length();
		for(int i=len -1;i>=0;i--) {
			rev=rev +original.charAt(i);
			System.out.println("original string" + "--> "+original);
			System.out.println("reverse of string is" +"--> " +rev);
		}
	}
}
