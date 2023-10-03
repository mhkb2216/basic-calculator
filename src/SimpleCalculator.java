import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Options:");
            System.out.println("Enter 'add' for addition");
            System.out.println("Enter 'subtract' for subtraction");
            System.out.println("Enter 'multiply' for multiplication");
            System.out.println("Enter 'divide' for division");
            System.out.println("Enter 'quit' to end the program");

            String userChoice = input.nextLine();

            if (userChoice.equals("quit")) {
                break;
            } else if (userChoice.equals("add") || userChoice.equals("subtract") ||
                    userChoice.equals("multiply") || userChoice.equals("divide")) {
                System.out.print("Enter first number: ");
                double num1 = input.nextDouble();

                System.out.print("Enter second number: ");
                double num2 = input.nextDouble();

                double result;

                if (userChoice.equals("add")) {
                    result = num1 + num2;
                } else if (userChoice.equals("subtract")) {
                    result = num1 - num2;
                } else if (userChoice.equals("multiply")) {
                    result = num1 * num2;
                } else {
                    if (num2 == 0) {
                        System.out.println("Error: Cannot divide by zero");
                        continue;
                    }
                    result = num1 / num2;
                }

                System.out.println("Result: " + result);
            } else {
                System.out.println("Invalid input. Please try again.");
            }

            input.nextLine(); // Consume the newline character left in the input buffer
        }

        input.close();
    }
}
