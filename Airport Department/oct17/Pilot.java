package oct17;

public class Pilot extends Person {
	private String name, lastname;
	private double vetyears, licnum;


	// getters&setters

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

	public double getVetyears() {
		return vetyears;
	}

	public void setVetyears(double vetyears) {
		this.vetyears = vetyears;
	}

	public double getLicnum() {
		return licnum;
	}

	public void setLicnum(double licnum) {
		this.licnum = licnum;
	}

	// Functions

	public void print() {
		System.out.println("The pilots fullname is:" + " " + lastname + " " + name);
		System.out.println("The pilots licence number is:" + " " + licnum);
		System.out.println("The pilots seniority is: " + " " + vetyears);
	}
}
