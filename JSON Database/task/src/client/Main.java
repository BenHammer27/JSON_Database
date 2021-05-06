package client;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;
import com.beust.jcommander.Parameter;

public class Main {
    private static final String SERVER_ADDRESS = "127.0.0.1";
    private static final int SERVER_PORT = 23456;

    public static void main(String[] args) {

        boolean exit = false;
        while (!exit) {

            try (
                    Socket socket = new Socket(SERVER_ADDRESS, SERVER_PORT);
                    DataInputStream input = new DataInputStream(socket.getInputStream());
                    DataOutputStream output = new DataOutputStream(socket.getOutputStream())
            ) {
                System.out.println("Client started!");
                Scanner scanner = new Scanner(System.in);
                String msg = scanner.nextLine();

                output.writeUTF(msg);

                String receivedMsg = input.readUTF();

                System.out.println(receivedMsg);
                if (msg.equals("exit")) {
                    exit = true;
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
