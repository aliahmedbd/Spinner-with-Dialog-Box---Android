package com.bs23.aliahmed.dialogspinner;

/**
 * Created by Name : Ali Ahmed
 * Email: aliahmedaiub@gmail.com
 * on 4/20/2017.
 */

public class Model {
    public String text1;
    public String text2;

    Model(String text1, String text2){
        this.text1 = text1;
        this.text2 = text2;
    }

    public String getText1() {
        return text1;
    }

    public String getText2() {
        return text2;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }
}
