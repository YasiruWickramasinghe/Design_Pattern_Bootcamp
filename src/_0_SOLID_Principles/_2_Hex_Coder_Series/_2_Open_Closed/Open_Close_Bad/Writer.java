package _0_SOLID_Principles._2_Hex_Coder_Series._2_Open_Closed.Open_Close_Bad;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    private int type;

    public Writer(int type) {
        this.type = type;
    }

    public void write(byte[] contents) {
        if (this.type == 0) { // File Writer
            try (BufferedWriter outputFile = new BufferedWriter(new FileWriter("random_file.txt"))) {
                outputFile.write(new String(contents));
            } catch (IOException e) {
                System.err.println("Error writing to file: " + e.getMessage());
            }
        } else if (this.type == 1) { // Network Writer
            // Replace the following line with the appropriate network writing logic
            // For example, if you have a socket object named 'someSocket', you would write:
            // someSocket.getOutputStream().write(contents);
            System.out.println("Network Writer: " + new String(contents));
        } else if (this.type == 2) { // Database
            // Replace the following line with the appropriate database writing logic
            // For example, if you have a database object named 'db', you would write:
            // db.write(contents);
            System.out.println("Database Writer: " + new String(contents));
        }
    }

    public static void main(String[] args) {
        Writer fileWriter = new Writer(0);
        Writer networkWriter = new Writer(1);

        // Example usage
        fileWriter.write("This is some text for the file.".getBytes());
        networkWriter.write("This is some text for the network.".getBytes());
    }
}

