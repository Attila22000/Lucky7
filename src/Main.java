import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in= new Scanner(System.in);
		Random rand = new Random();
		System.out.println("How much money would you like to spend?");
		int money = in.nextInt();
		int spin= 1;
		int ten = 10;
		int five = 5;
		int three= 3;
		String playagain;
		in.nextLine();
		do {
		if(money<1) {
			System.out.println("Insufficient funds, each spin costs 1€. Your balance is 0€.");
			break;
		}
		else {
			int lucky= rand.nextInt(10)+1;
			int lucky2 = rand.nextInt(10)+1;
			int lucky3 = rand.nextInt(10)+1;
			System.out.print(lucky + " ");
			System.out.print(lucky2 + " ");
			System.out.println(lucky3);
		if(lucky == 7 && lucky2 == 7 && lucky3 == 7) {
				money = money - spin + ten;
				System.out.println("You won 10€! Your new balance is "+ money + "€.");
			}
			else if (lucky==7 && lucky2==7 || lucky==7 && lucky3==7 || lucky2==7 && lucky3==7) {
				money = money - spin + five;
				System.out.println("You won 5€! Your new balance is "+ money + "€.");
			}
			else if (lucky==7 ||  lucky2==7 || lucky3==7) {
				money = money - spin + three;
				System.out.println("You won 3€! Your new balance is "+ money + "€.");
			}
				else {
					money = money - spin;
					System.out.println("You lost!");
				}
		}
		if (money>=1) {
			System.out.println("Would you like to play again (y/n)?");
		}
		else {
			System.out.println("You ran out of money! Better luck next time.");
			break;
		}
		playagain =in.nextLine();
		
		} 
		while (playagain.equalsIgnoreCase("y"));
		
System.out.println("Thank you for playing. Your balance is " + money + "€.");
	}

}
