package InitialTests;

public class AssessmentTest4 { //FeedingSchedule {
    public static void main(String[] args) {
        boolean keepGoing = true;
        int count = 0;
        int x = 3;
        while (count++ < 3) { // PRIMEIRO FAZ A COMPARAÇÃO DEPOIS O INCREMENTO
            int y = (1 + 2 * count) % 3;
            switch (y) {
                default:
                case 0:
                    x -= 1;
                    break;
                case 1:
                    x += 5;
            }
        }
        System.out.println(x);
    }
}