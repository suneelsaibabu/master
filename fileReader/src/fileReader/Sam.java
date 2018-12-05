package fileReader;
import java.io.*;
public class Sam implements Serializable
{
	int i=10;
	transient int j=20;

}
class dogDemo
{
	public static void main(String[] args)throws Exception
	{
		Sam s=new Sam();
		FileOutputStream fos= new FileOutputStream("/users/BodagalaSuneelsaibabu/desktop/abc.ser");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(s);
		
		FileInputStream fis= new FileInputStream("/users/BodagalaSuneelsaibabu/desktop/abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Sam s1=(Sam)ois.readObject();
		System.out.println(s1.i +"  " +s1.j);
				
	}
}