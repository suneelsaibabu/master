package fileReader;
import java.util.*;
public final class demo {
	    int num = 100;
	    public void calc(int num) {
	        this.num = num * 10;
	    }
	    public void printNum(){
	        System.out.println(num);
	    }
	    public static void main(String[] args) {
	        demo obj = new demo ();
	        obj.calc(2);
	        obj.printNum();
	        
	    }
	   
	    
	}


