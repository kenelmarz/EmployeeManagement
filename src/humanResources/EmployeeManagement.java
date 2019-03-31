package humanResources;

public class EmployeeManagement {

	public static void main(String[] args) {
			
		Supervisor supervisorRRHH = new Supervisor("Pedro Jimenez",100000,1980,04,30);
		supervisorRRHH.establishesIncentive(2500);
			
		Employee[] myEmployee= new Employee[6];
			myEmployee[0]=new Employee("Paco Garcia", 85000, 1990, 12, 17);
			myEmployee[1]=new Employee("Ana Lopez", 95000, 1995, 06, 02);
			myEmployee[2]=new Employee("Maria Martin", 105000, 2002, 03, 15);
			myEmployee[3]=new Employee("Sofia Perez");
			myEmployee[4]=supervisorRRHH;
			myEmployee[5]=new Supervisor("Laura Ruiz",120000,1990,05,30);
			
			Supervisor supervisorFinance=(Supervisor) myEmployee[5];
			supervisorFinance.establishesIncentive(500);
			
		for (Employee e:myEmployee) {
			e.increaseSalary(5);
		}
		for (Employee e:myEmployee){
				System.out.println("Nombre: "+ e.giveMeName()  +
					", sueldo: " + e.giveMeSalary()+
					", fecha de alta: "+ e.giveMeContractDate()+"." + 
					"El id de este empleado es "+ e.giveMeId() + "."); 
		}
		for (Employee e:myEmployee) {
			System.out.println(e.giveMeData());
		}		
	}

}

