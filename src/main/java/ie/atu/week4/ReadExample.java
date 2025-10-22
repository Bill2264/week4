package ie.atu.week4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadExample {
    static void main(String[] args) {
        showFile();
    }

    static void showFile() {
        BufferedReader br = null;
        try {
            FileReader neverUsed = new FileReader("student.txt");//finds file
            br = new BufferedReader(neverUsed);
            System.out.println("Contents of student.txt:");
            String line;
            while ((line = br.readLine()) != null) {//prints till file empty
                System.out.println(" - " + line);
            }
        } catch (IOException ex) {//error if file not found
            System.out.println("Could not read file: " + ex.getMessage());
        } finally {
            if (br != null) {//closes file
                try {
                    br.close();
                } catch (IOException ex) {//error if file not closed
                    System.out.println("Could not close file: " + ex.getMessage());
                }
            }
        }
    }
}