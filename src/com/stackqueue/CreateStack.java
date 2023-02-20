package com.stackqueue;
public class CreateStack {
    private MyNode head;
    public void push(int data)
    {
        MyNode node1 = new MyNode(data);
        node1.next = head;
        head =node1;
    }
    public void display()
    {
        MyNode assignNode = head;
        System.out.print("Stack display : ");
        while (assignNode != null){
            System.out.printf("%s ", assignNode.num);
            assignNode= assignNode.next;
        }
    }
}

