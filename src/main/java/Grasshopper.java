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


     C, D, F.
     Immediately after line 9, only Grasshopper g1 is eligible for garbage collection since both one and two points to Grasshopper g2.
     Immediately after line 10, we still only have Grasshopper g1 eligible for garbage collection. Reference one points to g2 and reference two is null.
     Immediately after line 11, both Grasshopper objects are eligible for garbage collection since both one and two points to null.
     The code does compile.
     Although it is traditional to declare instance variables early in the class, you don’t have to.
     For more information, see Chapter 1.
*/
