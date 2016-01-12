package com.lsqboy;

import android.app.Application;

import com.lsqboy.autolayout.config.AutoLayoutConifg;


/**
 * Created by zhy on 15/12/23.
 */
public class UseDeviceSizeApplication extends Application
{
    @Override
    public void onCreate()
    {
        super.onCreate();
        AutoLayoutConifg.getInstance().useDeviceSize().init(this);
    }
}
