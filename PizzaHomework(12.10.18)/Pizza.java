package oct10;

public class Pizza {
	private int diameter;
	private int slices;
	private int toppings;
	private boolean Pizzatypebasic;

	// the pizza maker

	public Pizza(int diameter, int slices, int toppings) {
		super();
		this.diameter = diameter;
		this.slices = slices;
		this.toppings = toppings;

	}

	// getters&setters

	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		if (diameter <= 50 && diameter >= 10) {
			this.diameter = diameter;
		} else {
			this.diameter = 0;

		}
	}

	public int getSlices() {
		return slices;
	}

	public int setSlices(int slices) {
		this.slices = slices;
		return slices;
	}

	public int getToppings() {
		return toppings;
	}

	public int setToppings(int toppings) {
		this.toppings = toppings;
		return toppings;
	}

	public boolean isPizzatypebasic() {
		return Pizzatypebasic;
	}

	public void setPizzatypebasic(boolean pizzatypebasic) {
		Pizzatypebasic = pizzatypebasic;
	}

	// checking if the pizza is only with cheese or with topping's also.

	public int isPizzabasic(int toppings) {
		if (toppings >= 1 && toppings <= 5) {
			System.out.println("This pizza has toppings, Yum");
			return toppings;
		} else {
			System.out.println("cant have negative toppings, maybe in the future");
			return toppings;
		}
	}

	// printing the values of the pizza, if it the pizza i'snt legitimate prints a
	// message.
	public void PrintPizzainfo() {
		if (diameter < 25) {
			System.out.println("Personal pizza with the size of: " + " " + this.diameter);
		} else if (diameter >= 25 && diameter <= 50) {
			System.out.println("Large pizza with the size of: " + " " + this.diameter);
		} else {
			System.out.println("too many slices ");
		}

		if (toppings <= 5 && toppings != 0 && toppings > 0) {
			System.out.println("pizza with toppings, number of toppings: " + " " + toppings);
		} else {
			System.out.println("regular cheese pizza");

		}
		if (slices >= 1 && slices <= 8) {
			System.out.println("the number of slices is: " + " " + slices);
		} else {
			System.out.println("too many slices");
		}
	}

}
