package org.example;

public class SimpleBox <T>{

    private T elementInTheBox;


    public T getElementInTheBox() {
        return elementInTheBox;
    }

    public void setElementInTheBox(T elementInTheBox) {
        this.elementInTheBox = elementInTheBox;
    }

}
