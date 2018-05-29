package Chapter3;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

class J331 {
	public static void main(String[] args) {


		LocalDate date = LocalDate.of(2018, Month.APRIL, 30);
		LocalDate date2 = date.plusDays(2);
		 date2 = date2.plusYears(3);
		System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());

		System.out.println(date2.getYear() + " " + date2.getMonth() + " " + date2.getDayOfMonth());
	}
}
