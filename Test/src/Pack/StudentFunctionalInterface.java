package Pack;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class StudentFunctionalInterface {

	public static void main(String[] args) {

		Function<StudnetInfo, String> st = s -> {
			if (s.getMarks() > 35 && s.getMarks() < 50) {
				return "C Grade";
			} else if (s.getMarks() > 50 && s.getMarks() < 70) {
				return "B Grade";
			} else if (s.getMarks() > 70) {
				return "A Grade";
			}
			return "";

		};

		List<StudnetInfo> l = new ArrayList<StudnetInfo>();

		l.add(new StudnetInfo("suneel", 95));
		l.add(new StudnetInfo("Shirish", 55));
		l.add(new StudnetInfo("Kushal", 45));
		System.out.println("list of all pass students");
		System.out.println("-------------------------");
		for (StudnetInfo s : l) {
			if (s.getMarks() >= 35) {
				String grade = st.apply(s);
				String name = s.getName();
				System.out.println(name.toUpperCase() + " is holding "+"''" + grade.toUpperCase() +"''"+" and his score is " +s.getMarks());
			}
		}

	}
}

class StudnetInfo {

	String name;

	int marks;

	public StudnetInfo(String name, int marks) {
		this.name = name;
		this.marks = marks;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

}