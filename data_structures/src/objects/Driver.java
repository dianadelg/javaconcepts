package objects;

public class Driver {
	public static void main(String[] args) {
		Employee diana = new Employee("Diana", "Application Developer", 80000);
	
		Employee[] employees = new Employee[3];
		employees[0] = new Employee("Kyle", "Application Developer", 80000);
		employees[1] = diana;
		employees[2] = new Employee("Alexa", "Supply Chain Analyst", 61000);
		
		for(int i = 0; i < employees.length; i++) {
			System.out.println(employees[i]);
		}
		
		Office ADP_Roseland = new Office("ADP - Roseland", 1);
		Employee e = employees[0];
		//Employee e = new Employee ("Kyle", "Software Engineer", 100000);
		ADP_Roseland.addEmps(e); //add already created object Kyle OR
		ADP_Roseland.addEmps("Lisa", "QA Analyst", 45000);
		ADP_Roseland.printEmps();
		
		//get inner object (Employee) name
		int index = ADP_Roseland.getEmpIndex("Kyle");
		Employee e2 = ADP_Roseland.getEmp(index);
		//could technically combine these two methods
		
		e2.setName("Diana");
		
		System.out.println("--------------------");
		ADP_Roseland.printEmps();
		

	
	}
}
