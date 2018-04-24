package Chapter1;

public class Finalizer {
    public static int count = 0;

    public Finalizer() {
        count++;
        System.out.println("Created: " + count);
    }

    protected void finalize() {
        System.out.println("Calling finalize");
    }
    public static void main(String[] args) throws InterruptedException {
        Finalizer a = new Finalizer();
        Finalizer b = new Finalizer();
        Finalizer c = b;
        Finalizer d = b;
        a = null;

        for (int i=0; i<10; i++) {
            System.gc();
            Thread.sleep(1*1000);
        }
    }
}

