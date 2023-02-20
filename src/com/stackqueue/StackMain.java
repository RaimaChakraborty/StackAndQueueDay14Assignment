package com.stackqueue;

public class StackMain {
    public static void main(String[] args) {
        CreateStack stackcount = new CreateStack();               //creating new object of class LinkedList
        stackcount.push(70);                               //pushing elements one by one
        stackcount.push(30);
        stackcount.push(56);
        stackcount.display();
    }
}
