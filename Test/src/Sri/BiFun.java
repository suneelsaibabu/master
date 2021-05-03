package Sri;

import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;

import Pack.Employee;

public class BiFun {

	public static void main(String[] args) {

		IntBinaryOperator ib=(i1,i2)->i1*i2;
		int v=ib.applyAsInt(2, 3);
		System.out.println(v +" IntBinaryOperator");
		
		IntUnaryOperator un = i -> i * i;
		int value = un.applyAsInt(20);
		System.out.println(value + " unaryOperator value");
		
		LongUnaryOperator va=l->l*l;
		Long la=va.applyAsLong(20);
		
		System.out.println(la +" LongUnaryOperator");
		Employee emp = new Employee("suneel", 2000);
		
		IntConsumer son = (i) -> System.out.println("doubled value is " + i * i);
		son.accept(20);
		
		IntSupplier sup = () -> {
			int[] a = { 1, 2, 3, 4, 5, 6 };
			int rand = new Random().nextInt(a.length);
			System.out.println(rand);
			int b = (int) Math.random() * 10 + rand;
			return b;

		};
		int b = sup.getAsInt();
		System.out.println(b + " random value");

		EmpInfo info = new EmpInfo(30);
		
		BiFunction<Employee, EmpInfo, Integer> bi = (e, t) -> e.getSalary() * t.getEmpWorkDays();

		System.out.println("emp " + emp.getName() + " salary is " + bi.apply(emp, info));

		int sal = bi.apply(emp, info);
		int yearlyIncome = sal * 12;
		System.out.println("yearly salary is " + yearlyIncome);

		IntPredicate p = (i) -> i % 2 == 0;
		int[] values = { 2, 3, 4, 6, 5, 7 };
		for (int i : values) {
			if (p.test(i)) {
				System.out.println(i + " is even");
			}
		}

	}

}
