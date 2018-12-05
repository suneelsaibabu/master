package fileReader;
import java.io.*;
public class serilize implements Serializable {

	int i=10;
	transient int y=20;
}
	class dog
	{
		public static void main(String[] args)throws Exception
		{
			serilize d1=new serilize();
			FileOutputStream fis=new FileOutputStream("/users/BodagalaSuneelsaibabu/desktop/abc.txt");
			ObjectOutputStream op=new ObjectOutputStream(fis);
			op.writeObject(d1);
	
			FileInputStream d=new FileInputStream("/users/BodagalaSuneelsaibabu/desktop/abc.txt");
			ObjectInputStream oos=new ObjectInputStream(d);
			serilize d3=(serilize)oos.readObject();
			System.out.println(d3.i +"  " +d3.y);
	
		}
	}
