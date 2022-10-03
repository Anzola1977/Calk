import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Calk {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        double val1;
        double val2;
        char operand;
        char calculatorOperator = 'c';
        double result = 0;

        do {
            if (calculatorOperator == 'c') {
                System.out.println("Input val1: ");
                val1 = scanner.nextDouble();
                System.out.println("Input operand: ");
                operand = scanner.next().charAt(0);
            } else {
                val1 = result;
                operand = calculatorOperator;
            }
            System.out.println("Input val2: ");
            val2 = scanner.nextDouble();
            result = calculate(val1, val2, operand);
            System.out.println(val1 + " " + operand + " " + val2 + " = " + result);
            calculatorOperator = scanner.next().charAt(0);
        } while (calculatorOperator != 's');
    }

    public static double calculate(double val1, double val2, char operand) {

        return switch (operand) {
            case '+' -> val1 + val2;
            case '-' -> val1 - val2;
            case '*' -> val1 * val2;
            case '/' -> val1 / val2;
            default -> {
                System.out.println("wrong operand");
                yield 0;
            }
        };
    }

//        Scanner scanner1 = new Scanner(new File("input.txt"));
    //      while (scanner1.hasNext())
    //        System.out.println(scanner1.next());


}