package assign;

import java.util.ArrayList;
import java.util.List;

public class Pasical {

	public List<List<Integer>> generat(int numRows){
		
		List<List<Integer>> triangle = new ArrayList<List<Integer>>();
		
		List<Integer> firstrow=new ArrayList<Integer>();
		firstrow.add(1);
		triangle.add(firstrow);
		for(int i=1;i<numRows;i++) {
			List<Integer> prevrow=triangle.get(i-1);
			List<Integer> row=new ArrayList<Integer>();
			row.add(1);

			
		
		for(int j=1; j<i;j++) {
		  row.add(prevrow.get(j-1) + prevrow.get(j));
		  triangle.add(row);
			
		}
		}
		return triangle ;
	}
	
	public static void main(String[] args) {
		Pasical p=new Pasical();
		p.generat(5);
		
	}

}
