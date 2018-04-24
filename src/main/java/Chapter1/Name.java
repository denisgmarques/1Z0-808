package Chapter1;
public class Name {
    String first = "Theodore";
    { System.out.println("setting field"); }
    String last = "Moose";
    String full = first + last;
    int x = 0b10;

    {
        System.out.println(x); // 2 porque é binario
        System.out.println(017); // 15 porque é binario
        System.out.println(17); // 17 porque NAO é binario
        System.out.println(0x1F); // 31 porque é binario

        System.out.println(1_000_000); // Underline para separar - Funcionalidade do java 7 para ficar mais legivel
    }


    public static void main(String[] args) {
        System.out.println(new Name().full);
        {{{{{{{{{
            System.out.println("abc");
        }}}}}}}}}
    }
}

/*
double notAtStart = _1000.00; // DOES NOT COMPILE
double notAtEnd = 1000.00_; // DOES NOT COMPILE
double notByDecimal = 1000_.00; // DOES NOT COMPILE
double annoyingButLegal = 1_00_0.0_0; // this one compiles

 */