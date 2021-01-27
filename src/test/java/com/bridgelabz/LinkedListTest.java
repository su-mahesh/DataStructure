package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {

    @Test
    public void given3Nodes_WhenLinkedShould_PassLinkedListTest() {
        INode<Integer> node1 = new MyNode<>(70);
        INode<Integer> node2 = new MyNode<>(30);
        INode<Integer> node3 = new MyNode<>(56);

        node1.setNext(node2);
        node2.setNext(node3);

        boolean result = node1.getNext().equals(node2) &&
                            node2.getNext().equals(node3);
        Assert.assertTrue(result);
    }

    @Test
    public void given3Nodes_WhenAdded_ShouldPassLinkedListTest(){
        INode<Integer> node1 = new MyNode<>(70);
        INode<Integer> node2 = new MyNode<>(30);
        INode<Integer> node3 = new MyNode<>(56);

        LinkedList linkedList = new LinkedList();

        linkedList.add(node1);
        linkedList.add(node2);
        linkedList.add(node3);

        boolean result =  linkedList.getHead().equals(node3) &&
                linkedList.getHead().getNext().equals(node2) &&
                linkedList.getTail().equals(node1);

        Assert.assertTrue(result);

    }

    @Test
    public void given3Nodes_WhenAppended_ShouldPassLinkedListTest(){
        INode<Integer> node1 = new MyNode<>(56);
        INode<Integer> node2 = new MyNode<>(30);
        INode<Integer> node3 = new MyNode<>(70);

        LinkedList linkedList = new LinkedList();

        linkedList.append(node1);
        linkedList.append(node2);
        linkedList.append(node3);

        boolean result =  linkedList.getHead().equals(node1) &&
                          linkedList.getHead().getNext().equals(node2) &&
                          linkedList.getTail().equals(node3);

        Assert.assertTrue(result);
    }

    @Test
    public void givenNodes_WhenInsertedAfterSpecifiedNode_ShouldPassLinkedListTest(){
        INode<Integer> node1 = new MyNode<>(56);
        INode<Integer> node2 = new MyNode<>(70);
        INode<Integer> node3 = new MyNode<>(30);

        LinkedList linkedList = new LinkedList();

        linkedList.append(node1);
        linkedList.append(node2);
        linkedList.insert(node1, node3);

        boolean result =  linkedList.getHead().equals(node1) &&
                          linkedList.getHead().getNext().equals(node3) &&
                          linkedList.getTail().equals(node2);

        Assert.assertTrue(result);
    }

    @Test
    public void givenNodes_WhenDeletedFirstElement_ShouldPassLinkedListTest(){
        INode<Integer> node1 = new MyNode<>(56);
        INode<Integer> node2 = new MyNode<>(30);
        INode<Integer> node3 = new MyNode<>(70);

        LinkedList linkedList = new LinkedList();

        linkedList.append(node1);
        linkedList.append(node2);
        linkedList.append(node3);

        linkedList.pop();

        boolean result =  linkedList.getHead().equals(node2) &&
                          linkedList.getTail().equals(node3);

        Assert.assertTrue(result);
    }

    @Test
    public void givenNodes_WhenDeletedLastElement_ShouldPassLinkedListTest(){
        INode<Integer> node1 = new MyNode<>(56);
        INode<Integer> node2 = new MyNode<>(30);
        INode<Integer> node3 = new MyNode<>(70);

        LinkedList linkedList = new LinkedList();

        linkedList.append(node1);
        linkedList.append(node2);
        linkedList.append(node3);

        linkedList.popLast();

        boolean result =  linkedList.getHead().equals(node1) &&
                          linkedList.getHead().getNext().equals(node2) &&
                          linkedList.getTail().equals(node2);

        Assert.assertTrue(result);
    }

    @Test
    public void givenNodes_WhenSearchedSpecificNode_ShouldPassLinkedListTest(){
        INode<Integer> node1 = new MyNode<>(56);
        INode<Integer> node2 = new MyNode<>(50);
        INode<Integer> node3 = new MyNode<>(75);
        INode<Integer> node4 = new MyNode<>(76);
        INode<Integer> node5 = new MyNode<>(30);
        INode<Integer> node6 = new MyNode<>(70);

        LinkedList linkedList = new LinkedList();

        linkedList.append(node1);
        linkedList.append(node2);
        linkedList.append(node3);
        linkedList.append(node4);
        linkedList.append(node5);
        linkedList.append(node6);

        boolean result = linkedList.searchNode(node5);

        Assert.assertTrue(result);
    }

    @Test
    public void givenSequence_WhenInsertedAfterSpecifiedNode_ShouldPassLinkedListTest(){
        INode<Integer> node1 = new MyNode<>(56);
        INode<Integer> node2 = new MyNode<>(30);
        INode<Integer> node3 = new MyNode<>(70);
        INode<Integer> node4 = new MyNode<>(40);

        LinkedList linkedList = new LinkedList();

        linkedList.append(node1);
        linkedList.append(node2);
        linkedList.append(node3);

        linkedList.insertAfter(node2, node4);
        boolean result = linkedList.getHead().equals(node1) &&
                         linkedList.getTail().equals(node3) &&
                         linkedList.getHead().getNext().equals(node2) &&
                         linkedList.getHead().getNext().getNext().equals(node4);

        Assert.assertTrue(result);
    }

    @Test
    public void givenSequence_WhenDeletedSpecificNode_ShouldPassLinkedListTest(){
        INode<Integer> node1 = new MyNode<>(56);
        INode<Integer> node2 = new MyNode<>(30);
        INode<Integer> node3 = new MyNode<>(40);
        INode<Integer> node4 = new MyNode<>(70);

        LinkedList linkedList = new LinkedList();

        linkedList.append(node1);
        linkedList.append(node2);
        linkedList.append(node3);
        linkedList.append(node4);

        linkedList.deleteNode(node3);
        boolean result = linkedList.getHead().equals(node1) &&
                         linkedList.getHead().getNext().equals(node2) &&
                         linkedList.getTail().equals(node4);

        Assert.assertTrue(result);
    }

    @Test
    public void givenSequence_WhenAddedNodes_ShouldPassOrderedLinkedListTest(){
        INode<Integer> node1 = new MyNode<>(56);
        INode<Integer> node2 = new MyNode<>(30);
        INode<Integer> node3 = new MyNode<>(40);
        INode<Integer> node4 = new MyNode<>(70);

        LinkedList linkedList = new LinkedList();

        linkedList.addInOrderList(node1);
        linkedList.addInOrderList(node2);
        linkedList.addInOrderList(node3);
        linkedList.addInOrderList(node4);

        boolean result = linkedList.getHead().equals(node2) &&
                         linkedList.getHead().getNext().equals(node3) &&
                         linkedList.getTail().equals(node1);

        Assert.assertTrue(result);
    }
}
