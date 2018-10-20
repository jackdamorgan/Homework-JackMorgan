package oct17;

public class Program {

	public static void main(String[] args) {
		
		Person PeopleList[]=new Person[4];
		
		PeopleList[0]=new GroundSteward();
		PeopleList[1]=new Passenger();
		PeopleList[2]=new Pilot();
		PeopleList[3]=new Steward();
		
		for (Person person : PeopleList) {
			person.print();
		}
		
	}

}
