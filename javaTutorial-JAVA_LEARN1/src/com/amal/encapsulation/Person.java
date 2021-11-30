package com.amal.encapsulation;

class Person {

    private int cardNo;
    public String name;
    private int key = 0xF0E0;

    @Override
    public String toString() {
        return "Person{" +
                "CardNo=" + cardNo +
                '}';
    }

    public int getCardNo() {
        return cardNo - key;
    }

    public void setCardNo(int cardNo) {
        this.cardNo = cardNo + key;
    }
}