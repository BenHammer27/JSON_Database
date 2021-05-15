import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int row = scanner.nextInt();
        int colum = scanner.nextInt();

        int[][] input = new int[row][colum];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                input[i][j] = scanner.nextInt();
            }
        }

        int[][] output = new int[colum][row];

        for (int x = 0; x < colum; x++) {
            for (int y = 0; y < row; y++) {
                output[x][row - 1 - y] = input[y][x];
            }
        }


        for (int k = 0; k < colum; k++) {
            for (int l = 0; l < row; l++) {
                if (l == row - 1) {
                    System.out.print(output[k][l] + "\n");
                } else {
                    System.out.print(output[k][l] + " ");
                }
            }

        }
    }
}