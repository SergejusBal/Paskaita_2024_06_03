package org.example.ShapeCalculator;

public interface ShapeCalculator <T extends Number> {

    T calculateArea(T value1, T value2);
    T calculatePerimeter(T value1, T value2);



}
