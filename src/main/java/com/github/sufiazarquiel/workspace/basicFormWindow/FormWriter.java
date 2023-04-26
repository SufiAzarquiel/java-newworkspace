package com.github.sufiazarquiel.workspace.basicFormWindow;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * Class that writes the results of Form to a text file
 */
public class FormWriter {
    private String csvFilePath;
    private FileWriter writer;

    public FormWriter(String csvFilePath) {
        this.csvFilePath = csvFilePath;
        this.writer = null;
    }

    public String getCsvFilePath() {
        return csvFilePath;
    }

    public void setCsvFilePath(String csvFilePath) {
        this.csvFilePath = csvFilePath;
    }

    public void saveFormData(ArrayList<String> data) {
        try {
            writer = new FileWriter(csvFilePath, true);
            // Only two fields in this form, so we can hardcode the loop
            String writeString = data.get(0) + ", " + data.get(1) + "\n";
            writer.write(writeString);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
