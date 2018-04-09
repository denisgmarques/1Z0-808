/**
 * Created by denis on 01/04/2018.
 */
public class AssessmentTest2 {
    public static void main(String[] main) {
        String s1 = "Java";
        String s2 = "Java";
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Ja").append("va");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(sb1.toString() == s1); // SB é outra referência e o toString é um método apenas
        System.out.println(sb1.toString().equals(s1));
    }
}
