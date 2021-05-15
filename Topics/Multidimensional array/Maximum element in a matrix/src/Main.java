import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] array = new int [n][m];

        /*array[0] = new int[] {0,3,2,4};
        array[1] = new int[] {2,3,5,5};
        array[2] = new int[] {5,1,2,3};*/



        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        int max = -2147483648;
        int row = 0;
        int colum = 0;

        for (int k = 0; k < n; k++) {
            for (int l = 0; l < m; l++) {
                if (array[k][l] > max) {
                    max = array[k][l];
                    row = k;
                    colum = l;
                }
                //System.out.println(array[k][l] + "position " + row + " " + colum);
            }
        }
        System.out.println(row + " " + colum);
    }
}