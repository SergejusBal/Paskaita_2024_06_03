package org.example.ListProcessor;

public interface ListProcessor <T> {
    void addElement(T element);
    void removeElement(T element);
    boolean isEmpty();
}
