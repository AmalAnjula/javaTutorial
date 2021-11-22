package com.amal.encapsulation;

class Person {

    private int CardNo;
    public String Name;
    private int Key = 0xF0E0;

    @Override
    public String toString() {
        return "Person{" +
                "CardNo=" + CardNo +
                '}';
    }

    public int getCardNo() {
        return CardNo - Key;
    }

    public void setCardNo(int cardNo) {
        CardNo = cardNo + Key;
    }
}