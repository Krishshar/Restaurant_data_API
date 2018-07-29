package com.example.kritesh.restaurant_data_api;

/**
 * Created by kritesh on 29/7/18.
 */

public class APIutilities {
    private APIutilities() {}

    public static final String BASE_URL = "http://api.shoocal.com/test/manager/democalltesting/";

    public static APIrefrence getAPIService() {

        return RetrofitClient.getClient(BASE_URL).create(APIrefrence.class);
    }
}
