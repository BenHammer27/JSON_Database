import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int middle = size / 2 + 1;

        char[][] array = new char[size][size];


        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    array[i][j] = '*';
                } else if (i == size -1 -j) {
                    array[i][j] = '*';
                } else if (i == size / 2) {
                    array[i][j] = '*';
                } else if (j == size / 2 ) {
                    array[i][j] = '*';
                } else {
                    array[i][j] = '.';
                }
            }
        }

        for (int k = 0; k < size; k++) {
            for (int l = 0; l < size; l++) {
                if (l == size - 1) {
                    System.out.print(array[k][l] + "\n");
                } else {
                    System.out.print(array[k][l] + " ");
                }
            }
        }
    }
}