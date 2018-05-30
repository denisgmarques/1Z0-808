package Chapter4;

/**
 * Created by denisgmarques on 29/05/2018.
 */
public class J415 {

    public void print(byte x) {
        System.out.print("byte");
    }

    public void print(int x) {
        System.out.print("int");
    }

    public void print(float x) {
        System.out.print("float");
    }

    public void print(Object x) {
        System.out.print("Object");
    }

    public static void main(String[] args) {
        J415 t = new J415();
        short s = 123;
        t.print(s);
        t.print(true);
        t.print(6.789);
    }

}
