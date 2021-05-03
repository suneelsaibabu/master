package Pack;

import java.util.Optional;

public class Optionals {

	public String value(String name) {

		Optional<String> val = Optional.ofNullable(name);
		String va = val.orElse("no value in the name field");
		return va;
	}

	public static void main(String[] args) {
		Optionals o = new Optionals();
	String name=o.value(null);
	
		System.out.println(name);

	}
}
