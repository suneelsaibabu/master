package fileReader;
import java.sql.*;
import java.lang.*;
public class orclecon {
public static void main(String[] args)
{
	class.forName("oracle.jdbc.oracleDriver");
	Connection con=DriverManager.getConnection("oracle:jdbc:thin:@localhost:1521:xe,root,sumisuni2" );
	Statement st=con.createStatement();
	st.executeUpdate("create table Employee(empNo Number(10),empName Varchar(10),empSal Number(10)");
	st.close();
	
}
}
