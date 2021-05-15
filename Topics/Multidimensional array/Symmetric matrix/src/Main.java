//import javax.swing.*;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        /*array[0] = new int[] {0, 1, 2};
        array[1] = new int[] {1, 2, 3};
        array[2] = new int[] {3, 3, 4};*/



        String symetric = "YES";

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                //System.out.println(array[i][j]);
                if (array[i][j] != array[j][i]) {
                    symetric = "NO";
                }
            }
        }
        System.out.println(symetric);
    }
}