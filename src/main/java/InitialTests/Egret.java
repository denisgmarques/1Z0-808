package InitialTests;

public class Egret {
    private String color;
    public Egret() {
        this("white");
        }
    public Egret(String color) {
        color = color;
        }
    public static void main(String[] args) {
        Egret e = new Egret();
        System.out.println("Color:" + e.color);
        }
     }

/*
A. Color:
B. Color:null
C. Color:White
D. Compiler error on line 4.
E. Compiler error on line 10.
F. Compiler error on line 11.

Na linha 7 não está setando o atributo color da classe, pois não tem o this. na frente

Resultado então é:

   Color:null

*/