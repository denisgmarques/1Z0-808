package RandomTests;

/**
 * Created by denisgmarques on 22/05/2018.
 */
public class DivisionByZero {
    public static void main(String[] args) {
        int a = 123;
        int b = 0;

        try {
            float x = a / b;
        } catch (ArithmeticException ae) { // Subclass ArithmeticException Must be before RuntimeException

        } catch (RuntimeException rte) {

        }
    }
}
