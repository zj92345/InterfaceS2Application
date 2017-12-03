package com.example.zhaojian.interfaces2application.service;

import android.util.Log;

import com.example.zhaojian.interfaces2application.bean.RMControllerEndRequest;
import com.example.zhaojian.interfaces2application.bean.RMControllerResponse;
import com.example.zhaojian.interfaces2application.bean.RMControllerStartRequest;
import com.example.zhaojian.interfaces2application.util.ConfigUtil;
import com.example.zhaojian.interfaces2application.util.HttpUtil;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.RequestBody;

/**
 * Created by zhaojian on 2017/12/2.
 */

public class ServiceInterfaceS2 {

    private static final String TAG = "ServiceInterfaceS2";

    public static MediaType JSON = MediaType.parse("application/json; charset=utf-8");

    public static String sendStartRequest(){
        String responseStr = "";
        RMControllerStartRequest requestBean = new RMControllerStartRequest();
        RequestBody requestBody = RequestBody.create(JSON,new Gson().toJson(requestBean));
        try {
            responseStr = HttpUtil.sendPostRequest(ConfigUtil.getValue("INTERFACE_START_URL"),requestBody);
            //TODO 联调时可按需要转化成对象
            RMControllerResponse responseBean = new Gson().fromJson(responseStr,RMControllerResponse.class);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JsonSyntaxException e){
            Log.e(TAG,"接口返回格式错误");
        }
        return responseStr;
    }

    public static String sendEndRequest(){
        String responseStr = "";
        RMControllerEndRequest requestBean = new RMControllerEndRequest();
        RequestBody requestBody = RequestBody.create(JSON,new Gson().toJson(requestBean));
        try {
            responseStr = HttpUtil.sendPostRequest(ConfigUtil.getValue("INTERFACE_END_URL"),requestBody);
            //TODO 联调时可按需要转化成对象
            RMControllerResponse responseBean = new Gson().fromJson(responseStr,RMControllerResponse.class);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JsonSyntaxException e){
            Log.e(TAG,"接口返回格式错误");
        }
        return responseStr;
    }

}
