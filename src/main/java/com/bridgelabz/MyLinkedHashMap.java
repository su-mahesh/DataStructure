package com.bridgelabz;

import java.util.ArrayList;

public class MyLinkedHashMap<K extends Comparable<K>, V> {
    private final int numBuckets;
    ArrayList<LinkedList<K>> myBucketArray;

    public MyLinkedHashMap() {
        this.numBuckets = 10;
        this.myBucketArray = new ArrayList<>(numBuckets);

        for (int i = 0; i < numBuckets; i++)
            this.myBucketArray.add(null);
    }

    public V get(K key) {
        int index = this.getBucketIndex(key);
        LinkedList<K> myLinkedList = this.myBucketArray.get(index);
        if (myLinkedList == null)
            return null;
        MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) myLinkedList.search(key);
        return (myMapNode == null) ? null : myMapNode.getValue();
    }

    private int getBucketIndex(K key) {
        int hashCode = Math.abs(key.hashCode());
        int index = hashCode % numBuckets;
        return index;
    }

    public void add(K key, V value) {
        int index = this.getBucketIndex(key);
        LinkedList<K> myLinkedList = this.myBucketArray.get(index);

        if (myLinkedList == null) {
            myLinkedList = new LinkedList<>();
            this.myBucketArray.set(index, myLinkedList);
        }
        MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) myLinkedList.search(key);
        if (myMapNode == null) {
            myMapNode = new MyMapNode<>(key, value);
            myLinkedList.append(myMapNode);
        }
        else myMapNode.setValue(value);
    }


    public void remove(K key) {
        int index = this.getBucketIndex(key);
        LinkedList<K> myLinkedList = this.myBucketArray.get(index);

        if (myLinkedList != null) {
            MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) myLinkedList.search(key);
            if (myMapNode != null) {
                myLinkedList.deleteNode(myMapNode);
            }
        }

    }

    @Override
    public String toString() {
        return "MyLinkedMapHash List {" + myBucketArray + "}" ;
    }

}
