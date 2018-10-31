package oct26;

public class BankTest {

	public static void main(String[] args) {
Bankacc a=new Bankacc("Alsion", "1", 100000, 0, true);
Bankacc b=new Bankacc("Mr Rogers", "2", 9990, 0, false);


//account test num1
a.print();
System.out.println("----------------------------------------------------");
a.deposit(10);
a.deposit(-1);
a.withdrawal(10);
a.withdrawal(999999);


System.out.println("----------------------------------------------------");
System.out.println("");
System.out.println("----------------------------------------------------");

//account test num2

b.print();
System.out.println("----------------------------------------------------");
b.deposit(10);
b.deposit(0);
b.withdrawal(10);
b.withdrawal(99999);

}

}
