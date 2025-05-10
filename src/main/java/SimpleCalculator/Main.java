package SimpleCalculator;

import java.text.MessageFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number");
        float firstNumberOgbeiwi = scanner.nextFloat();

        System.out.println("Enter second number");
        float secondNumberOgbeiwi = scanner.nextFloat();

        float addition = firstNumberOgbeiwi + secondNumberOgbeiwi;
        float subtraction = firstNumberOgbeiwi - secondNumberOgbeiwi;
        float division = firstNumberOgbeiwi / secondNumberOgbeiwi;
        float multiplication = firstNumberOgbeiwi * secondNumberOgbeiwi;
        System.out.println(MessageFormat.format("{0} + {1} = {2} ",firstNumberOgbeiwi,secondNumberOgbeiwi, addition));
        System.out.println(MessageFormat.format("{0} - {1} = {2} ",firstNumberOgbeiwi,secondNumberOgbeiwi, subtraction));
        System.out.println(MessageFormat.format("{0} x {1} = {2} ",firstNumberOgbeiwi,secondNumberOgbeiwi, multiplication));
        System.out.println(MessageFormat.format("{0} / {1} = {2} ",firstNumberOgbeiwi,secondNumberOgbeiwi, division));
    }
}

//
//Please create a program that will calculate sum, difference, product and
//a quotient for two user-entered numbers (example
//                                                 variable names: firstNumberBielecki, secondNumberBielecki).
//Variables entered by the user should be assigned to the float type.
//All calculations (sum, difference, product, and quotient) are calculated
//at once (the user does not choose the action to be performed).
//The result of the calculation should be displayed in two decimal places
//