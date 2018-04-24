package Chapter1;

import java.lang.System;
import java.lang.*;
import java.util.Random;
import java.util.*;

public class ImportExample {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt(10));
    }

    public void method(ArrayList list) {
        if (list.isEmpty()) {
            System.out.println("e");
        } else {
            System.out.println("n");
        }
    }
}

