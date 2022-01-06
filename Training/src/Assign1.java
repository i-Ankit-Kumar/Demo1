//Takes 3 subjects marks of students and checks whether he pass or fail...

import java.util.*;
public class Assign1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc= new Scanner(System.in);
  
  int a,b,c;
  System.out.println("Enter the 1st number");
  a= sc.nextInt();
  System.out.println("Enter the 2nd number");
  b= sc.nextInt();
  System.out.println("Enter the 3rd number");
  c= sc.nextInt();
  int s=a+b+c;
  if(a<40)
  {
	 System.out.println("Failing");
	 System.exit(0);
  }
  if(b<40)
  {
	 System.out.println("Failing");
	 System.exit(0);
  }
  if(c<40)
  {
	 System.out.println("Failing");
	 System.exit(0);
  }
  
  if(s<125)
  {
	 System.out.println("Failing");
	 System.exit(0);
  }
  else
	  
	  System.out.println("Passing");
  
	}

}
