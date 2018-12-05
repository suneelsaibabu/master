package fileReader;

public class heapmemory {
public static void main(String[] args) {
	double mb=1024*1024;
	Runtime r=Runtime.getRuntime();
	System.out.println("maxmemory:" +r.maxMemory()/mb);
	System.out.println("total memory:" +r.totalMemory()/mb);
	System.out.println("free memory:" +r.freeMemory()/mb);
	System.out.println("available memory:"+r.availableProcessors()/mb);
	System.out.println("occupied memory:" +(r.totalMemory()-r.freeMemory())/mb);
}
}
