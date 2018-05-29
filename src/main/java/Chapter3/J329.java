package Chapter3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

class J329 {
	public static void main(String[] args) {

		LocalDate date = LocalDate.parse("2018-04-30", DateTimeFormatter.ISO_LOCAL_DATE);
		date.plusDays(2);
		// DATE NAO PODE ADICIONAR HORAS - date.plusHours(3);
		System.out.println(date.getYear() + + date.getDayOfMonth());

	}
}
