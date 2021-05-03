package Pack;

import java.util.Arrays;
import java.util.List;

public class Stream {
	private List<Employee> emp = Arrays.asList(

			new Employee("suneel", 2000), new Employee("srivatsav", 1000), new Employee("jan", 5000));

	public Employee getEmp(String name) {

		return emp.stream()
			.filter(employee -> name.equalsIgnoreCase(employee.getName()))
			.findFirst()
			.orElseThrow(() -> new IllegalStateException("Employee" + name + "not found"));

	}

	public static void main(String[] args) {
      Stream s=new Stream();
   Employee e=s.getEmp("suneel");
   System.out.println(e);
	}

}
