package Chapter2;

/**
 * Created by denisgmarques on 22/05/2018.
 */
public class DefaultInitializationForInstanceAttr {
    String name;
    boolean empty;

//    public void anyMethod() {
//        String name;
//        boolean empty;
//        System.out.println("Name:" + name); // might not be initialized
//        System.out.println("Name:" + empty);// might not be initialized
//    }

    public static void main(String[] args) {
        DefaultInitializationForInstanceAttr c = new DefaultInitializationForInstanceAttr();
        System.out.println("Name:" + c.name);
        System.out.println("Name:" + c.empty);
    }

    public static final void  method(){

    }
}
