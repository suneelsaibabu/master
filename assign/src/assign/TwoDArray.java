package assign;

public class TwoDArray {
	public void printValues() {
	int[][] values= {
			{1,2,3},
			{4,5,6},
			{7,8,9},
			};
	
		for(int i=0; i<values.length;i++) {
			for(int k=0; k<values[i].length;k++) {
				System.out.print(values[i][k] + " ");
				
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		TwoDArray t=new TwoDArray();
		t.printValues();
		
	}

}
