package SimpleCalculator;

import java.text.MessageFormat;
import java.util.Scanner;

public class ChooseOperator {
    public static void main(String[] args) {
boolean exit = false;
        do {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter first number");
            float firstNumberOgbeiwi = scanner.nextFloat();

            System.out.println("Choose Operator: addition(+), subtraction(-), multiplication(*), division(/)");
            char operator = scanner.next().charAt(0);

            System.out.println("Enter second number");
            float secondNumberOgbeiwi = scanner.nextFloat();

            float solution = 0;
            switch (operator) {
                case '+':
                    solution = firstNumberOgbeiwi + secondNumberOgbeiwi;
                    break;

                case '-':
                    solution = firstNumberOgbeiwi - secondNumberOgbeiwi;
                    break;

                case '*':
                    solution = firstNumberOgbeiwi * secondNumberOgbeiwi;
                    break;

                case '/':
                    if (secondNumberOgbeiwi == 0) {
                        System.out.println("Cannot be divisible by 0");
                        return;
                    }
                    solution = firstNumberOgbeiwi / secondNumberOgbeiwi;
                    break;

                default:
                    System.out.println("Wrong Operator");
            }
            System.out.println(MessageFormat.format("{0} {1} {2} = {3}", firstNumberOgbeiwi, operator, secondNumberOgbeiwi, solution));
            System.out.println("Rerun? (y/n)");
            if(scanner.next().toLowerCase().charAt(0) == 'n') exit = true;
        }
        while (!exit);
    }
}