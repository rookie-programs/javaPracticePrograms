import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String method;
        double celsius;
        double fahrenheit;
        double total;

        System.out.println("|----------------------------------|" +
                "\n|----Welcome to unit converter-----|" +
                "\n|----Celsius to Fahrenheit(CTF----|" +
                "\n|----Fahrenheit to Celsius(FTC)----|" +
                "\n|----------------------------------|");
        System.out.println("");
        System.out.print("Please enter the method of conversion:\n");
        Scanner methodInput = new Scanner(System.in);
        method = methodInput.nextLine();

        if (method.equals("CTF")) {
            System.out.print("Please enter a value:\n");
            Scanner inputtedCelsius =  new Scanner(System.in);
            celsius = methodInput.nextDouble();

            total = ((9.0 / 5.0) * celsius) + 32;

            System.out.printf("%f celsius in fahrenheit is:\n%f" , celsius, total);
        }

        else if (method.equals("FTC")) {
            System.out.print("Please enter a value:\n");
            Scanner inputtedFahrenheit =  new Scanner(System.in);
            fahrenheit = methodInput.nextDouble();

            total = (fahrenheit - 32) * (5.0 / 9.0);

            System.out.printf("%f fahrenheit in celsius is:\n%f" , fahrenheit, total);
        }

        else {
            System.out.println("Please enter a valid method... killing console...");
            System.exit(0);
        }

    }
}