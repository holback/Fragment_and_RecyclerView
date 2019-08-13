package com.example.fragment_and_recyclerview;

public class Person
{
    //dichiaro le variabili
    private String name, number;

    //dichiaro il costruttore
    public Person(String name, String number) {
        this.name = name;
        this.number = number;
    }

    //dichiaro getter&setter
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getNumber()
    {
        return number;
    }

    public void setNumber(String number)
    {
        this.number = number;
    }
}
