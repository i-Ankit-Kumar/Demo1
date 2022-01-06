

		import java.util.Scanner;

		public class UserInputDemo {

			public static void main(String[] args) {
				Scanner theScan = new Scanner(System.in);
//				System.out.println("Please enter a number");
//				int value = theScan.nextInt();
				
//				System.out.println("Enter first number");
//				int firstNumber = theScan.nextInt();
//				
//				System.out.println("Enter second number");
//				int secondNumber = theScan.nextInt();
//				
//				int result = firstNumber + secondNumber;
//				
//				System.out.println("Addition of numbers is : " + result);
				
				System.out.println("What's your name?");
				
				String name = theScan.nextLine();
				System.out.println("Howdy " + name + " ?");
				
				System.out.println("What's the first letter of your name?");
				char firstLetterOfName = theScan.nextLine().charAt(0);
				
				System.out.println("Now we know that first letter is : " + firstLetterOfName);
			}
		

	}


