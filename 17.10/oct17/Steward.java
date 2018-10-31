package oct17;

public class Steward extends Person{
	private String name, lastname, homeland, department;
	private double vetyears;

//getters&setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getHomeland() {
		return homeland;
	}

	public void setHomeland(String homeland) {
		this.homeland = homeland;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getVetyears() {
		return vetyears;
	}

	public void setVetyears(double vetyears) {
		this.vetyears = vetyears;
	}

	public void print() {
		System.out.println("The stewards fullname  is:" + " " + lastname + " " + name);
		System.out.println("The steward came from :"+" "+homeland);
		System.out.println("The steward is from department: "+" "+department);
		System.out.println("The stewards seniority is: " + " " + vetyears);

		
		
	}

}
