package takingInput;
import java.util.*;



public class InputFromUser {

	public static void main(String[] args) {
	 Scanner scan=new Scanner(System.in);
	try {
		 System.out.print("Enter 1st Integer");
		 int a=scan.nextInt();
		 
		 System.out.print("Enter 2nd Number");
		 int b=scan.nextInt();
		 
			int result=a/b; 
			System.out.println("Result of division"+result);
	}
	catch(ArithmeticException e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
		}
	catch(InputMismatchException e) {
		//System.out.println(e.getMessage());
		e.printStackTrace();
	}
		
	}
}