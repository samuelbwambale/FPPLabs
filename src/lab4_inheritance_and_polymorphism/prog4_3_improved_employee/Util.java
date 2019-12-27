package lab4_inheritance_and_polymorphism.prog4_3_improved_employee;

import java.text.DateFormat;
import java.time.LocalDate;

public class Util {
	public static String dateAsString(LocalDate hireDay) {
		DateFormat f = DateFormat.getDateInstance(DateFormat.SHORT);
		return f.format(hireDay);
	}

}
