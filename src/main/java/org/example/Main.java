package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.example.core.Person;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Иванов", "Иван", 20);
        System.out.println(person1);
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        String json = gson.toJson(person1);
        System.out.println(json);
        Person person2 = new Gson().fromJson(json, Person.class);
        System.out.println(person2);
    }
}