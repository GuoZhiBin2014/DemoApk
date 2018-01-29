package com.cambricon.demoapk.util;

import android.util.Log;

/**
 * Created by dell on 2018/1/29.
 */

public class LogUtil {

    public static final int VERBOSE = 1;
    public static final int DEBUG = 2;
    public static final int INFO = 3;
    public static final int WARN = 4;
    public static final int ERROR = 5;
    public static final int NOTHING = 6;

    public static final int level = VERBOSE;

    private LogUtil() {
        throw new UnsupportedOperationException("cannot be instantiated");
    }

    private static final String TAG = "way";

    // 下面四个是默认tag的函数
    public static void v(String msg)
    {
        if (level <= VERBOSE)
            Log.i(TAG, msg);
    }

    public static void d(String msg)
    {
        if (level <= DEBUG)
            Log.d(TAG, msg);
    }

    public static void i(String msg)
    {
        if (level <= INFO)
            Log.e(TAG, msg);
    }

    public static void w(String msg)
    {
        if (level <= WARN)
            Log.v(TAG, msg);
    }

    public static void e(String msg)
    {
        if (level <= ERROR)
            Log.v(TAG, msg);
    }



    // 下面是传入自定义tag的函数
    public static void i(String tag, String msg)
    {
        if (level <= INFO)
            Log.e(TAG, msg);
    }

    public static void d(String tag, String msg)
    {
        if (level <= DEBUG)
            Log.d(TAG, msg);
    }

    public static void e(String tag, String msg)
    {
        if (level <= ERROR)
            Log.v(TAG, msg);
    }

    public static void v(String tag, String msg)
    {
        if (level <= VERBOSE)
            Log.i(TAG, msg);
    }

    public static void w(String tag, String msg)
    {
        if (level <= WARN)
            Log.v(TAG, msg);
    }


}


