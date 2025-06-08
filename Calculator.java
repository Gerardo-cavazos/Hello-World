import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operation;
        double num1, num2;
        String continueCalc;

        do {
            // Ask for operation
            System.out.print("Enter an operation (+, -, *, /, or exit): ");
            operation = scanner.nextLine().trim();

            // Check for exit
            if (operation.equalsIgnoreCase("exit")) {
                break;
            }

            // Validate operator
            if (!(operation.equals("+") || operation.equals("-") || operation.equals("*") || operation.equals("/"))) {
                System.out.println("Invalid operation. Please enter +, -, *, /, or exit.");
                continue;
            }

            // Get operands
            try {
                System.out.print("Enter the first number: ");
                num1 = Double.parseDouble(scanner.nextLine());

                System.out.print("Enter the second number: ");
                num2 = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter numeric values.");
                continue;
            }

            // Range check
            if ((num1 < -1000 || num1 > 1000) || (num2 < -1000 || num2 > 1000)) {
                System.out.println("Numbers must be between -1000 and 1000.");
                continue;
            }

            // Handle division by zero
            if (operation.equals("/") && num2 == 0) {
                System.out.println("Error: Division by zero is not allowed.");
            } else {
                double result = 0;
                switch (operation) {
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                    case "*":
                        result = num1 * num2;
                        break;
                    case "/":
                        result = num1 / num2;
                        break;
                }
                System.out.println("The result of " + num1 + " " + operation + " " + num2 + " = " + result);
            }

            // Ask if user wants to continue
            System.out.print("Would you like try a different operation (yes/no)? ");
            continueCalc = scanner.nextLine().trim().toLowerCase();

        } while (continueCalc.equals("yes"));

        scanner.close();
    }
}
