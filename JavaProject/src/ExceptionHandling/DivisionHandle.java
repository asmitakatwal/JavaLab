package ExceptionHandling;
import java.util.*;

public class DivisionHandle {

	public static void main(String[] args) {
	  Scanner scanner=new Scanner(System.in);
	  try {
		  System.out.println("Enter 1st NUmber");
		  int a=scanner.nextInt();
		  
		  System.out.println("Enter 2nd NUmber");
		  int b=scanner.nextInt();
		  
		  int result=a/b;
		  System.out.println("Result of division"+result);
	  }
	  catch(ArithmeticException e) {
		  System.out.println(e.getMessage());
	  }catch(InputMismatchException e) {
		  System.out.println("Enter ony integer");
	  }finally {
		  System.out.println("End");
	  }

	}

}
