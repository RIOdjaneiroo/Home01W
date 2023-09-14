package org.example;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Ivor", "Rudenko");
        Gson gson = new Gson();
        String json = gson.toJson(human);
        System.out.println(json);
    }

}