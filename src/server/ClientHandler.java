package server;

import java.io.*;
import java.net.*;

public class ClientHandler extends Thread {
    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;

    public ClientHandler(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        try {
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);

            out.println("Welcome! You can now start chatting.");

            String message;
            while ((message = in.readLine()) != null) {
                System.out.println("Received: " + message);
                Server.broadcast("[" + socket.getRemoteSocketAddress() + "]: " + message, this);
            }

        } catch (IOException e) {
            System.out.println("Error handling client: " + socket.getRemoteSocketAddress());
        } finally {
            Server.removeClient(this);
            try {
                socket.close();
            } catch (IOException e) {}
        }
    }

    void sendMessage(String message) {
        out.println(message);
    }
}
