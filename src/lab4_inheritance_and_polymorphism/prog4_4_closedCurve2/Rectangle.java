package lab4_inheritance_and_polymorphism.prog4_4_closedCurve2;

import lab4_inheritance_and_polymorphism.prog4_4.good.Polygon;

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

	@Override
	public int getNumberOfSides() {
		return 4;
	}

	@Override
	public double computePerimeter() {
		return ((2 * this.length) + (2 * this.width));
	}

}
