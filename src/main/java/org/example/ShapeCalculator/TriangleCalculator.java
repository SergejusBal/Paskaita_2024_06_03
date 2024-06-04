package org.example.ShapeCalculator;

public class TriangleCalculator implements ShapeCalculator<Double>{

    @Override
    public Double calculateArea(Double value1, Double value2) {
        return value1 * value2 / 2;
    }

    @Override
    public Double calculatePerimeter(Double value1, Double value2) {
        Double value3 = Math.sqrt(Math.pow(value1,2) + Math.pow(value2,2));
        return value1 + value2 + value3;
    }
}
