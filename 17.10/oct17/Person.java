package oct17;

public abstract class Person {
	private String name, lastname;
	
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

	//fun-actions
	public void print() {
		System.out.println("Full name:"+" "+lastname+" "+name);
	}
}
