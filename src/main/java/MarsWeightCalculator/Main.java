package MarsWeightCalculator;

import java.text.MessageFormat;

public class Main {

        static float marsWeightOgbeiwi;
        static float earthWeightOgbeiwi = 55.8f;
        static float marsGravity = 0.38f;
        public static void main(String[] arg) {
            marsWeightOgbeiwi = earthWeightOgbeiwi * marsGravity;

            //initial result
            System.out.println(MessageFormat.format("{0}kg on Earth is {1}kg on Mars", earthWeightOgbeiwi,marsWeightOgbeiwi));

            //converting to double
            double marsWeightDouble = marsWeightOgbeiwi;
            System.out.println(MessageFormat.format("{0}kg on Earth is {1}kg on Mars after converting to double", earthWeightOgbeiwi,marsWeightDouble));

            //converting to double and limiting to 4
            double marsWeightDoubleAndLimit = marsWeightDouble;
            System.out.println(MessageFormat.format("{0}kg on Earth is {1}kg on Mars after converting to double and limiting to 4 digits", earthWeightOgbeiwi,String.format("%.4f",marsWeightDoubleAndLimit)));

            //converting to int
            int marsWeightInt =(int)marsWeightDoubleAndLimit;
            System.out.println(MessageFormat.format("{0}kg on Earth is {1}kg on Mars after converting to Integer", earthWeightOgbeiwi,marsWeightInt));

            //converting to char
            char marsWeightChar =(char)marsWeightInt;
            System.out.println(MessageFormat.format("{0}kg on Earth is {1}kg on Mars after converting to Char", earthWeightOgbeiwi,marsWeightChar));

            //Math Operation
            int mathOperation = marsWeightChar + 20;
            System.out.println(MessageFormat.format("Math Operation on char type result = {0}",mathOperation));

        }

    }
