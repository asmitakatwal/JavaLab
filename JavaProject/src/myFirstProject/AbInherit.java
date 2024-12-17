package myFirstProject;

abstract class Shape{
	abstract double area();
}

interface Drawable{
	void draw();
}

class Circle extends Shape implements Drawable{
	double radius;
	
	Circle(double radius){
		this.radius=radius;
	}
	
	double area() {
		return Math.PI*radius*radius;
	}
	public void draw() {
		System.out.println("Drawing circle..");
	}
}

public class AbInherit {

	public static void main(String[] args) {
		Circle mycircle=new Circle(5);
		mycircle.draw();
		System.out.println("Area of circle is"+mycircle.area());

	}

}
