package lab3_objects_and_classes.prog3_4_figures;

public class Triangle {
	private double base;
	private double height;
	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
		
	}
	
	public double computeArea() {
		return 0.5 * this.base * this.height;
	}

	public double getBase() {
		return base;
	}

	public double getHeight() {
		return height;
	}


}
