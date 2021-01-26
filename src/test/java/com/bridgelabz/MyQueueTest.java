package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MyQueueTest {

    @Test
    public void given3Numbers_WhenAddedToQueue_ShouldHaveFirstAddedNode() {

        MyNode<Integer> node1 = new MyNode<>(56);
        MyNode<Integer> node2 = new MyNode<>(30);
        MyNode<Integer> node3 = new MyNode<>(70);

        MyQueue myQueue = new MyQueue();

        myQueue.enqueue(node1);
        myQueue.enqueue(node2);
        myQueue.enqueue(node3);

        INode peek = myQueue.peek();

        Assert.assertEquals(node1, peek);
    }

    @Test
    public void given3Numbers_WhenDequeued_ShouldReturnFirstAddedNode() {

        MyNode<Integer> node1 = new MyNode<>(56);
        MyNode<Integer> node2 = new MyNode<>(30);
        MyNode<Integer> node3 = new MyNode<>(70);

        MyQueue myQueue = new MyQueue();

        myQueue.enqueue(node1);
        myQueue.enqueue(node2);
        myQueue.enqueue(node3);

        INode dequeue = myQueue.dequeue();

        Assert.assertEquals(node1, dequeue);
    }
}
