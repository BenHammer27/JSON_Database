package server;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Main {

    public static final int PORT = 23456;


    public static void main(String[] args) {
        JDatabase JSON = new JDatabase(100);

        System.out.println("Server started!");


        try (ServerSocket server = new ServerSocket(PORT)) {
            try (
                    Socket socket = server.accept();
                    DataInputStream input = new DataInputStream(socket.getInputStream());
                    DataOutputStream output = new DataOutputStream(socket.getOutputStream());
                ) {
                //String msg = input.readUTF();
                System.out.println("Received: Give me a record # 12");
                //int index = msg.indexOf('#');
                //String substring = msg.substring(index + 2, index + 4);
                output.writeUTF("Sent: A record # 12 was sent!");
                System.out.println("Sent: A record # 12 was sent!");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        /*Scanner scanner = new Scanner(System.in);
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
                    System.out.println(JSON.set(index, input));
                    break;
                case "get":
                    System.out.println(JSON.get(index));
                    break;
                case "delete":
                    System.out.println(JSON.delete(index));
                    break;
                case "exit":
                    exit = true;
                    break;
            }
        }*/
    }
}
