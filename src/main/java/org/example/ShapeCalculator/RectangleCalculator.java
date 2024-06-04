package org.example.ShapeCalculator;

import org.example.ShapeCalculator.ShapeCalculator;

public class RectangleCalculator implements ShapeCalculator<Double> {
    @Override
    public Double calculateArea(Double value1, Double value2){
        return value1 * value2;
    }

    @Override
    public Double calculatePerimeter(Double value1, Double value2){
        return (value1 + value2) * 2;
    }


}
