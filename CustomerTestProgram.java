/* Customer testing program

Created by: Jonathan Pasco-Arnone
Created on: November 2023

*/
public class CustomerTestProgram {
    public static void main(String[] args) {
        Customer c;

        c = new Customer("Bob");
        c.age = 27;
        c.money = 50;
        System.out.println(c.name);
        System.out.println(c.age);
        System.out.println(c.money);

        System.out.println();

        Customer me = new Customer("Jonathan");

        me.age = 18;
        me.money = 9999999;
        System.out.println(me.name);
        System.out.println(me.age);
        System.out.println(me.money);
    }
}