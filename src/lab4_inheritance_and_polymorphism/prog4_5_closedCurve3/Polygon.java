package lab4_inheritance_and_polymorphism.prog4_5_closedCurve3;

public interface Polygon {

	// returns in an array all sides of the polygon
	// example: For a rectangle, return would be [width, width,
	// length, length]
	public double[] getArrayOfSides();
	
	public int getNumberOfSides();
	
	//returns the sum of the values in arr
	static double sum(double[] arr) {
		double sum = 0;
		for(double side : arr) {
			sum += side;
		}
		return sum;
	}
	
	//returns the perimeter of the polygon
	default double computePerimeter() {
		return sum(getArrayOfSides());
		
	}



}
