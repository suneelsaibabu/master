package assign;

public enum Frequency {
	MONTHLY("montly"), YEARLY("yearly"), QUAATERLY("quaterly");

	private String value;

	Frequency(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public static String getFrequencyValue(String name) {
		for (Frequency fr : Frequency.values())
			if (fr.name().equalsIgnoreCase(name))
				return fr.getValue();
		return null;

	}

}



