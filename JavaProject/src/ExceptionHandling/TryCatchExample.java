package ExceptionHandling;

public class TryCatchExample

{
	public static void main(String[] args) {
	int data=3;
	try {
		data=10/0;
	}
	catch(ArithmeticException e) {
		System.out.println("Divide by zero error:"+e);
	}
	System.out.println("Value of data:"+data);
	System.out.println("Program Contibues");
	
	}
}