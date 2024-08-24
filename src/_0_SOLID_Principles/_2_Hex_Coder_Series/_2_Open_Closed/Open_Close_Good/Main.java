package _0_SOLID_Principles._2_Open_Closed.Open_Close_Good;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.Socket;
import java.io.OutputStream;

abstract class BaseWriter {
    public abstract void write(byte[] contents);
}

class CustomFileWriter extends BaseWriter {
    @Override
    public void write(byte[] contents) {
        try (BufferedWriter outputFile = new BufferedWriter(new FileWriter("random_file.txt"))) {
            outputFile.write(new String(contents));
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}

class NetworkWriter extends BaseWriter {
    private Socket socket;

    public NetworkWriter() {
        // Initialize socket as needed
        // For the sake of this example, I'm assuming a localhost connection on port 8080
        try {
            this.socket = new Socket("localhost", 8080);
        } catch (IOException e) {
            System.err.println("Error initializing socket: " + e.getMessage());
        }
    }

    @Override
    public void write(byte[] contents) {
        if (socket != null) {
            try {
                OutputStream outputStream = socket.getOutputStream();
                outputStream.write(contents);
                outputStream.flush();
            } catch (IOException e) {
                System.err.println("Error writing to network: " + e.getMessage());
            }
        } else {
            System.err.println("NetworkWriter is not properly initialized.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        CustomFileWriter fileWriter = new CustomFileWriter();
        fileWriter.write("hello world".getBytes());

        NetworkWriter networkWriter = new NetworkWriter();
        networkWriter.write("hello world".getBytes());
    }
}

