package myFirstProject;

class Animal{
	String name;
	public void Sound()
	{
		System.out.println("This animal makes sound");
	}
}

class Dog extends Animal{
	public void bark() {
		System.out.println("Dog barks");
	}
}

public class Main {
	public static void main(String[] args)
	{
		Dog dog=new Dog();
		dog.Sound();
		dog.bark();
	}

}
