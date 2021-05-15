import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

            int[][] array = new int[n][m]; //{{11, 12, 13, 14}, {21, 22, 23, 24}, {31, 32, 33, 34}};

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    array[i][j] = scanner.nextInt();
                }
            }

            int i = scanner.nextInt();
            int j = scanner.nextInt();

            for (int k = 0; k < n; k++) {
                int merk = array[k][i];
                array[k][i] = array[k][j];
                array[k][j] = merk;
            }

            for (int a = 0; a < n; a++) {
                for (int b = 0; b < m; b++) {
                    if (b == m - 1) {
                        System.out.print(array[a][b] + "\n");
                    } else {
                        System.out.print(array[a][b] + " ");
                    }
                }
            }
    }
}