package fileReader;

public class stringtest {
	public static void main(String[] args)
	{
String s="new Game";
String m=" ";
for(int i=s.length()-1; i>=0; i--)
{
	m=m + s.charAt(i);
}
System.out.println(m);
}
}