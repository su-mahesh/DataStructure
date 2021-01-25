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

    public void insert(INode previousNode, INode newNode) {
        newNode.setNext(previousNode.getNext());
        previousNode.setNext(newNode);
    }

    public void pop() {
        this.head = head.getNext();
    }

    public void popLast() {
        INode tempNode = head;
        while (!tempNode.getNext().equals(tail)) {
            tempNode = tempNode.getNext();
        }   tempNode.setNext(null);
            this.tail = tempNode;
    }

    public boolean searchNode(INode searchNode) {

        INode tempNode = head;
        while (tempNode.getNext()!= null ) {
            if (tempNode.getKey() == searchNode.getKey())
                return true;
            tempNode = tempNode.getNext();
        }

        return false;
    }

    public void insertAfter(INode previousNode, INode newNode) {
        INode tempNode = head;
        while (tempNode.getNext()!= null  ) {
            if (tempNode.getKey() == previousNode.getKey()){
                newNode.setNext(tempNode.getNext());
                tempNode.setNext(newNode);
                break;
            }
            tempNode = tempNode.getNext();
        }
    }
}
