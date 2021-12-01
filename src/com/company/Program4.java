package com.company;

//Create two interfaces with one method each. Implement these two interfaces in one class.

public class Program4 implements Interface1,Interface4{
    int number1 = 50;
    int number2 = 10;

    public static void main(String[] args) {
        Program4 object = new Program4();
        int additionResult = object.add();
        int subtractionResult = object.sub();
        System.out.println("Addition result: " + additionResult);
        System.out.println("Subtraction result: " + subtractionResult);
    }

    @Override
    public int add() {
        return (number1 + number2);
    }

    @Override
    public int sub() {
        return (number1 - number2);
    }
}
