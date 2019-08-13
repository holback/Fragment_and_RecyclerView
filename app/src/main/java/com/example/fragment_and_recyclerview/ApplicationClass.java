package com.example.fragment_and_recyclerview;

import android.app.Application;

import java.util.ArrayList;

public class ApplicationClass extends Application {

   public static ArrayList<Person> people;

    @Override
    public void onCreate() {
        super.onCreate();

        people = new ArrayList<Person>();
        people.add(new Person("Giuseppe","3202135884"));
        people.add(new Person("Mari","3296498235"));
        people.add(new Person("Mamma","3881784366"));
        people.add(new Person("Papà","3384172320"));
        people.add(new Person("Giulia","3285784498"));

    }
}
