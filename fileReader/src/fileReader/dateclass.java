package fileReader;

class dateclass {
public static void main(String[] args)
{
	java.util.Date udate= new java.util.Date();
	System.out.println(udate);
	
	long l=udate.getTime();
	java.sql.Date sqldate=new java.sql.Date(l);
	System.out.println(sqldate);
}
}