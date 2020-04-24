package com.company;

import java.util.Scanner;

public class NameAgeSalary {
    public void calculateNameAgeSalary() {

        Scanner s = new Scanner(System.in);

        String input;
        int age = 0;
        int salary = 0;

        System.out.println("Hello. What is your name?");

        input = s.nextLine();

        System.out.println("Hi, " + input  +  " How old are you?");

        age = s.nextInt();

        System.out.println("so you're " + age + " eh?" + " That's not old at all!");


        System.out.println("How much do you make, " + input + "?");

        salary = s.nextInt();

        System.out.println(salary + "!" + " I hope thats's per hour and not per year! LOL!");


    }
}
