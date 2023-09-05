import java.util.Scanner;


public class loopsextra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String stars = "";
		String spaces = "";
		Scanner in= new Scanner(System.in);
		System.out.println("How many rows?");
		int rows = in.nextInt();
		for(int i=1; i<= rows; i++) {
			System.out.println(stars+="*");
		}
		
		
	}

}
