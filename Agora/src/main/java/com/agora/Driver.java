package com.agora;

public class Driver {

    public static void main(String[] args) {
        System.out.println(System.getenv("AGORA_DB_USERNAME"));
        System.out.println(System.getenv("AGORA_DB_PASSWORD"));
        System.out.println(System.getenv("AGORA_DB_URL"));

    }
}
