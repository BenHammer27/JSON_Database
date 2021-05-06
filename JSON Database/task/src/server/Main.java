package server;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Main {

    public static final int PORT = 23456;

    public static void main(String[] args) {
        JDatabase JSON = new JDatabase(1000);

        System.out.println("Server started!");
        String result = "";

        boolean exit = false;

        while (!exit) {
            try (ServerSocket server = new ServerSocket(PORT)) {
                try (
                        Socket socket = server.accept();
                        DataInputStream input = new DataInputStream(socket.getInputStream());
                        DataOutputStream output = new DataOutputStream(socket.getOutputStream());
                ) {
                    String[] msg = input.readUTF().trim().split(" ");
                    int index = 0;
                    if (msg.length > 1) {
                        index = Integer.parseInt(msg[1]);
                    }
                    switch (msg[0]) {
                        case "set":
                            String text = "";
                            for (int i = 2; i < msg.length; i++) {
                                text += msg[i] + " ";
                            }
                            result = JSON.set(index, text);
                            System.out.println(result);
                            break;
                        case "get":
                            result = JSON.get(index);
                            System.out.println(result);
                            break;
                        case "delete":
                            result = JSON.delete(index);
                            break;
                        case "exit":
                            exit = true;
                            result = "OK";
                            break;
                    }

                    output.writeUTF(result);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
