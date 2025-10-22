package ie.atu.week4;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {
        int age = 0;
        Scanner scan1 = new Scanner(System.in);

        while(true) {
            System.out.println("Please enter your age: ");
            String text = scan1.nextLine().trim();
            try {
                age = Integer.parseInt(text);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input");
            }
        }
        System.out.println("Thanks! the age you entered = " + age);
    }
}

