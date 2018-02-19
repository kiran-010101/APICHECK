package com.example.kiran.apicheck;

/**
 * Created by kiran on 10/28/17.
 */

public class YOUTUBECONFIG {

    public YOUTUBECONFIG(){

    }

    private static final String API_KEY = "AIzaSyCQF2RH8C4ESer7RBRKncbxmR04YQNSOEE";

   //private API_KEY so we should use getter and setter
    public static String getApiKey() {
        return API_KEY;
    }
}
