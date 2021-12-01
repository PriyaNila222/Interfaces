package com.company;

/*
Create a PUBLIC interface with fields and methods, fields should have values assigned.
Implement this interface to some class and print the values of the interface fields and
call the interface method
 */

public class Program8 implements  Interface8 {
    public static void main(String[] args) {
        Program8 object = new Program8();
        System.out.println("Value assigned is: " + value);
        int number = value;
        int multiplicationResult = object.mul(number);
        System.out.println("Multiplication result: " + multiplicationResult);

    }

    @Override
    public int mul(int number) {
        return (number * number);
    }
}
