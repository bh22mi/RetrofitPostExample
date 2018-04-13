package com.example.bhoomi.retrofitpostexample;

public class APIUtils {

    public static final String BASE_URL = "http://workbenchitsolution.com/yaamina/webservice/";

    public  static APIService getAPIService() {
        return RetrofitClient.getClient(BASE_URL).create(APIService.class);
    }
}
