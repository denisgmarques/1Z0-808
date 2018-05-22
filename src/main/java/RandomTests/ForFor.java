package RandomTests;

/**
 * Created by denisgmarques on 22/05/2018.
 */
public class ForFor {
    public static void main(String[] args) {
        int[] times [] = new int[3][3];
        for (int i=0; i< times.length; i++)
            for (int j=0; j< times.length; j++) {
                //times[i, j] = i * j;
                System.out.println(times[i][j]);
            }
    }
}
