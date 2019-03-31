package humanResources;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {
	public Employee(String name, double salary, int year, int month, int day) {
		nameEmployee=name;
		salaryEmployee=salary;
		GregorianCalendar calendar=new GregorianCalendar(year, month-1, day);
		contractRegistration=calendar.getTime();
		id=idNext;
		idNext++;
		id=idNext;
		
	}
	public Employee(String name) {
		this(name, 30000, 2000, 01, 01);
	} 
	public String giveMeName() {
		return nameEmployee;
	}
	public double giveMeSalary() {
		return salaryEmployee;
	}
	public Date giveMeContractDate() {
		return contractRegistration;
	}
	public int giveMeId() {
		return id+1;
	}
	
	public void increaseSalary (double porcentaje) {
		double increase=salaryEmployee*porcentaje/100;
		salaryEmployee+=increase;
	}
	public static String giveMeidNext() {
		return "El Id Siguiente es: " + idNext;
	}
	public String giveMeData(){
		return "El nombre es: "+nameEmployee+", el id es: "+ id +"."; 
	}
	
	private String nameEmployee;
	private double salaryEmployee;
	private Date contractRegistration;
	private int id;
	private static int idNext=1;
}
