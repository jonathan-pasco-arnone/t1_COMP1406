/* Customer program

Created by: Jonathan Pasco-Arnone
Created on: November 2023

*/
public class Customer {
    String name;
    int age;
    float money;
    boolean admitted;
    public Customer(String initName) {
        name = initName;
        age = 0;
        money = 0.0f;
        admitted = false;
    }
    public Customer(String initName, int initAge) {
        name = initName;
        age = initAge;
        money = 0.0f;
        admitted = false;
    }
    public Customer(String initName, int initAge, float initMoney) {
        name = initName;
        age = initAge;
        money = initMoney;
        admitted = false;
    }
    public Customer() {
        name = "No Name";
        age = 0;
        money = 0.0f;
        admitted = false;
    }
    public float computeFee() {
        float fee = 0;
        if (age >= 65) {
            // Rounded from 6.375 to 6.38 for only two decimal places
            fee = 6.38f;
        } else if (age >= 18) {
            fee = 12.75f;
        } else if (age <= 17 && age >= 4) {
            fee = 8.50f;
        }
        return fee;
    }
    public boolean spend(float amount) {
        if ((money - amount) >= 0 && amount >= 0) {
            money -= amount;
            return true;
        }
        return false;
    }
    public boolean hasMoreMoneyThan(Customer c) {
        boolean returnValue = false;
        if (money > c.money) {
            returnValue = true;
        }
        return returnValue;
    }
    public void payAdmission() {
        if (spend(computeFee())) {
            admitted = true;
        }
    }
    public String toString() {
        String stringValue = "Customer " + name + ": a " + age + " year old with $" + money + " who has ";
        if (!admitted) {
            stringValue += "not ";
        }
        stringValue += "been admitted";
        return stringValue;
    }
}
