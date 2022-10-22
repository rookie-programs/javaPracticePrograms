import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String categories;
        int groceries;
        int tech;

        // To loop the process.
        while (true) {
            System.out.println("\n|--------------------------------------------------|" +
                    "\n|   Welcome to rookie-programs' convenient store!  |" +
                    "\n|           Here's the categories of items         |" +
                    "\n|             T - Digital Accessories              |" +
                    "\n|             G - Groceries                        |" +
                    "\n|--------------------------------------------------|" +
                    "\n|--------------------------------------------------|" +
                    //"\n|             C - Check cart                       |" + //TODO: Add this option.
                    "\n|             E - EXIT                             |" +
                    "\n|--------------------------------------------------|");

            Scanner categoriesInput = new Scanner(System.in);
            categories = categoriesInput.nextLine();

                switch (categories) {
                    case "T":
                        System.out.println("|---------------------------------------------------------|" +
                                "\n|               Welcome to Tech Corner!                   |" +
                                "\n|               Here's the list of items                  |" +
                                "\n|          1 - Apple AirPods Max($549.00)                 |" +
                                "\n|          2 - Apple Watch Sport Band($49.99)             |" +
                                "\n|     3 - Logitech Wireless Keyboard and Mouse($19.99)    |" +
                                "\n|          4 - Nikon Z9 Mirrorless Camera($5,496.95)      |" +
                                "\n|---------------------------------------------------------|");

                        Scanner techItem = new Scanner(System.in);
                        tech = techItem.nextInt();

                        System.out.printf("Are you sure tou want to buy item %d? (y/n)\n", tech);
                        Scanner inputAnswer = new Scanner(System.in);
                        String answer = inputAnswer.nextLine();

                        if (answer.equals("y")){
                            System.out.println("Purchase successful!");
                        }
                        else if(answer.equals("n")){
                            System.out.println("Revisiting the store....");
                        }

                        break;

                    case "G":
                        System.out.println("|--------------------------------------------------------------------------|" +
                                "\n|               Welcome to Groceries Corner!                               |" +
                                "\n|                 Here's the list of items                                 |" +
                                "\n|          1 - Best Foods Mayonnaise($12.43)                               |" +
                                "\n|          2 - belVita Breakfast Biscuit, Cinnamon Brown Sugar($16.93)     |" +
                                "\n|          3 - Kirkland Signature Salted Butter Quarters($17.78)           |" +
                                "\n|          4 - Nabisco Ritz Crackers($11.62)                               |" +
                                "\n|--------------------------------------------------------------------------|");

                        Scanner groceriesItem = new Scanner(System.in);
                        groceries = groceriesItem.nextInt();

                        System.out.printf("Are you sure tou want to buy item %d? (y/n)\n", groceries);
                        Scanner inputAnswer1 = new Scanner(System.in);
                        String answer1 = inputAnswer1.nextLine();

                        if (answer1.equals("y")){
                            System.out.println("Purchase successful!");
                            }

                        else if(answer1.equals("n")){
                            System.out.println("Revisiting the store....");
                        }
                        break;

                    case "E":
                        System.out.println("Exiting system...");
                        break;

                    default:
                        System.out.println("Invalid category");
                        System.out.println("Breaking system....");
                        break;
                }

                if (categories.equals("E")) {
                    break;
                }
        }

    }
}