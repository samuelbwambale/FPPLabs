package lab3_objects_and_classes.prog3_2_employee;

import java.text.DateFormat;
import java.time.LocalDate;

public class Util {
	public static String dateAsString(LocalDate hireDay) {
		DateFormat f = DateFormat.getDateInstance(DateFormat.SHORT);
		return f.format(hireDay);
	}

}
