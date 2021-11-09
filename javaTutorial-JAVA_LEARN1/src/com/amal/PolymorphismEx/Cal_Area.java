package com.amal.PolymorphismEx;

class Cal_Aread{

    private float result;
    public void FindArea(float rad){
        result= (float) (Math.PI*2*rad*rad);
    }
    public void  FindAread(float wid,float high){
        result =wid*high;
    }
    public float getResult() {
        System.out.println(result);
        return result;
    }
}
