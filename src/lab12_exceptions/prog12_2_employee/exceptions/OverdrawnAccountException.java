package lab12_exceptions.prog12_2_employee.exceptions;

@SuppressWarnings("serial")
public class OverdrawnAccountException extends Exception {
	public OverdrawnAccountException(String msg) {
		super(msg);
	}

}
