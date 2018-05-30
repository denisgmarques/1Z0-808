package Chapter4;

public class InitializationOrderSimple {
    private String name = "Torchie";

    { System.out.println(name); }
    { System.out.println("2"); }
    private static int COUNT = 0;

    static { System.out.println(COUNT); }

    static { COUNT += 10; System.out.println(COUNT); }

    public InitializationOrderSimple() {
        System.out.println("constructor");
    }

    final static void method4() { }
    //public final int void method() { }
    //private void int method() { }
    static final void method3() { }
    //void final method() {}
    //void public method() { }

    public void methodA() { return;}

    public static void main(String[] args) {
        InitializationOrderSimple init = new InitializationOrderSimple();
    }
}
