package Chapter2;

import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * Created by denisgmarques on 22/05/2018.
 */
public class LocalDateTime {
    public static void main(String[] args) {

        java.time.LocalDateTime d = java.time.LocalDateTime.of( 2015, 5, 10, 11, 22, 33);

        Period p = Period.of(1, 2, 3);
        d.minus(p);
        DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println(f.format(d));
    }

    public void anyMethod(){
        int a=0;
        System.out.println(a);
    }
}
