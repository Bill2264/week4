package ie.atu.week4;

import javax.swing.*;
import java.io.*;
import java.util.Scanner;

public class WriteOnce {
    static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name of file (e.g. student.txt): ");
        String FileName = sc.nextLine().trim();

        System.out.println("Enter a name to save: ");
        String name = sc.nextLine().trim();

        try(PrintWriter out = new PrintWriter(new FileWriter(FileName, true)))
        {
            out.println(name);
            System.out.println("saved to " + FileName);
        }
        catch(IOException ex)
        {
            System.out.println("Could not write to file: " + ex.getMessage());
        }
    }
}
