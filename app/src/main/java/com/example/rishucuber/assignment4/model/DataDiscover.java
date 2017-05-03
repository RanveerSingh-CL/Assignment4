package com.example.rishucuber.assignment4.model;

import java.io.Serializable;

/**
 * Created by rishucuber on 7/4/17.
 */

public class DataDiscover implements Serializable {
    private String mText;



    public DataDiscover(String mText, int mImage) {
        this.mText = mText;


    }

    public String getmText() {
        return mText;
    }


}
