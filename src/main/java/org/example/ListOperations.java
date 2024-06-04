package org.example;

import java.util.ArrayList;
import java.util.List;

public class ListOperations <E> {

    private List<E> arrayList = new ArrayList<>();

    public void addElement(E element){
        arrayList.add(element);
    }
    public void removeElement(int index){
        try {
            arrayList.remove(index);
        }catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
    public List<E> getArrayList() {
        return arrayList;
    }

    @Override
    public String toString() {
        return arrayList.toString();
    }
}
