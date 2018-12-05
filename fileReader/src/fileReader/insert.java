package fileReader;
import java.util.*;
import java.sql.*;
/*
**@this is jdbc programm***
*first load and fergister driver class****
*create connection between application and database***
*create a statement object***
*then get resultSet, if it is select quary***
*if it is not select quarry get int updateCountfor non select quarry**
*
*
*/ 
public class insert {
	public static void main(String[] args)throws Exception
	{
		   
		Connection con=DriverManager.getConnection("jdbc:mysql:///employeedb","root", "root");
		Statement st=con.createStatement();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Employer name");
		String ename=sc.next();
		System.out.println("enter employer number");
		int enumb=sc.nextInt();
		System.out.println("enter employer address");
		String eadd=sc.next();
		System.out.println("enter employer salary");
		double esal=sc.nextDouble();
		while(true)
		{
			String sqlQur=String.format("insert into employee values('%s',%i,'%s',%d)",ename,enumb,eadd,esal);
			st.executeUpdate(sqlQur);
			System.out.println("do you wnat to insert more values into the database[Yes/No]");
			String user=sc.next();
			if(user.equalsIgnoreCase("no"))
			{
				break;
			}
		}
	}

}
