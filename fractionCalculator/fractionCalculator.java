import java.util.Scanner;
import java.util.Arrays;

//This program takes in an expression with whole numbers and/or fractions in its input, and uses addition, subtraction,
// multiplication, and division with the two numbers to compute the answer. 

// This code should pass checkpoint 3, but the fraction answer is not reduced


//Janis Chen
//Period 4

public class FracCalc 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Equation: ");

        String input = in.nextLine();
        while (!input.equals("quit"))
        {
            //Calls the produceAnswer method
            System.out.println(produceAnswer(input));

            System.out.print("Equation: ");
            // Takes in input
            input = in.nextLine();

            // TODO: Read the input from the user and call produceAnswer with an equation
        }
        in.close();

    }
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input)
    { 
        // TODO: Implement this function to produce the solution to the input
        
        //Splits up the input into the first fraction, operand, and the second fraction
        String[] array = input.split(" ");
        String firstFraction = array[0];
        String operand = array[1];
        String secondFraction = array[2];
        
        int whole1;
        int numerator1;
        int denominator1;
        int whole2;
        int numerator2;
        int denominator2;
        int numerator3;
        int denominator3;
        int numerator4;
        int denominator4;
        int totalWhole;
        int totalNumerator;
        int totalDenominator;

        if (secondFraction.contains("_")) 
        {
            //Splits the second fraction up into whole number, numerator, and denominator if the fraction has an underscore
            whole2 = Integer.parseInt(secondFraction.substring(0, secondFraction.indexOf("_")));
            numerator2 = Integer.parseInt(secondFraction.substring(secondFraction.indexOf("_") + 1, secondFraction.indexOf("/")));
            denominator2 = Integer.parseInt(secondFraction.substring(secondFraction.indexOf("/") + 1));
        } 
        else if (secondFraction.contains("/") && !secondFraction.contains("_")) 
        {
            //Splits the second fraction if it has a fraction sign
            whole2 = 0;
            numerator2 = Integer.parseInt(secondFraction.substring(0,secondFraction.indexOf("/")));
            denominator2 = Integer.parseInt(secondFraction.substring(secondFraction.indexOf("/") + 1));
        }
        else
        {
            whole2 = Integer.parseInt(secondFraction.substring(0));
            numerator2 = 0;
            denominator2 = 1;
        }

        if (firstFraction.contains("_")) 
        {
            //Splits the first fraction up into whole number, numerator, and denominator if the fraction has an underscore
            whole1 = Integer.parseInt(firstFraction.substring(0, firstFraction.indexOf("_")));
            numerator1 = Integer.parseInt(firstFraction.substring(firstFraction.indexOf("_") + 1, firstFraction.indexOf("/")));
            denominator1 = Integer.parseInt(firstFraction.substring(firstFraction.indexOf("/") + 1));

        }
        else if (firstFraction.contains("/") &&!firstFraction.contains("_")) 
        {
            //Splits the second fraction if it has a fraction sign
            whole1 = 0;
            numerator1 = Integer.parseInt(firstFraction.substring(0, firstFraction.indexOf("/")));
            denominator1 = Integer.parseInt(firstFraction.substring(firstFraction.indexOf("/") + 1));
        } 
        else 
        {
            whole1 = Integer.parseInt(firstFraction.substring(0));
            numerator1 = 0;
            denominator1 = 1;
        }

        if (whole1 != 0 && whole1 > 0)
        {
            // Makes mixed numbers into improper fractions for the first fraction
            numerator3 = denominator1 * whole1 + numerator1;
            denominator3 = denominator1;
            whole1 = 0;

        }
        else if (whole1 != 0 && whole1 < 0)
        {
            numerator3 = denominator1 * whole1 - numerator1;
            denominator3 = denominator1;
            whole1 = 0;
            
        }
        else 
        {
            numerator3 = numerator1;
            denominator3 = denominator1;

        }
        if (whole2 != 0 && whole2 > 0)
        {
            // Makes mixed numbers into improper fractions for the second fraction
            numerator4 = denominator2 * whole2 + numerator2;
            denominator4 = denominator2;
            whole2 = 0;

        }
        else if (whole2 != 0 && whole2 < 0)
        {
            numerator4 = denominator2 * whole2 - numerator2;
            denominator4 = denominator2;
            whole2 = 0;
            
        }
        else 
        {
            numerator4 = numerator2;
            denominator4 = denominator2;

        }

        if (operand.equals("*"))
        {
            //Checks to see if the operand includes a multiplication sign, and then multiplies the two improper fractions
            
            if (numerator3 < 0 || numerator4 < 0)
            {
                //Checks and multiplies if one of the fractions is negative
                totalNumerator = numerator3 * numerator4;
                totalDenominator = denominator3 * denominator4;
                
            }
            if (numerator3 < 0 && numerator4 < 0)
            {
                //Checks and multiplies if both of the fractions are negative
                totalNumerator = numerator3 * numerator4;
                totalNumerator = Math.abs(totalNumerator);
                totalDenominator = denominator3 * denominator4;
            }
            else 
            {
                totalNumerator = numerator3 * numerator4;
                totalDenominator = denominator3 * denominator4;
            }

        }
        else if (operand.equals("/"))
        {
            //Checks to see if the operand is the division sign and divides the fractions
            
            if (numerator3 < 0 || numerator4 < 0)
            {
                //Checks and divides if one of the fractions is negative
                totalNumerator = numerator3 * denominator4;
                totalDenominator = denominator3 * numerator4;
                
            }
            else if (numerator3 < 0 && numerator4 < 0)
            {
                //Checks and divides if both of the fractions are negative
                totalNumerator = numerator3 * numerator4;
                totalNumerator = Math.abs(totalNumerator);
                totalDenominator = denominator3 * denominator4;

            }
            else 
            {

                totalNumerator = numerator3 * denominator4;
                totalDenominator = denominator3 * numerator4;
            }
        }
        else if (operand.equals("+"))
        {
            //Checks to see if the operand is the addition sign and adds the fractions
            
            if (numerator3 < 0)
            {
                //Checks and adds if one of the fractions is negative
                numerator3 = Math.abs(numerator3);
                totalDenominator = denominator3 * denominator4;
                numerator3 = numerator3 * denominator4;
                numerator4 = numerator4 * denominator3;
                totalNumerator = numerator4 - numerator3;
            }
            else if (numerator4 < 0)
            {
                numerator4 = Math.abs(numerator4);
                totalDenominator = denominator3 * denominator4;
                numerator3 = numerator3 * denominator4;
                numerator4 = numerator4 * denominator3;
                totalNumerator = numerator3 - numerator4;

            }
            else 
            {
                totalDenominator = denominator3 * denominator4;
                numerator3 = numerator3 * denominator4;
                numerator4 = numerator4 * denominator3;
                totalNumerator = numerator3 + numerator4;
            }
            
        }
        else 
        {
            // Subtracts the two fractions
            if (numerator4 < 0)
            {
                //Checks and subtracts if one of the fractions is negative
                numerator4 = Math.abs(numerator4);
                totalDenominator = denominator3 * denominator4;
                numerator3 = numerator3 * denominator4;
                numerator4 = numerator4 * denominator3;
                totalNumerator = numerator3 + numerator4;

            }
            else if (numerator3 < 0)
            {
                totalDenominator = denominator3 * denominator4;
                numerator3 = numerator3 * denominator4;
                numerator4 = numerator4 * denominator3;
                totalNumerator = numerator3 - numerator4;

            }
            else if (numerator3 < 0 && numerator4 < 0)
            {
                totalDenominator = denominator3 * denominator4;
                numerator3 = numerator3 * denominator4;
                numerator4 = numerator4 * denominator3;
                totalNumerator = numerator3 + Math.abs(numerator4);

            }
            else 
            {
                totalDenominator = denominator3 * denominator4;
                numerator3 = numerator3 * denominator4;
                numerator4 = numerator4 * denominator3;
                totalNumerator = numerator3 - numerator4;
            }
        }
        
        //Combines results into an improper String fraction and print the answer
        String result = + totalNumerator + "/" + totalDenominator;
        return result;

    }

}
