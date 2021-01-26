package com.bridgelabz;

public class MyBinaryTree<K extends Comparable> {

    private MyBinaryNode<K> root;

    public void add(K key){

        this.root = this.addRecursively(root, key);
    }

    private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key){
        if (current == null)
            return new MyBinaryNode<>(key);
        int compareResult = key.compareTo(current.key);
        if (compareResult == 0)
            return current;
        if (compareResult < 0)
            current.left = addRecursively(current.left, key);
        else
            current.right = addRecursively(current.right, key);
        return current;
    }

    public int getSize(){
        return this.getSizeRecursively(root);
    }

    private int getSizeRecursively(MyBinaryNode<K> current) {
        return current == null ? 0 : 1 + this.getSizeRecursively(current.left)
                                       + this.getSizeRecursively(current.right);
    }

    public boolean search(K key) {
        return searchRecursively(root, key);
    }

    private boolean searchRecursively(MyBinaryNode<K> current, K key) {

        if(current == null)
            return false;

        if (current.key.compareTo(key) == 0)
            return true;
        else
            return this.searchRecursively(current.left, key) || this.searchRecursively(current.right, key);
    }
}
