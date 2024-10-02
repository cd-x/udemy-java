package main.java.collections.implementation;

import main.java.ExceptionHandling.StackOverflowExeception;
import main.java.ExceptionHandling.StackUnderflowException;
import main.java.collections.interfaces.IStack;

import java.util.LinkedList;
import java.util.List;

public class Stack implements IStack {
    private Integer CAPACITY = 0;
    List<Integer> list = new LinkedList<>();
    public Stack(Integer capacity){
        CAPACITY = capacity;
    }
    @Override
    public void push(Integer value) throws StackOverflowExeception{
        if(CAPACITY.equals(list.size()))
            throw new StackOverflowExeception();
        list.add(value);
    }
    @Override
    public Integer pop(){
        if(list.isEmpty())
            throw new StackUnderflowException();
        Integer lastIndex = list.size() -1;
        Integer removedItem = list.get(lastIndex);
        list.remove(lastIndex);
        return removedItem;
    }
}
