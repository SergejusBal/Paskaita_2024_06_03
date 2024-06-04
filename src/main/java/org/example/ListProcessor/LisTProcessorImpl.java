package org.example.ListProcessor;

import java.util.ArrayList;
import java.util.List;

public class LisTProcessorImpl implements ListProcessor<String>{


    private final List<String> manoListas;

    public LisTProcessorImpl() {
        manoListas = new ArrayList<>();
    }

    @Override
    public void addElement(String element) {
        manoListas.add(element);
    }

    @Override
    public void removeElement(String element) {
        manoListas.remove(element);
    }

    @Override
    public boolean isEmpty() {
        return manoListas.isEmpty();
    }

    @Override
    public String toString() {
        return manoListas.toString();
    }

}
