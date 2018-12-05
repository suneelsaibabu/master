package fileReader;
import java.io.*;
public class test {
public static  void main(String[] args)throws IOException, ClassNotFoundException
{
	
	Student01 s1=new Student01(0, null, null);

	
	String yes = "yes";
	String no="no";
	try {
	FileOutputStream fos=new FileOutputStream("users/BodagalaSuneelsaibabu/desktop/student.src");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s1.sc.nextInt());
		oos.writeObject(s1.sc.next());
		oos.writeObject(s1.sc.next());
	

		System.out.println("do you want to one more object to file then enter yes or press no" );
		if(s1.sc.next()==yes) {
			oos.writeObject(s1.sc.next());
			oos.writeObject(s1.sc.next());
			oos.writeObject(s1.sc.nextInt());
		}else if(s1.sc.nextLine()==no) {
			System.out.println("Thank you");
		}
		System.out.println("StudentName  \tStudentStream \tStudentId");
		System.out.println("=========================================");
		FileInputStream  fis=new FileInputStream("users/BodagalaSuneelsaibabu/desktop/student.src");			
		ObjectInputStream ois=new ObjectInputStream(fis);
		Student01 student=(Student01)ois.readObject();
		System.out.println(student.getstudentName() +"\t" +student.getStudentId() +"\t" +student.getStudenStream());
	}
        catch(IOException e ) 
        {
		System.out.println("sorry");
	}
}

}