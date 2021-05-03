package Pack;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Functional {

	public void increment(List<Employee> l) {
		List<Employee> emp = new ArrayList<Employee>();
		Predicate<Employee> p = e -> e.getSalary() < 2000;
		Function<Employee, Employee> f = s -> {

			int inc = s.getSalary() + 1000;
			s.setSalary(inc);
			return s;

		};
		for (Employee e : l) {
			if (p.test(e)) {
				Employee ee = f.apply(e);
				emp.add(ee);
			}
		}
		System.out.println(emp);
	}

	public static void main(String[] args) {

	Function<Integer, Integer> i=s->s+s;
	Function<Integer, Integer> x=s->s*s;
	
	System.out.println(i.andThen(x).apply(2));
	System.out.println(i.compose(x).apply(2));
		
		List<Employee> l = new ArrayList<Employee>();
		l.add(new Employee("suneel", 1000));
		l.add(new Employee("srivatsav", 1000));
		l.add(new Employee("srujan", 2000));

		Functional func = new Functional();
		func.increment(l);

	}

}
