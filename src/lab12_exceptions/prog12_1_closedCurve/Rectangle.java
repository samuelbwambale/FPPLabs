package lab12_exceptions.prog12_1_closedCurve;

import java.util.logging.Logger;

import lab12_exceptions.prog12_1_closedCurve.exceptions.IllegalClosedCurveException;

public class Rectangle extends ClosedCurve {

	private double width;
	private double length;
	Logger log = Logger.getLogger("prog12_1");

	public Rectangle(double width, double length) throws IllegalClosedCurveException{
		if (width < 0 || length < 0) {
			log.warning("Illegal non-positive value for side");
			throw new IllegalClosedCurveException("Illegal non-positive value for side");
		} else {
		this.length = length;
		this.width = width;
		}
	}
	double computeArea() {
		return width*length;
	}
	


}
