package com.amal.inheritance;

class BIke extends Vehicle{
    public BIke(String name, String fuel, String no){
        super(name,fuel,no);
        // super(this.getName());
        setNo(no);
        setFuel(fuel);
        setName(name);
    }
}

