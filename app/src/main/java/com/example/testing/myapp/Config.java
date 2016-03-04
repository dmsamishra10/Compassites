package com.example.testing.myapp;

import android.graphics.Bitmap;


public class Config {

    public static String[] type;
    public static String[] urls;
    public static Bitmap[] bitmaps;

    public static final String GET_URL = "http://static.moralstories.org/wp-content/uploads/2009/05/friends.jpg";
    public static final String TAG_IMAGE_URL = "url";
    public static final String TAG_IMAGE_NAME = "type";
    public static final String TAG_JSON_ARRAY="result";


    public Config(int i){
        type = new String[i];
        urls = new String[i];
        bitmaps = new Bitmap[i];
    }
}
