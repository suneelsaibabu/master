package Sri;

public class EmpInfo {

	private int empWorkDays;

	public EmpInfo(int empWorkDays) {
		this.empWorkDays = empWorkDays;
	}

	@Override
	public String toString() {
		return "EmpInfo [empWorkDays=" + empWorkDays + "]";
	}

	public int getEmpWorkDays() {
		return empWorkDays;
	}

	public void setEmpWorkDays(int empWorkDays) {
		this.empWorkDays = empWorkDays;
	}

}
