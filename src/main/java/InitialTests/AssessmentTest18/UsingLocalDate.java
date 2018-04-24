package InitialTests.AssessmentTest18;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;

/**
 * Created by denis on 14/04/2018.
 */
public class UsingLocalDate {

    public static void main(String[] args) {
        System.out.println(LocalDate.of(2015, Calendar.APRIL, 1)); // 2015-03-01
        System.out.println(LocalDate.of(2015, Month.APRIL, 1));    // 2015-04-01
        System.out.println(LocalDate.of(2015, 3, 1));              // 2015-03-01
        System.out.println(LocalDate.of(2015, 4, 1));              // 2015-04-01
        // private method System.out.println(new LocalDate(2015, 3, 1));
        // private method System.out.println(new LocalDate(2015, 4, 1));
    }
}

/*

A. System.out.println(LocalDate.of(2015, Calendar.APRIL, 1));
B. System.out.println(LocalDate.of(2015, Month.APRIL, 1));
C. System.out.println(LocalDate.of(2015, 3, 1));
D. System.out.println(LocalDate.of(2015, 4, 1));
E. System.out.println(new LocalDate(2015, 3, 1));
F. System.out.println(new LocalDate(2015, 4, 1));

R:   B, D

*/
