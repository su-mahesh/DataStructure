package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MyStackTest {

    @Test
    public void given3Numbers_WhenAddedToStack_ShouldMatchLastAddedNode(){
        MyNode<Integer> node1 = new MyNode<>(70);
        MyNode<Integer> node2 = new MyNode<>(30);
        MyNode<Integer> node3 = new MyNode<>(56);

        MyStack myStack = new MyStack();

        myStack.push(node1);
        myStack.push(node2);
        myStack.push(node3);

        INode peek = myStack.peek();

        Assert.assertEquals(node3, peek);
    }


    @Test
    public void given3NumbersInStack_WhenPopped_ShouldMatchWithLastAddedNode(){
        MyNode<Integer> node1 = new MyNode<>(70);
        MyNode<Integer> node2 = new MyNode<>(30);
        MyNode<Integer> node3 = new MyNode<>(56);

        MyStack myStack = new MyStack();

        myStack.push(node1);
        myStack.push(node2);
        myStack.push(node3);

        INode pop = myStack.pop();

        Assert.assertEquals(node3, pop);
    }


}
