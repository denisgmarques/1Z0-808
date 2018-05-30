package Chapter4;

class J410 {
    public static void main(String[] args) {
        Rope.swing();
        new Rope().swing();
//        System.out.println(LENGTH);
    }
}

class Rope {
    public static int LENGTH = 5;

    static {
        LENGTH = 10;
    }

    public static void swing() {
        System.out.print("swing " + LENGTH);
    }
}
