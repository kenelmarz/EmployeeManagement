package humanResources;

public class Supervisor extends Employee {
	public Supervisor(String name, double salary, int year, int month, int day) {
		super(name, salary, year, month, day);
		
	}
	public void establishesIncentive(double b){
		incentive=b;
	}
	public double giveMeSalary() {
		double salarySupervisor=super.giveMeSalary();
		return salarySupervisor + incentive;
	}
	
	private double incentive;

}
