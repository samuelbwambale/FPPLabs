package lab4_inheritance_and_polymorphism.prog4_5_closedCurve3;

public final class Rectangle extends ClosedCurve implements Polygon {
	private final double width;
	private final double length;

	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;

	}

	public double computeArea() {
		return width * length;
	}


	public double[] getArrayOfSides() {
		double[] rectSides = new double[4];
		rectSides[0] = this.length;
		rectSides[1] = this.width;
		rectSides[2] = this.length;
		rectSides[3] = this.width;
		return rectSides;
		
	}

	@Override
	public int getNumberOfSides() {
		return 4;
	}

}
