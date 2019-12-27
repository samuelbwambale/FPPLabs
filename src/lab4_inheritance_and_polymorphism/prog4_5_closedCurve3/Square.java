package lab4_inheritance_and_polymorphism.prog4_5_closedCurve3;

public final class Square extends ClosedCurve implements Polygon {
	private final double side;

	public Square(double side) {
		this.side = side;

	}

	public double computeArea() {
		return side * side;
	}
	
	public double[] getArrayOfSides() {
		double[] squareSides = new double[4];
		squareSides[0] = this.side;
		squareSides[1] = this.side;
		squareSides[2] = this.side;
		squareSides[3] = this.side;
		return squareSides;
		
	}

	@Override
	public int getNumberOfSides() {
		return 4;
	}

}
