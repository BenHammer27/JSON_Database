import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] cinema = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                cinema [i][j] = scanner.nextInt();
            }
        }

        int seats = scanner.nextInt();
        int counter = 0;
        int row = 0;
        int counterMax = 0;


        for (int x = 0; x < n; x++) {
            for (int y = 0; y < m; y++) {
                if (cinema[x][y] == 0) {
                    counter++;
                }

                if (counter == seats) {
                    row = x;
                    System.out.print(row + 1);
                    break;
                }

                if (y == m - 1) {
                    counter = 0;
                }

                if (cinema[x][y] == 1) {
                    counter = 0;
                }
            }
            if (counter == seats) {
                break;
            }
        }
        if (counter < seats) {
            System.out.print(0);
        }

                /*if (cinema[x][y] == 1) {
                    if (counter >= seats) {
                        counterMax = counter;
                        counter = 0;
                        row = x;
                    } else {
                        counter = 0;
                    }
                } else if (cinema[x][y] == 0){
                    counter++;
                }
                if (counterMax >= seats) {
                    if (counterMax >= seats) {
                        System.out.println(row + 1);
                    }
                    break;
                }
                if (y == m-1) {
                    counter = 0;
                }
            }
            if (counterMax >= seats) {
                break;
            }
        }
        if (counterMax < seats){
            System.out.println("0");
        }

        /*if (counterMax >= seats) {
            System.out.println(row + 1);
        } else {
            System.out.println("0");
        }*/






        /*for (int k = 0; k < n; k++) {
            for (int l = 0; l < m; l++) {
                if (l == m-1) {
                    System.out.print(cinema[k][l] + " \n");
                } else {
                    System.out.print(cinema[k][l] + " ");
                }
            }
        }*/
    }
}