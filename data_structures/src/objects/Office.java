package objects;

import java.util.ArrayList;

public class Office {
	//where each office has many employees
	private ArrayList<Employee> emps;
	private int officeCode;
	public String officeName;
	
	public Office(String officeName, int officeCode) {
		this.emps = new ArrayList<Employee>();
		this.officeName = officeName;
		this.officeCode = officeCode;
	}
	
	public boolean addEmps(Employee emp) {
		//must add object
		//return if success or not
		boolean successful=emps.add(emp);
		return successful;
	}
	
	//alternatively
	public boolean addEmps(String name, String job, int salary) {
		Employee newEmp = new Employee(name, job, salary);
		this.emps.add(newEmp);
		return true;
	}
	
	public ArrayList<Employee> getEmps() {
		return emps;
	}
	
	public int getEmpIndex(String name){
		//returns index where employee is in list
		
		for(int i=0; i<emps.size(); i++) {
			if(emps.get(i).getName().equals(name)){
				return i;
			}
		}
		return -1;
	}
	
	public Employee getEmp (int index) {
		return emps.get(index);
	}

	public void setEmps(ArrayList<Employee> emps) {
		this.emps = emps;
	}

	public int getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(int officeCode) {
		this.officeCode = officeCode;
	}

	public String getOfficeName() {
		return officeName;
	}

	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}

	public void printEmps() {
		System.out.println("Employees are: ");
		for(Employee e: emps) {
			System.out.println(e.toString());
		}
	}


}
