package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {

    @Test
    public void given3NumbersWhenLinkedShouldPassLinkedListTest() {
        INode<Integer> Node1 = new MyNode<>(70);
        INode<Integer> Node2 = new MyNode<>(30);
        INode<Integer> Node3 = new MyNode<>(56);

        Node1.setNext(Node2);
        Node2.setNext(Node3);

        boolean result = Node1.getNext().equals(Node2) &&
                            Node2.getNext().equals(Node3);
        Assert.assertTrue(result);
    }

    @Test
    public void given3NumbersWhenAddedShouldPassLinkedListTest(){
        INode<Integer> Node1 = new MyNode<>(70);
        INode<Integer> Node2 = new MyNode<>(30);
        INode<Integer> Node3 = new MyNode<>(56);

        LinkedList linkedList = new LinkedList();

        linkedList.add(Node1);
        linkedList.add(Node2);
        linkedList.add(Node3);

        boolean result =  linkedList.getHead().equals(Node3) &&
                linkedList.getHead().getNext().equals(Node2) &&
                linkedList.getTail().equals(Node1);

        Assert.assertTrue(result);

    }

    @Test
    public void given3NumbersWhenAppendedShouldPassLinkedListTest(){
        INode<Integer> Node1 = new MyNode<>(56);
        INode<Integer> Node2 = new MyNode<>(30);
        INode<Integer> Node3 = new MyNode<>(70);

        LinkedList linkedList = new LinkedList();

        linkedList.append(Node1);
        linkedList.append(Node2);
        linkedList.append(Node3);

        boolean result =  linkedList.getHead().equals(Node1) &&
                linkedList.getHead().getNext().equals(Node2) &&
                linkedList.getTail().equals(Node3);

        Assert.assertTrue(result);
    }

    @Test
    public void given3NumbersWhenInsertedInBetweenShouldPassLinkedListTest(){
        INode<Integer> Node1 = new MyNode<>(56);
        INode<Integer> Node2 = new MyNode<>(70);
        INode<Integer> Node3 = new MyNode<>(30);

        LinkedList linkedList = new LinkedList();

        linkedList.append(Node1);
        linkedList.append(Node2);
        linkedList.insert(Node1, Node2, Node3);

        boolean result =  linkedList.getHead().equals(Node1) &&
                linkedList.getHead().getNext().equals(Node3) &&
                linkedList.getTail().equals(Node2);

        Assert.assertTrue(result);
    }

    @Test
    public void givenSequenceWhenDeletedFirstElementShouldPassLinkedListTest(){
        INode<Integer> Node1 = new MyNode<>(56);
        INode<Integer> Node2 = new MyNode<>(30);
        INode<Integer> Node3 = new MyNode<>(70);

        LinkedList linkedList = new LinkedList();

        linkedList.append(Node1);
        linkedList.append(Node2);
        linkedList.append(Node3);

        linkedList.pop();

        boolean result =  linkedList.getHead().equals(Node2) &&
                linkedList.getTail().equals(Node3);

        Assert.assertTrue(result);
    }

}
