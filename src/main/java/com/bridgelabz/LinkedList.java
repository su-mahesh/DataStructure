package com.bridgelabz;

public class LinkedList {
    private INode head;
    private INode tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(INode newNode) {
        if(this.tail == null)
            this.tail = newNode;

        if(this.head == null)
            this.head = newNode;
        else{
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }
    public void append(INode newNode) {

        if(this.head == null)
            this.head = newNode;

        if(this.tail == null)
            this.tail = newNode;
        else {
            INode tempNode = this.tail;
            tempNode.setNext(newNode);
            this.tail = newNode;
        }

    }

    public INode getHead() {
        return this.head;
    }

    public INode getTail() {
        return this.tail;
    }

    public void insert(INode previousNode, INode newNode, INode nextNode) {
        previousNode.setNext(nextNode);
        newNode.setNext(nextNode);
    }

    public void pop() {
        this.head = this.head.getNext();
    }
}
