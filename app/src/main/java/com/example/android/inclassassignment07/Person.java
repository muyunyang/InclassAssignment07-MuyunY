package com.example.android.inclassassignment07;

import java.io.Serializable;

/**
 * Created by yangmuyun on 3/10/18.
 */

public class Person implements Serializable {
    private String personName;
    private int personAge;


    public Person(String personName,int personAge){
        this.personAge=personAge;
        this.personName=personName;

    }

    public  String getPersonName(){
        return personName;
    }
    public  int getPersonAge(){
        return personAge;
    }

}
