import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparatar{

 
//collection comparator interface is having only one method
	// which is single asbstract method 
	//in java 8 if we have single method we can go for lamda expression
	//comparator interface is having is one method that is compare method
	
	
	
	public void compare() {
		List<Integer> li=new ArrayList<Integer>();
		li.add(1);
		li.add(3);
		li.add(4);
		li.add(5);
		li.add(2);
		
		Collections.sort(li,(i1,i2)->(i1>i2)?-1:(i1<i2)?+1:0);
		//Collections.sort(li,(i1,i2)->i1.compareTo(i2));
		
		System.out.println(li);
		
	}
	
	
	
	public static void main(String[] args) {
		
		Comparatar c=new Comparatar();
		c.compare();
	}
	
}

//class MyComp implements Comparator<Integer>{
//	
//	@Override
//	public int compare(Integer obj1, Integer obj2) {
//		if(obj1> obj2) {
//			return -1;
//		}
//		else if(obj1<obj2) {
//			return +1;
//		}else {
//			return 0;
//		}
//	}
//	
//}


	

	

