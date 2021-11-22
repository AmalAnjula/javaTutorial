package com.amal.encapsulation;

public class EncapsulationEx {

    public static void main(String[] args) {
        Person pp = new Person();
        pp.Name = "Sunil";
        pp.setCardNo(123456);
        System.out.println("CARD id:" + String.valueOf(pp.getCardNo()));
        pp.toString();
    }

}
