import java.util.*;
public class Grasshopper {
    public Grasshopper(String n) {
        name = n;
    }
    public static void main(String[] args) {
        Grasshopper one = new Grasshopper("g1");
        Grasshopper two = new Grasshopper("g2");
        one = two;
        two = null;
        one = null;
    }
    private String name;
}

/*
10. Which are true of the following code? (Choose all that apply)

     false   A. Immediately after line 9, no grasshopper objects are eligible for garbage collection.
     false   B. Immediately after line 10, no grasshopper objects are eligible for garbage collection.
     True    C. Immediately after line 9, only one grasshopper object is eligible for garbage collection.
     True    D. Immediately after line 10, only one grasshopper object is eligible for garbage collection.
     false   E. Immediately after line 11, only one grasshopper object is eligible for garbage collection.
     True    F. The code compiles.
     false   G. The code does not compile.
*/
