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
            fedTax = 0.17 * 29590 + 0.26 * (income - 29590);
        } else {
            // The 0.43 is the same as 0.17 + 0.26
            fedTax =  0.43 * 29590 + 0.29 * (income - 59180);
        }

        // Provincial tax calculation
        provTax = 0.425 * fedTax - (160.5  + 328 * dependents);

        // Printing
        System.out.println("Here is your tax breakdown:");
        System.out.println(String.format("Income: %20s", String.format("$%,1.2f", income)));
        System.out.println(String.format("Dependants: %16s", dependents));
        System.out.println("----------------------------");
        System.out.println(String.format("Federal Tax: %15s", String.format("$%,1.2f", fedTax)));
        System.out.println(String.format("Provincial Tax: %12s", String.format("$%,1.2f", provTax)));
        System.out.println("============================");
        System.out.println(String.format("Total Tax: %17s", String.format("$%,1.2f", (fedTax + provTax))));
    }
}
