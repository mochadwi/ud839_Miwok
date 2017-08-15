package com.example.android.miwok.model;

/**
 * Created by mochadwi on 8/15/17.
 */

public class Word {
    private String mMiwokTranslation;
    private String mDefaultTranslation;

    public Word(String mDefaultTranslation, String mMiwokTranslation) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public void setMiwokTranslation(String mMiwokTranslation) {
        this.mMiwokTranslation = mMiwokTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public void setDefaultTranslation(String mDefaultTranslation) {
        this.mDefaultTranslation = mDefaultTranslation;
    }
}
