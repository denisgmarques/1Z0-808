public class AssessmentTest5 { //FeedingSchedule {
    public static void main(String[] args) {
        System.out.print("a");
        try {
            System.out.print("b");
            throw new IllegalArgumentException();
        } catch (RuntimeException e) { // IllegalArgumentException is a subclass of RuntimeException
            System.out.print("c");
        } finally {
            System.out.print("d");
        }
        System.out.print("e");
    }
}