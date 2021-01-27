package com.bridgelabz;

public class LinkedList<K extends Comparable<K>>  {
    private INode<K> head;
    private INode<K> tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }
    public INode getHead() {
        return this.head;
    }

    public INode getTail() {
        return this.tail;
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
            this.tail.setNext(newNode);
            this.tail = newNode;
        }

    }

    public INode pop() {
        INode tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }

    public void popLast() {
        INode tempNode = head;
        while (!tempNode.getNext().equals(tail)) {
            tempNode = tempNode.getNext();
        }   tempNode.setNext(null);
            this.tail = tempNode;
    }

    public boolean searchNode(INode myNode) {
        INode tempNode = head;
        while (tempNode.getNext()!= null ) {
            if (tempNode.getKey() == myNode.getKey())
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

    public void deleteNode(INode myNode) {
        INode tempNode = head;

        if (head.equals(myNode))
            this.head = this.head.getNext();
        while (tempNode.getNext()!= null) {
            if (tempNode.getNext().getKey() == myNode.getKey()){
                tempNode.setNext(tempNode.getNext().getNext());
                size();
                break;
            }
            tempNode = tempNode.getNext();
        }
    }

    private int size() {
        int size = 0;
        INode tempNode = head;
        while (tempNode.getNext()!= null  ) {
            size++;
            tempNode = tempNode.getNext();
        }
        size++;
        System.out.println("size of linked list: "+size);

        return size;
    }

    public void addInOrderList(INode<K> myNode) {
        if(this.head == null)
            this.head = myNode;

        if(this.tail == null)
            this.tail = myNode;
        else {
            if (this.head.getKey().compareTo(myNode.getKey()) > 0) {
            myNode.setNext(this.head);
            head = myNode;
            }
            else {
            INode<K> tempNode = this.head;
            while(tempNode.getNext() != null && (tempNode.getNext().getKey().compareTo(myNode.getKey()) < 0)) {
                tempNode = tempNode.getNext();
            }
            myNode.setNext(tempNode.getNext());
            tempNode.setNext(myNode);
            }
        }
    }

    public INode<K> search(K key) {
        INode<K> tempNode = head;
        while (tempNode!= null ) {
            if (tempNode.getKey().compareTo(key) == 0)
                return tempNode;
            tempNode = tempNode.getNext();
        }
        return null;
    }

    @Override
    public String toString() {
        return "MyLinkedListNodes{" + head + '}';

    }
}
