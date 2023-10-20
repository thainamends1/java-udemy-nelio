package services;

import java.util.ArrayList;
import java.util.List;

public class PrintServiceInteger {
    
    private List<Integer> list = new ArrayList<>();

    public void addValue(Integer value) {

        list.add(value);
    }

    public Integer first() {

        if(list.isEmpty()) {
            throw new IllegalStateException("List is empty");
        }

        return list.get(0);
    }

    public void print() {
        
        System.out.printf("[");

        if(!list.isEmpty()) {
            System.out.print(list.get(0));
        }

        for(int i = 1; i < list.size(); i++) {
            System.out.printf(", " + list.get(i));
        }

        System.out.println("]");
    }
}
