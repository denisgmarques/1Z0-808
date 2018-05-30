package Chapter4;

/**
 * Created by denisgmarques on 29/05/2018.
 */
public class J416 {

    public static long square(int x) {
        long y = x * (long) x;
        x = -1;
        return y;
    }

    public static void muda(StringBuilder x) {
        x.append("abc");
    }
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        muda(sb);
        System.out.println(sb);
        int value = 9;
        long result = square(value);
        System.out.println(value); }

}
