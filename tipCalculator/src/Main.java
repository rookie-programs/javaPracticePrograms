//TODO: print an invalid error message if the user enters a string or char.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double amount;
        double tip;
        double total;

        System.out.print("Please enter the amount:\n");
        Scanner userInput = new Scanner(System.in);

        amount = userInput.nextDouble();

        System.out.print("Enter the tip percent:\n");
        Scanner tipInput = new Scanner(System.in);

        tip = tipInput.nextDouble();

        System.out.print("Total:\n");

        total = ((tip / 100) * amount) + amount;

        System.out.printf("%f" ,total);

    }
}