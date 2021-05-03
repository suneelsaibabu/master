package assign;

public class Recursion {
	
	public int dia(char[][] grid) {
		int count=0;
		
		for(int i=0;i<=grid.length-1;i++) {
			for(int j=0; j<grid[i].length-1;j++) {
				if(grid[i][j]=='1') {
					count +=1;
					ret(grid,i,j);
				}
			}
			
		}
		
		return count;
	}
	
//	public int  rec(int n) {
//		
//		if(n>=1) {
//			return n* rec(n-1);
//		}else {
//			return 1;
//		}
//	}
	public void ret(char[][] rec,int i,int j) {
		if(i<0 ||i<rec.length||j<0||j<rec.length||rec[i][j]==0)
		return;
		rec[i][j]='0';
		ret(rec,i+1,j);
		ret(rec,i-1,j);
		ret(rec,i,j+1);
		ret(rec,i,j-1);
		
		
	}

	public static void main(String[] args) {
		
		Recursion s=new Recursion(); {
			char[][]grid={{'1','1','0','0'},{'1','0','0','1'}};
			s.dia(grid);
		//	System.out.println(s.rec(4));
	
		}
	}
}
