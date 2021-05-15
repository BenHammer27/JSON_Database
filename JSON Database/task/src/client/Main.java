package client;

import java.io.*;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;


import com.beust.jcommander.JCommander;
import com.google.gson.Gson;

public class Main {
    private static final String SERVER_ADDRESS = "127.0.0.1";
    private static final int SERVER_PORT = 23456;

    public static void main(String[] args) {
        Args argv = new Args();

        JCommander.newBuilder()
                .addObject(argv)
                .build()
                .parse(args);

        Map<String, String> message = new HashMap<>();

        switch (argv.type) {
            case "get":
            case "delete":
                message.put("type", argv.type);
                message.put("key",  argv.key);
                break;
            case "set":
                message.put("type", argv.type);
                message.put("key", argv.key);
                message.put("value", argv.value);
                break;
            case "exit":
                message.put("type", argv.type);
                break;
        }

        Gson gson = new Gson();

        try (
                Socket socket = new Socket(SERVER_ADDRESS, SERVER_PORT);
                DataInputStream input = new DataInputStream(socket.getInputStream());
                DataOutputStream output = new DataOutputStream(socket.getOutputStream())
        ) {
            System.out.println("Client started!");
            System.out.println("Sent: " + gson.toJson(message));
            output.writeUTF(gson.toJson(message));

            String receivedMsg = input.readUTF();
            System.out.println("Received: " + receivedMsg);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
