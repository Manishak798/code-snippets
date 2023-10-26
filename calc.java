import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double number1 = scanner.nextDouble();

        System.out.println("Enter the second number: ");
        double number2 = scanner.nextDouble();

        System.out.println("Enter the operator (+, -, *, /): ");
        String operator = scanner.next();

        double result;
        switch (operator) {
            case "+" -> result = number1 + number2;
            case "-" -> result = number1 - number2;
            case "*" -> result = number1 * number2;
            case "/" -> result = number1 / number2;
            default -> throw new IllegalArgumentException("Invalid operator");
        }

        System.out.println(number1 + " " + operator + " " + number2 + " = " + result);
    }
}
