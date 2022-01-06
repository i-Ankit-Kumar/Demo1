import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		
		System.out.println("Enter value:");
		int value = new Scanner(System.in).nextInt();
		
		switch(value) {
			case 10:
				System.out.println("TEN");
				break;
			case 7:
				System.out.println("SEVEN");
				break;
			case 51:
				System.out.println("FIFTY ONE");
				break;
			default:
				System.out.println("NO MATCH FOUND!!!");
				break;
		}

	}

}



//Enter the 3 subject marks:
//	45
//	55
//	46
//	
//	a >= 40 && b >= 40 && c >=40 && sum >= 125 -> PASSING
//	FAILING
//
//	
//	12 1 2
//	WINTER
//	3 4 5
//	SPRING
//	6 7 8
//	SUMMER
//	9 10 11
//	AUTUMN
	












