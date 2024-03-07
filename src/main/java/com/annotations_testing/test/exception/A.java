package com.annotations_testing.test.exception;

//public class A {
//
//        Example () {
//            this("Hi example A")
//            Example A (string S){
//
//                System.out.println(s);
//
//            }
//        }
//}

public class A {

    // Constructor without parameters
    A() {
        // Call the other constructor with a default message
        this("Hi from Example A");
    }

    // Constructor with a String parameter
    A(String s) {
        // Print the provided message
        System.out.println(s);
    }

    public static void main(String[] args) {
        // Create an instance of class A using the default constructor
        A example = new A();
    }
}

