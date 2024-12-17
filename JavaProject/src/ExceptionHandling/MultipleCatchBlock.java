package ExceptionHandling;
public class MultipleCatchBlock{
	public static void main(String[] args) {
		try {
			int []arr=new int[5];
			arr[5]=7;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index out of Bounds"+e);
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception "+e);
		}catch(Exception e) {
			System.out.println("General Exceptio"+e);
		}
	}
}