	package fileReader;
import java.io.*;
import java.util.Scanner;
public class Student01  implements Serializable
{
	Scanner sc=new Scanner(System.in);
 int studentId=sc.nextInt();
 
 String stdentName=sc.next();
 String studentStream=sc.next();
 

public Student01(int studentId, String StudentName,String StudentStream) {
	this.studentId=studentId;
	this.stdentName=StudentName;
	this.studentStream=StudentStream;
}
public int getStudentId() {
	return studentId;
	
}
public void setStudentId(int StudentId) {
	this.studentId=StudentId;
}
public String getstudentName() {
	return stdentName;
}
public void setStudentName(String StudentName) {
	this.stdentName=StudentName;
}
public String getStudenStream() {
	return studentStream;
}
public void setStudentStream(String studentStream) {
	this.studentStream=studentStream;
}
}
