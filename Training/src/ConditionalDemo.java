import java.util.Scanner;

public class ConditionalDemo {

	public static void main(String[] args) {
		Scanner theScanner = new Scanner(System.in);
		
		System.out.println("Enter your age");
		int userAge = theScanner.nextInt();
		
		boolean flag = false;
		
//		if(flag = true) {
//			System.out.println("YES");
//		}
//		else {
//			System.out.println("NO");
//		}
		
		if(userAge == 40) {
			System.out.println("Welcome to the 40's club my friend...");
		}
		else {
			System.out.println("We know you :)");
		}
		
//		if(userAge >=60) 
//			System.out.println("You are in the senior citizen category");
//		else 
//			System.out.println("Welcome youngster!");
	}

}

