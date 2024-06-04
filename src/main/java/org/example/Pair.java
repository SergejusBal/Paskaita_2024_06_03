package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Pair<T,U> {
    private T first;
    private U second;

   // T[] masyvas;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
      //  masyvas = (T[]) Array.newInstance(first.getClass(),5);
    }

    public void setParameters(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return String.format("([%s],[%s])",first.toString(),second.toString());
    }


}
