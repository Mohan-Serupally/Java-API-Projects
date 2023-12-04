package mini_project;

import java.util.Scanner;
public class NumberGussingGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Instructions");
		System.out.println("1.If you want to exit game in between you have toenter -1");
		System.out.println();
		
		int randomNumber = (int)(Math.random()*100);
		int userNumber = 0;
		int count = 0;
		
		do {
			System.out.println("Enter your number: ");
			userNumber = sc.nextInt();
			count++;
			
			if(userNumber==randomNumber) {
				System.out.println("woohoooo.....Correct Number");
				System.out.println("You Complete it in"+count +"attempts");
				break;
			}
			else if(userNumber>randomNumber) {
				System.out.println("Your number is larger than the actual number");
				
			}
			else {
				System.out.println("Your number is small than actual number");
			}
		}while(userNumber>=0);
		sc.close();
	}
}
