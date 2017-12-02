package com.example.zhaojian.interfaces2application.util;

import android.app.Activity;
import android.util.Log;

import com.example.zhaojian.interfaces2application.R;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by zhaojian on 2017/12/2.
 */

public class ConfigUtil {

    private static final String TAG = "ConfigUtil";

    //默认环境为开发环境
    private static String DEV_ENV = "DEBUG";
    private static Properties config = new Properties();

    public static void loadConfig(Activity activity){
        InputStream in = null;
        try {
            in = activity.getResources().openRawResource(R.raw.config);
            DEV_ENV = activity.getResources().getString(R.string.dev_env);
            config.load(in);
        } catch (IOException e) {
            Log.e(TAG, "load properties error",e);
            
        }finally{
            if(in!=null){
                try {
                    in.close();
                } catch (IOException e) {
                }
            }
        }
    }

    public static String getValue(String key){
        String configKey = key+"_"+ DEV_ENV;
        //获取配置文件对应的值
        return config.getProperty(configKey.toUpperCase());
    }

}
