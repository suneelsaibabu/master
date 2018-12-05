package fileReader;
import java.util.Scanner;
public class StudentTest {
	public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of the student list");
        int size = scanner.nextInt();
        student student[] = new student[size];
        StudentOperationsimpl.addStudents(student,scanner);
        StudentOperationsimpl.displayStudent(student);
        StudentOperationsimpl.updateStudent(student,scanner);
        StudentOperationsimpl.displayStudent(student);
}
}