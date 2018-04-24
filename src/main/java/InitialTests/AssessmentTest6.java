package InitialTests;

public class AssessmentTest6 { //MathFunctions {
    public static void addToInt(int x, int amountToAdd) {
        x = x + amountToAdd;
    }
    public static void main(String[] args) {
        int a = 15;
        int b = 10;
//        MathFunctions.addToInt(a, b); // ERRO: METODO MAIN NAO TEM ACESSO A UM METODO STATIC
        System.out.println(a);
    }
}