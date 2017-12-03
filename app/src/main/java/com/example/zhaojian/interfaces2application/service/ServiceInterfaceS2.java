package com.example.zhaojian.interfaces2application.service;

import com.example.zhaojian.interfaces2application.bean.RMControllerEndRequest;
import com.example.zhaojian.interfaces2application.bean.RMControllerStartRequest;
import com.example.zhaojian.interfaces2application.util.ConfigUtil;
import com.example.zhaojian.interfaces2application.util.HttpUtil;
import com.google.gson.Gson;

import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.RequestBody;

/**
 * Created by zhaojian on 2017/12/2.
 */

public class ServiceInterfaceS2 {

    public static MediaType JSON = MediaType.parse("application/json; charset=utf-8");

    public static String sendStartRequest(){
        String responseStr = "";
        RMControllerStartRequest requestBean = new RMControllerStartRequest();
        RequestBody requestBody = RequestBody.create(JSON,new Gson().toJson(requestBean));
        try {
            responseStr = HttpUtil.sendPostRequest(ConfigUtil.getValue("INTERFACE_START_URL"),requestBody);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return responseStr;
    }

    public static String sendEndRequest(){
        String responseStr = "";
        RMControllerEndRequest requestBean = new RMControllerEndRequest();
        RequestBody requestBody = RequestBody.create(JSON,new Gson().toJson(requestBean));
        try {
            responseStr = HttpUtil.sendPostRequest(ConfigUtil.getValue("INTERFACE_END_URL"),requestBody);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return responseStr;
    }

}
