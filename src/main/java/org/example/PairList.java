package org.example;

import java.util.ArrayList;
import java.util.List;

public class PairList <T,U>{

    private List<Pair<T,U>> pairList = new ArrayList<>();

    public void addPair(T element1,U element2){
        Pair pair = new Pair(element1,element2);
        pairList.add(pair);
    }

    public Pair getPair(int index){
        try {
            return pairList.get(index);
        }catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            return null;
        }
    }
    public void removePair(int index){
        try {
            pairList.remove(index);
        }catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }

    public List<Pair<T, U>> getPairList() {
        return pairList;
    }

    @Override
    public String toString() {
        return pairList.toString();

    }
}
