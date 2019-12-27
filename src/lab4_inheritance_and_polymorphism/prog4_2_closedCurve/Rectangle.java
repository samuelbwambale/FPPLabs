package lab4_inheritance_and_polymorphism.prog4_2_closedCurve;

public final class Rectangle extends ClosedCurve {
	private final double width;
	private final double length;
	private static final double ANGLE = 50;

	public Rectangle(double width, double length){
		super();
		this.width = width;
		this.length = length;
		
	}

	public double computeArea() {
		double an = this.ANGLE * 2;
		return width * length;
	}

}
