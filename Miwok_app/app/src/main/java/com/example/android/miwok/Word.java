package com.example.android.miwok;

/**
 * Created by Acer on 2017-09-13.
 */

public class Word {

    /**
     * Default translation for the word
     */
    private String mDefaultTranslation;

    private int mAudioResouceID;
    private String mMiwokTranslation;

    private int image = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String mDefaultTranslation, String mMiwokTranslation) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
    }

    public Word(String mDefaultTranslation, String mMiwokTranslation, int image) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.image = image;
    }

    public Word(String mDefaultTranslation, String mMiwokTranslation, int image, int mAudioResouceID) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mAudioResouceID = mAudioResouceID;
        this.mMiwokTranslation = mMiwokTranslation;
        this.image = image;
    }

    public int getmAudioResouceID() {
        return mAudioResouceID;
    }

    public void setmAudioResouceID(int mAudioResouceID) {
        this.mAudioResouceID = mAudioResouceID;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    /**
     * Get the default translation for the word.
     */
    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the miwok translation for the word.
     */
    public void setmDefaultTranslation(String mDefaultTranslation) {
        this.mDefaultTranslation = mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public void setmMiwokTranslation(String mMiwokTranslation) {
        this.mMiwokTranslation = mMiwokTranslation;
    }

    public boolean hasImage() {
        return image != NO_IMAGE_PROVIDED;
    }
}
