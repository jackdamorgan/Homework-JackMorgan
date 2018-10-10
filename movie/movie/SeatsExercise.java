package movie;

import java.util.Scanner;

public class SeatsExercise {

	public static void main(String[] args) {
		//input and stats.
		
		Scanner scan = new Scanner(System.in);
		int p = (int) (Math.random() *(90-70)+70);
		int numofchairs=0;
		int[][] seats = new int[4][3];
		boolean ava=true;
		
		
		//making all the seats free
		for (int row = 0; row < seats.length; row++) {
			for (int col = 0; col < seats.length-1; col++) {
				seats[row][col]=0;
			}
		}
		
		//loop for the number of chairs, which make him choosing sits.
		System.out.println("please enter the number of seats you want");
		int numofseats=scan.nextInt();
		for (int i = 0; i < numofseats; i++) {
		System.out.println("Please enter the row and the seat ");
        int r=scan.nextInt();
        int s=scan.nextInt();
        
        //testing
        if (ava=true) {
        	seats[r][s]=1;
			numofchairs+=1;
		}else {
			System.out.println("Seat taken");
		     
			}
		}
		   System.out.println("The number of sits available i: "+numofchairs+" "+"and the price is: "+numofchairs*p);

		   
        
		
	}
	

}
