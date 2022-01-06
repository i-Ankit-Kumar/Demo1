//Takes a number from the user and check its respective season...
import java.util.Scanner;
public class Assign2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
       int num;
       System.out.println("enter the season number");
       num=sc.nextInt();
       switch(num) {
       
       case 12:
    	   
       case 1:
    	   
       case 2:
    	   System.out.println("winter");	   
    	   break;
    	   
       case 3:
    	   
       case 4:
    	   
       case 5:
    	   System.out.println("spring");	   
    	   break;
    	   
       case 6:
    	   
       case 7:
    	   
       case 8:
    	   System.out.println("summer");	   
    	   break;
    	   
       case 9:
    	   
       case 10:
    	   
       case 11:
    	   System.out.println("autumn");   
    	   break;
    	   
       default: System.out.println("Invalid");
	}

}
}
