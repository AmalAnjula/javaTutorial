// pirimi kenek lamayek, piyek, seeya.
//ekama method eka wenas widiyta use wenwa

package com.amal.PolymorphismEx;


public class PolymorphismEx {
    public static void main(String[] args) {

        calAread cir=new calAread();
        cir.findArea(23);
        cir.getResult();

        calAread rec=new calAread();
        rec.findAread(3,56);
        rec.getResult();


    }
}
