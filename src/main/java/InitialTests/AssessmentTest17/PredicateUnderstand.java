package InitialTests.AssessmentTest17;

import java.util.function.Predicate;

public class PredicateUnderstand {
    public static void main(String[] args) {
        System.out.println(test(i -> i == 5));
        //System.out.println(test(i -> {i == 5;}));
        System.out.println(test((i) -> i == 5));
        //System.out.println(test((int i) -> i == 5);
        //System.out.println(test((int i) -> {return i == 5;}));
        System.out.println(test((i) -> {return i == 5;}));
    }
    
    private static boolean test(Predicate<Integer> p) {
        return p.test(5);
    }
}

/*
17. Which of the following lines can be inserted at line 11 to print true? (Choose all that apply)
10: public static void main(String[] args) {
11: // INSERT CODE HERE
12: }
13: private static boolean test(Predicate<Integer> p) {
14: return p.test(5);
15: }

A. System.out.println(test(i -> i == 5));
B. System.out.println(test(i -> {i == 5;}));
C. System.out.println(test((i) -> i == 5));
D. System.out.println(test((int i) -> i == 5);
E. System.out.println(test((int i) -> {return i == 5;}));
F. System.out.println(test((i) -> {return i == 5;}));

R:  A, C, F

 */