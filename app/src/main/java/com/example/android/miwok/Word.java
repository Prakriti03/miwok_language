package com.example.android.miwok;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int imageId=NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED=-1;
    private int audioId;

    public Word(String mDefaultTranslation, String mMiwokTranslation,int imageId,int audioId) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.imageId=imageId;
        this.audioId=audioId;
    }

    public Word(String mDefaultTranslation, String mMiwokTranslation,int audioId) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.audioId=audioId;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }
    public int getImageId(){
        return  imageId;
    }
    public boolean hasImage(){
        return(NO_IMAGE_PROVIDED!=imageId);
    }
    public int getAudioId(){
        return audioId;
    }
}
