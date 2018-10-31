package oct17;

public class GroundSteward extends Person {
	private String name, lastname, homeland,Departement;
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

	public double getVetyears() {
		return vetyears;
	}

	public void setVetyears(double vetyears) {
		this.vetyears = vetyears;
	}
	
	public String getDepartement() {
		return Departement;
	}

	public void setDepartement(String departement) {
		Departement = departement;
	}


	public void print() {
		System.out.println("The stewards fullname  is:" + " " + lastname + " " + name);
		System.out.println("The steward came from :" + " " + homeland);
		System.out.println("The stewards seniority is: " + " " + vetyears);

	}

}
