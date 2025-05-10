package BmiCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter height in m");
        float heightOgbeiwi = input.nextFloat();

        System.out.println("Enter weight in kg");
        float weightOgbeiwi = input.nextFloat();

        float calculation = weightOgbeiwi / (float) Math.pow(heightOgbeiwi,2);
        System.out.println(calculation);

        if(calculation < 16.00) System.out.println("Starvation");
        else if (calculation >= 16.00 && calculation <= 16.99) System.out.println("Emaciation");
        else if (calculation >= 17.00 && calculation <= 18.49) System.out.println("Underweight");
        else if (calculation > 18.50 && calculation <= 22.99) System.out.println("Normal, low range");
        else if (calculation >= 23.00 && calculation <= 24.99) System.out.println("Normal, high range");
        else if (calculation > 25.00 && calculation <= 27.49) System.out.println("Overweight, low range");
        else if (calculation >= 27.50 && calculation <= 29.99) System.out.println(" Overweight, high range");
        else if (calculation > 30 && calculation <= 34.9) System.out.println("1st degree obesity");
        else if (calculation >= 35 && calculation <= 39.9) System.out.println("2nd degree obesity");
        else if (calculation >= 40) System.out.println("Obesity");
    }
}


//
//Please create a program that will calculate the BMI (I encourage you to use the Math.pow () method) after
//user enters his height and weight (example variable names: heightBielecki, weightBielecki) - the variables passed by the user are assigned to
//the float type.
//After calculating the BMI value, thanks to the if-else-if ladder statement, the value will be assigned to the appropriate range and the correct
//message will appear on the console. Intervals
//of BMI index:-    16.00 – starvation
//16.00 - 16.99 – emaciation--------
//        17.00 - 18.49 – underweight
// 18.50 - 22.99 – normal, low range
// 23.00 - 24.99 – normal, high range
// 25.00 - 27.49 – overweight, low range
// 27.50 - 29.99 – overweight, high range
// 30 - 34.9 – 1st degree obesity
// 35 - 39.9 – 2nd degree obesity
// 40 – 3rd degree obesity