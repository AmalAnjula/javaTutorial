// pirimi kenek lamayek, piyek, seeya.
//ekama method eka wenas widiyta use wenwa

package com.amal.PolymorphismEx;


public class PolymorphismEx {
    public static void main(String[] args) {

        Cal_Aread cir=new Cal_Aread();
        cir.FindArea(23);
        cir.getResult();

        Cal_Aread rec=new Cal_Aread();
        rec.FindAread(3,56);
        rec.getResult();


    }
}
