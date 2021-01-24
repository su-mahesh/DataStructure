package com.bridgelabz;

public class MyNode<K> implements INode<K>{
    private K key;
    private MyNode<K> next;

    public MyNode(K key){
        this.key = key;
        this.next = null;
    }
    public void getD(){}
    @Override
    public void setNext(INode<K> next) {
        this.next = (MyNode<K>) next;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public void setKey(K key) {
        this.key = key;
    }

    @Override
    public INode<K> getNext() {
        return next;
    }

}
