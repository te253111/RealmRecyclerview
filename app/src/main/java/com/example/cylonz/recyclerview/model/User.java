package com.example.cylonz.recyclerview.model;

import io.realm.Realm;
import io.realm.RealmObject;

/**
 * Created by Cylonz on 12/6/2559.
 */
public class User extends RealmObject {
    private String id;
    private String name;
    private String age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
