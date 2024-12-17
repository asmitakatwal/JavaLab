package nestedStaticClass;

public class OuterNonStatic {
	private String Message="Hello from outer class";
	
	class Inner{
		void display()
		{
			System.out.println(Message);
			System.out.println("From insside class");
		}
	}

	public static void main(String[] args) {
		OuterNonStatic outer =new OuterNonStatic();
		OuterNonStatic.Inner inner =outer.new Inner();
		inner.display();

	}

}
