package com.amal.PolymorphismEx;

class calAread {

    private float result;
    public void findArea(float rad){
        result= (float) (Math.PI*2*rad*rad);
    }
    public void findAread(float wid, float high){
        result =wid*high;
    }
    public float getResult() {
        System.out.println(result);
        return result;
    }
}
