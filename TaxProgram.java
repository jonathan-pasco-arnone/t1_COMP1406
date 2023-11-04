/* Tax Program

Created by: Jonathan Pasco-Arnone
Created on: November 2023

*/
import java.util.Scanner;

public class TaxProgram {
    public static void main(String[] args) {
        double income, fedTax, provTax;
        int dependents;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your taxable income: ");
        income = input.nextDouble();
        System.out.println();
        System.out.print("Please enter your number of dependents: ");
        dependents = input.nextInt();
        System.out.println();

        // Federal tax calculation
        if (income <= 29590) {
            fedTax = 0.17 * income;
        } else if (29590.01 <= income && income <= 59179.99) {
            /*
            The rounding and the times/divide by 100 is so that the numbers remains as 2 decimal places
            Additionally, since Math.round converts to float value, I need to change it back to a double using (double)
            */
            fedTax = (double) Math.round((0.17 * 29590 + 0.26 * (income - 29590)) * 100) / 100;
        } else {
            // The 0.43 is the same as 0.17 + 0.26
            fedTax = (double) Math.round(( 0.43 * 29590 + 0.29 * (income - 59180)) * 100) / 100;
        }

        // Provincial tax calculation
        provTax = (double) Math.round((0.425 * fedTax - (160.5  + 328 * dependents)) * 100) / 100;

        System.out.println("Your fedTax is: " + fedTax);
        System.out.println("Your provTax is: " + provTax);
        System.out.println("Your total tax is: " + (provTax + fedTax));
    }
}
