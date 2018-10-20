package oct17;

public class Passenger extends Person {
private String name,lastname;
private double passportid;




//setters&getters

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

public double getPassportid() {
	return passportid;
}

public void setPassportid(double passportid) {
	this.passportid = passportid;
}

public void print() {
	System.out.println("The passengers fullname  is:" + " " + lastname + " " + name);
	System.out.println("The passengers id is: "+" "+passportid);
}

}
