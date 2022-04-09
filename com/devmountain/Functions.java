package com.devmountain;

public class Functions {
    public void helloWorld() {
        System.out.println("Hello world!");
    }

    public void greeting(String name) {
        System.out.println("Hello " + name + ".");
    }

    public float add(float num1, float num2) {
        return num1 + num2;
    }

    public void faveColorFinder(String color) {
        if (color == "red") {
            System.out.println("Red is a great color");
        } else if (color == "green") {
            System.out.println("Green is a solid favorite color.");
        } else if (color == "black") {
            System.out.println("Black is so trendy.");
        } else if (color == "charcoal grey") {
            System.out.println("You are a truly a giant among men.");
        } else {
            System.out.println("That color is subpar.");
        }
    }

    public String thatsOdd(int num) {
        if (num % 2 == 0) {
            System.out.println("That's not odd.");
        } else {
            System.out.println("That is odd indeed.");
        }
    }

    public void bigOrSmall(int[] arr) {
        String[] answers = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 100) {
                answers[i] = "big";
            } else {
                answers[i] = "small";
            }
        }
        System.out.println(answers);
    }


    public void main(String[] args) {
        helloWorld();
    }
}


