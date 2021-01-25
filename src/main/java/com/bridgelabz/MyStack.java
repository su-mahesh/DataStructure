package com.bridgelabz;

public class MyStack {

    private final LinkedList myLinkedList;

    public MyStack() {
        this.myLinkedList = new LinkedList();
    }

    public void push(INode node1) {
        myLinkedList.add(node1);
    }


    public INode peek() {
        return myLinkedList.getHead();
    }
}
