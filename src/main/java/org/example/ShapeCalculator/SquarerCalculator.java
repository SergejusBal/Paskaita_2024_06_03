package org.example.ShapeCalculator;

public class SquarerCalculator extends RectangleCalculator{

    public Double calculateArea(Double value1) {
        return super.calculateArea(value1,value1);
    }

    public Double calculatePerimeter(Double value1) {
        return super.calculateArea(value1,value1);
    }
}
