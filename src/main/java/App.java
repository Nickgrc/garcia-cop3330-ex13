import java.util.Scanner;
import java.lang.Math;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nickolas Garcia
 */


public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //constants
        final double con = 100;
        final double one = 1;

        System.out.print("What is the principal amount? ");
        String principal = in.nextLine();

        System.out.print("What is the rate? ");
        String interest = in.nextLine();

        System.out.print("What is the number of years? ");
        String years = in.nextLine();

        System.out.print("What is the number of times the interest is compounded per year? ");
        String compound = in.nextLine();

        int p = Integer.parseInt(principal);
        double b = Double.parseDouble(interest);
        int c = Integer.parseInt(years);
        int d = Integer.parseInt(compound);
        double f = b / con;
        //math.pow allows for exponent
        double exp = p * Math.pow((one + f / d), d * c);
        //rounding
        String s = String.format("%.2f", exp);
        //single output statement
        System.out.print("$" + principal + " invested at " + b + "% for " + c + " years compounded " + d +
                " times per year is $" + s);






    }
}
