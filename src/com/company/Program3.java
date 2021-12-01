package com.company;

//Use Interface instances to call the implemented method in the implemented class

public class Program3   {
    public static void main(String[] args) {
        Interface2 object = new Program2();
        int additionResult = object.add(10,20);
        System.out.println("Addition result: " + additionResult);
        object.print();
    }
}
