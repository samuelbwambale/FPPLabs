package lab3_objects_and_classes.prog3_4_figures;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle tri = new Triangle(2,4.5);
		System.out.printf("Area of Triangle is %.2f %n", tri.computeArea());
		Rectangle rect = new Rectangle(2,4.5);
		System.out.printf("Area of Rectangle is %.2f %n", rect.computeArea());
		Circle circle = new Circle(4);
		System.out.printf("Area of Circle is %.2f %n", circle.computeArea());

	}

}
