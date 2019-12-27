package lab12_exceptions.prog12_1_closedCurve;

import java.util.logging.Logger;

import lab12_exceptions.prog12_1_closedCurve.exceptions.IllegalClosedCurveException;

public class Square extends ClosedCurve {
	double side;
	Logger log = Logger.getLogger("prog12_1");

	
	public Square(Double side) throws IllegalClosedCurveException{
		this(side.doubleValue());
	}
	public Square(double side) throws IllegalClosedCurveException {
		if (side < 0) {
			log.warning("Illegal non-positive value for side");
			throw new IllegalClosedCurveException("Illegal non-positive value for side");
		}
		else
			this.side = side;
	}
	double computeArea() {
		return(side*side);
	}

}
