package server;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        JDatabase JASON = new JDatabase(100);

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            String[] next = scanner.nextLine().trim().split(" ");
            int index = 0;
            if (next.length > 1) {
                index = Integer.parseInt(next[1]) - 1;
            }
            switch (next[0]) {
                case "set":
                    String input = "";
                    for (int i = 2; i < next.length; i++) {
                        input += next[i] + " ";
                    }
                    System.out.println(JASON.set(index, input));
                    break;
                case "get":
                    System.out.println(JASON.get(index));
                    break;
                case "delete":
                    System.out.println(JASON.delete(index));
                    break;
                case "exit":
                    exit = true;
                    break;
            }
        }
    }
}
