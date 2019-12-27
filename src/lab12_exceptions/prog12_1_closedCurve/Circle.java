package lab12_exceptions.prog12_1_closedCurve;

import java.util.logging.Logger;

import lab12_exceptions.prog12_1_closedCurve.exceptions.IllegalClosedCurveException;

public class Circle extends ClosedCurve {
	double radius;
	Logger log = Logger.getLogger("prog12_1");

	public Circle(Double radius) throws IllegalClosedCurveException {
		this(radius.doubleValue());
	}

	public Circle(double radius) throws IllegalClosedCurveException {
		if (radius < 0) {
			log.warning("Illegal non-positive value for side");
			throw new IllegalClosedCurveException("Illegal non-positive value for side");
		} else
			this.radius = radius;
	}

	double computeArea() {
		return (Math.PI * radius * radius);
	}
}
