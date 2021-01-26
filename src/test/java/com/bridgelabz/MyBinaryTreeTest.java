package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MyBinaryTreeTest {

    @Test
    public void given3Numbers_WhenAddedToBinaryTree_ShouldReturnSizeThree() {

        MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);

        int size = myBinaryTree.getSize();
        Assert.assertEquals(3, size);
    }

    @Test
    public void given13Numbers_WhenAddedToBinaryTree_ShouldReturnSize13() {

        MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();

        myBinaryTree.add(3);
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
        myBinaryTree.add(22);
        myBinaryTree.add(40);
        myBinaryTree.add(11);
        myBinaryTree.add(63);
        myBinaryTree.add(67);
        myBinaryTree.add(16);
        myBinaryTree.add(60);
        myBinaryTree.add(95);
        myBinaryTree.add(65);

        int size = myBinaryTree.getSize();
        Assert.assertEquals(13, size);
    }

}
