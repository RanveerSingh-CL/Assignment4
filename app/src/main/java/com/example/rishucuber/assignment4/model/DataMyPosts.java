package com.example.rishucuber.assignment4.model;

import java.io.Serializable;

/**
 * Created by rishucuber on 7/4/17.
 */

public class DataMyPosts implements Serializable {
    private String mText;



    public DataMyPosts(String mText, int mImage) {
        this.mText = mText;
    }

    public String getmText() {
        return mText;
    }


}
