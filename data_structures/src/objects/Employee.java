package objects;

public class Employee {
	private String name;
	private String job;
	private int salary;
	
	//constructor
	public Employee(String name, String job, int salary) {
		this.name = name;
		this.job = job;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return this.name + " is a " + this.job + " and makes " + this.salary;
	}
	
	public String getName () {
		return this.name;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public String getJob () {
		return this.job;
	}
	
	public void setJob (String job) {
		this.job = job;
	}
	
	public int getSalary () {
		return this.salary;
	}
	
	public void setSalary (int salary) {
		this.salary = salary;
	}
	
	
}
