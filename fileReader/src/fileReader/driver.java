package fileReader;
import java.sql.*;
public class driver 
{
public static void main(String[] args)throws Exception
{
	class.forName("oracle.jdbc.oracleDriver");
	Connection con=DriverManager.getConnection("oracle:jdbc:thin:@localhost:1521:xe, root,sumisuni2");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from movies");
			while(rs.next()) {
				System.out.println("rs.getInt(1) +\t +rs.getString(2)");
			}
			st.close();
}

}
