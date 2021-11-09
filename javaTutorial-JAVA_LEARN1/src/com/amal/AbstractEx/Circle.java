package com.amal.AbstractEx;

class Circle extends Shapes{
    public  float r;
    @Override
    public float CalculateArea() {
        return (float) (r*Math.PI);
    }
}
