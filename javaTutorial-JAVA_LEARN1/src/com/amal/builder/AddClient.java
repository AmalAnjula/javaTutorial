package com.amal.builder;

public class AddClient {

    public static void main(String[] args) {
        Client security = new Client("Shan", 65, "SS", "Securty");
        System.out.println(security);
        Client cleaner = new ClientBuilder().setName("Hasan").setAge(24).setPosition("Cleaner").getDetail();
        System.out.println(cleaner);
    }
}







