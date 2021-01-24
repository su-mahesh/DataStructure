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


}
