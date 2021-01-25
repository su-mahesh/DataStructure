package com.bridgelabz;

public class MyQueue {

    private final LinkedList myLinkedList;

    public MyQueue() {
        this.myLinkedList = new LinkedList();
    }

    public void enqueue(MyNode myNode) {
        myLinkedList.append(myNode);
    }


    public INode peek() {
        return myLinkedList.getHead();
    }

    public INode dequeue() {
       return myLinkedList.pop();
    }
}
