package _0_SOLID_Principles._1_Single_Resposibility.Single_Responsibility_Bad;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Single_Responsibility_Bad {
    private final Single_Responsibility_Bad database;

    public Single_Responsibility_Bad(Single_Responsibility_Bad database) {
        this.database = database;
    }

    public void write(Object[] record) {
        try {
            database.write(record);
        } catch (Exception e) {
            logError(e);
        }
    }

    private void logError(Exception e) {
        try (BufferedWriter logWriter = new BufferedWriter(new FileWriter("error_log.txt", true))) {
            logWriter.write("Error: " + e.getMessage() + "\n");
        } catch (IOException ioException) {
            // Handle error logging to a different location or using a different mechanism
            System.err.println("Failed to log error to file: " + ioException.getMessage());
        }
    }
}

