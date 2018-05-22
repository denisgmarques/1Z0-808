package Chapter2;

/**
 * Created by denisgmarques on 21/05/2018.
 */
public class Hipo extends  Mamal { // Super Class needs constructor default
    public Hipo() {
        System.out.println("Hipo constructor default");
    }
}

class Mamal {
    public Mamal() {

    }
    public Mamal(int age) {
        System.out.println("mamal constructor with int");
    }
}
