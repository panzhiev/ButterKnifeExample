package com.example.panzhiev.butterknifeexample.model;

import java.io.Serializable;

/**
 * Created by Tim on 15.01.2017.
 */

public class Person implements Serializable {
    private String mName;
    private String mPhoto;

    public Person(String mName, String mPhoto) {
        this.mName = mName;
        this.mPhoto = mPhoto;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmPhoto() {
        return mPhoto;
    }

    public void setmPhoto(String mPhoto) {
        this.mPhoto = mPhoto;
    }
}

