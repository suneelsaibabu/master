package Pack;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Otp<T extends Number> {

	ArrayList<T> list = new ArrayList<T>();

	public void addElement(T val) {
		list.add(val);
	}

	public void removeElement(T val) {
		list.remove(val);
	}
	
	public void getElements() {
		for(T l:list) {
			System.out.println(l);
		}
	}

	@Override
	public String toString() {
		return list.toString();
	}

}
