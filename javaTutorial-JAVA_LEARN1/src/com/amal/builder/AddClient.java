package com.amal.builder;

public class AddClient {

    public static void main(String[] args) {
        Client Securyty = new Client("Shan", 65, "SS", "Securty");
        System.out.println(Securyty);
        Client clearner = new ClientBuilder().setName("Hasan").setAge(24).setPosition("Cleaner").getDetail();
        System.out.println(clearner);
    }
}







