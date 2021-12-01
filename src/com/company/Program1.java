package com.company;

//Create an interface with only one method and implement it in a class. Call the method implemented.

public class Program1 implements Interface1 {
    public static void main(String[] args) {
        Program1 object = new Program1();
        int result = object.add();
        System.out.println("Addition resutl: " + result);

    }

    @Override
    public int add() {
        return (10 + 20);
    }
}
