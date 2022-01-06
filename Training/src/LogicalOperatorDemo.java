import java.util.Scanner;

public class LogicalOperatorDemo {

	public static void main(String[] args) {
		int first, second;
		
		System.out.println("Enter two values");
		
		Scanner scan = new Scanner(System.in);
		
		first = scan.nextInt();
		second = scan.nextInt();
		
//		if(first >=70 && second >= 70)
//			System.out.println("Congratulations, you have scored A grade!");
//		else
//			System.out.println("Better luck next time...");
		
		if(!(first == 60)) {
			System.out.println("Checking the inverse");
		}

	}

}

