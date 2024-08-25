package _0_SOLID_Principles._2_Hex_Coder_Series._1_Single_Resposibility.Single_Responsibility_Good;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class Logger {
    public void log(String message) {
        try (BufferedWriter logFile = new BufferedWriter(new FileWriter("error_log.txt", true))) {
            logFile.write("Error: " + message + "\n");
        } catch (IOException e) {
            // Handle logging error if needed
            System.err.println("Error writing to log file: " + e.getMessage());
        }
    }
}

class DatabaseWriter {
    private Object database;
    private Logger logger;

    public DatabaseWriter(Object database, Logger logger) {
        this.database = database;
        this.logger = logger;
    }

    public void write(Object[] record) {
        try {
            // Assuming a write(Object[]) method exists for the database object
            database.getClass().getMethod("write", Object[].class).invoke(database, new Object[]{record});
        } catch (Exception e) {
            logger.log("Error: " + e.getMessage());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Object database = new Object(); // Replace with actual database object
        DatabaseWriter writer = new DatabaseWriter(database, new Logger());
        // Example usage
        writer.write(new Object[]{"data1", "data2"});
    }
}

