package fileReader;
import java.util.*;
public class map {
	public static void main(String[] args)
	{
		HashMap<Integer,String> s=new HashMap<Integer,String>();
		testMap(s);
		 System.out.println(s.getClass().getName());
	}
public static void testMap(HashMap<Integer,String> map) {
	map.put(3,"suneel");
    map.put(2, "sudhakar");
    map.put(1, "kalyani");
    map.put(0, "sumanth");
    for(Integer Key: map.keySet())
    {
    String nam=map.get(Key);
    System.out.println(Key +".." +nam);
}
   
}
}