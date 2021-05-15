package server;

import java.io.*;
import java.net.*;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.*;


public class Main {

    public static final int PORT = 23456;

    public static void main(String[] args) {
        JDatabase JSON = new JDatabase();

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
                    String msg = input.readUTF();

                    Gson gson = new Gson();
                    JsonData jsonData = gson.fromJson(msg, JsonData.class);

                    Map<String, String> response = new HashMap<>();

                    switch (jsonData.getType()) {
                        case "set":
                            response.put("response", JSON.set(jsonData.getKey(), jsonData.getValue()));
                            break;
                        case "get":
                            result = JSON.get(jsonData.getKey());
                            if (result.equals("ERROR")) {
                                response.put("response", result);
                                response.put("reason", "No such key");
                            } else {
                                response.put("response", "OK");
                                response.put("value", result);
                            }
                            break;
                        case "delete":
                            result = JSON.delete(jsonData.getKey());
                            if (result.equals("ERROR")) {
                                response.put("response", result);
                                response.put("reason", "No such key");
                            } else {
                                response.put("response", "OK");
                            }
                            break;
                        case "exit":
                            exit = true;
                            response.put("response", "OK");
                            break;
                    }
                    Gson message = new Gson();
                    output.writeUTF(message.toJson(response));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
