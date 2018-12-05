package fileReader;
import java.util.Scanner;
public class StudentOperationsimpl {
public static void addStudents(student [] student, Scanner scanner) {
	for(int i=0; i<student.length;i++) {
		student[i]=new student();
		
		System.out.println("Enter roll no");
		int rollno=scanner.nextInt();
		student[i].setRollNo(rollno);
		
		System.out.println("Id");
		int id=scanner.nextInt();
		student[i].setId(id);
		
		System.out.println("Age");
		int age=scanner.nextInt();
		student[i].setAge(age);
		
		System.out.println("name");
		scanner.nextLine();
		String name=scanner.nextLine();
		student[i].setName(name);
	}
}
public static void displayStudent(fileReader.student [] student) {
	System.out.println("RollNo" +"\t"+"ID"+"\t"+"Name"+ "\t" + "Age");
	System.out.println("*************************************");
	for(int i=0;i<student.length;i++) {
		System.out.println(student[i].getRollNo()+"\t"+student[i].getId()+"\t"+student[i].getName()+"\t"+student[i].getAge());
	}
}
public static void updateStudent(student[] student,Scanner scanner) {
	System.out.println("enter roll number");
	int rollno =scanner.nextInt();
	for(int i=0; i<student.length;i++) {
		if(student[i].getRollNo()==rollno) {
			System.out.println("Enter new name");
			scanner.nextLine();
			String updateName =scanner.nextLine();
			student[i].setName(updateName);
			System.out.println("Enter new age");
			int updateAge =scanner.nextInt();
			student[i].setAge(updateAge);
		}
	}
}
}
