package com.company;

/*
Create two interfaces with the same method (same signature) in both the interfaces.
Implement these two interfaces in one class. Call the method.
 */

public class Program5 implements Interface1, Interface5 {
    int number1 = 10;
    int number2 = 10;
    public static void main(String[] args) {
        Program5 object = new Program5();
        int result = object.add();
        System.out.println("Addition result is: " + result);
    }

    @Override
    public int add() {
        return (number1 + number2);
    }
}
