package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1");

        String name = "Anna";
        int age = 20;
        float weight = 59.6f;
        System.out.println("Name = " + name + "; Age = " + age + "; Weight = " + weight);

        System.out.println("Task 2");

        int a = 1;
        int b = 2;
        System.out.println("Before");
        System.out.println("a = " + a + "; b = " + b);

        System.out.println("After");
        System.out.println("a = " + b + "; b = " + a);
        
        System.out.println("Task 3");

         int a1 = 5;
         int b1 = 3;
        System.out.println("Before");
        System.out.println("a = " + a1 + "; b = " + b1 );

        a1 = a1 + b1;
        b1 = a1 - b1;
        a1 = a1 - b1;
        System.out.println("After");
        System.out.println("a = " + a1 + "; b = " + b1 );


    }
}