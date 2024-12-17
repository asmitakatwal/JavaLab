package nestedStaticClass;

public class OuterClass 
{
	static String staticMsg="I am a static member of outer class";
	String instanceMsg="I am not static member of outer class";
	
	static void staticMethod() 
	{
		System.out.println("This is a static method of outer class");
	}
	void instanceMethod()
	{
		System.out.println("This is non static method of outer class");
	}

	static class staticNestedClass
	{
		void display()
		{
			System.out.println(staticMsg);
			staticMethod();
		}
		
	}

	public static void main(String[] args) 
	{
		
	OuterClass.staticNestedClass nestedStaticClass=new OuterClass.staticNestedClass();
		
	nestedStaticClass.display();
	}
}

