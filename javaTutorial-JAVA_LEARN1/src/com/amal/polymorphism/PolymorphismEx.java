// pirimi kenek lamayek, piyek, seeya.
//ekama method eka wenas widiyta use wenwa
// aye balanna
package com.amal.polymorphism;
public class PolymorphismEx {
    public static void main(String[] args) {
        CalAread cir=new CalAread();
        cir.FindArea(23);
        cir.getResult();

        CalAread rec=new CalAread();
        rec.FindAread(3,56);
        rec.getResult();


    }
}
