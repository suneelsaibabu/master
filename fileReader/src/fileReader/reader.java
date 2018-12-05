package fileReader;
import java.io.*;
public class reader {
	private static BufferedReader br;
	private static BufferedReader br1;

	public static void main(String[] args)throws IOException
	{
		PrintWriter pw=new PrintWriter("/users/BodagalaSuneelsaibabu/desktop/file3");
		br = new BufferedReader(new FileReader("/users/BodagalaSuneelsaibabu/desktop/file1"));
		br1 = new BufferedReader(new FileReader("/users/BodagalaSuneelsaibabu/desktop/file2"));
		String line=br.readLine();
		String line1=br1.readLine();
		while((line != null) || (line1 != null))
		{
		if(line != null)
		{
			pw.println(line);
			line=br.readLine();
		}
		if(line1 != null)
		{
			pw.println(line1);
			line1=br1.readLine();
		}
		
		pw.flush();
		br.close();
		br1.close();
		pw.close();
	}

}}
