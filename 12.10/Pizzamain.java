package oct10;

public class Pizzamain {

	public static void main(String[] args) {
Pizza Pizza1=new Pizza(50, 3, 5);
Pizza Pizza2=new Pizza(15, 4, 3);
Pizza Pizza3=new Pizza(10, 8, 1);
Pizza Pizza4=new Pizza(25, 6, 3);
Pizza Pizza5=new Pizza(51, 9, -1);

Pizza1.isPizzabasic(5);
System.out.println("");
Pizza2.isPizzabasic(3);
System.out.println("");
Pizza3.isPizzabasic(1);
System.out.println("");
Pizza4.isPizzabasic(3);
System.out.println("");
Pizza5.isPizzabasic(-1);
System.out.println("");
System.out.println("");
System.out.println("-------------------------------------------");




Pizza1.PrintPizzainfo();
System.out.println("");
Pizza2.PrintPizzainfo();
System.out.println("");
Pizza3.PrintPizzainfo();
System.out.println("");
Pizza4.PrintPizzainfo();
System.out.println("");
Pizza5.PrintPizzainfo();
System.out.println("");
	}

}
