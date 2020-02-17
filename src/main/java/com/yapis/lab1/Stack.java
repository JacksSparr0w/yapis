package com.yapis.lab1;

import java.util.LinkedList;
import java.util.List;

public class Stack {
    private List<String> strings;

    public Stack(){
        strings = new LinkedList<>();
    }

    public void push(String string){
        strings.add(string);
    }

    public String get(){
        if (strings.isEmpty()){
            return "";
        }
        return strings.get(strings.size()-1);
    }

    public boolean isEmpty(){
        return strings.isEmpty();
    }
}
