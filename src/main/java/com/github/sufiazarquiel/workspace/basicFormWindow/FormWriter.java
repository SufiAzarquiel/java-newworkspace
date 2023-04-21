package com.github.sufiazarquiel.workspace.basicFormWindow;

//import java.io.FileWriter;
//import java.io.IOException;

/*
 * Class that writes the results of Form to a text file
 */
public class FormWriter {
    // private FileWriter writer;
    private String csvFilePath;

    public FormWriter(String csvFilePath) {
        this.csvFilePath = csvFilePath;
        /*try {
            writer = new FileWriter(csvFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }

    public String getCsvFilePath() {
        return csvFilePath;
    }

    public void setCsvFilePath(String csvFilePath) {
        this.csvFilePath = csvFilePath;
    }

    
}
