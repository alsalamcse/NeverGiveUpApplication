package com.example.owner.nevergiveupapplication.data;

public class MyGroup {

    private String key;
    private String name;


    public MyGroup(String key , String name) {

    }

    public String getKey() {
        return key;
    }

    public String getName() {
        return name;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MyGroup{" +
                "key='" + key + '\'' +
                "name=' " + name + '\'';
    }

}