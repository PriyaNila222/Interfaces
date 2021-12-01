package com.company;

//Create an interface with two methods, but implement only one in a class. Call the method implemented.

public class Program2 implements Interface2 {
    int number1 = 10;
    int number2 = 20;

    public static void main(String[] args) {
        Program2 object = new Program2();
        int result = object.add(object.number1, object.number2);
        System.out.println("Addition result: " + result);
    }

    @Override
    public int add(int number1, int number2) {
        return (number1 + number2);
    }

// It is mandatory to implement all the methods in the class that implement an interface
    @Override
    public void print() {
        System.out.println("Result is printed");
    }


}
