package lab12_exceptions.prog12_1_closedCurve.exceptions;

@SuppressWarnings("serial")
public class IllegalClosedCurveException extends Exception {
	public IllegalClosedCurveException() {
		super();
	}
	
	public IllegalClosedCurveException(String msg) {
		super(msg);
	}
	
	public IllegalClosedCurveException(Throwable t) {
		super(t);
	}

}
