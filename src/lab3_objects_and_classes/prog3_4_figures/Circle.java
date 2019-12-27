package lab3_objects_and_classes.prog3_4_figures;

public class Circle {
	private double radius;
	
	public Circle(double rad) {
		this.radius = rad;
		
	}
	
	public double computeArea() {
		return Math.PI * Math.pow(this.radius, 2);
	}

	public double getRadius() {
		return radius;
	}

}
