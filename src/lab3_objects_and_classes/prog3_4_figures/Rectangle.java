package lab3_objects_and_classes.prog3_4_figures;

public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
		
	}
	
	public double computeArea() {
		return this.length * this.width;
	}

	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}

}
