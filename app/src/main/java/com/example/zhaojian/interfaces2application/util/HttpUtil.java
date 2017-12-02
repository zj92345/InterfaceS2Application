package com.example.zhaojian.interfaces2application.util;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * Created by zhaojian on 2017/12/2.
 */

public class HttpUtil {

    public static String sendPostRequest(String url, RequestBody requestBody) throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(url).post(requestBody).build();
        Response response = client.newCall(request).execute();
        return response.body().string();
    }

}
