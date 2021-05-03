package TimeApi;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Year;

public class Test {
	
	public int mai() {
		System.out.println("this is for stash ");
		return 12;
	}

	public static void main(String[] args) {

		LocalDate ld = LocalDate.now();
		//System.out.println(ld);
		LocalTime lt = LocalTime.now();
		System.out.println(ld +" "+lt);
		
		int month=ld.getMonthValue();
		int day=ld.getDayOfMonth();
		int year=ld.getYear();
		
	System.out.printf("%d-%d- %d",month,day,year );
	System.out.println("suneel stash");
	}

}
 