package com.example.nativemoduleexample;

import android.util.Log;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;

import static com.facebook.react.common.ReactConstants.TAG;

/**
 * Created by zhakang on 2017/5/22.
 */

public class BGNativeExampleModule extends ReactContextBaseJavaModule {
    public BGNativeExampleModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }
    @Override
    public String getName() {
        return "BGNativeModuleExample";
    }

    @ReactMethod
    public void testPrint(String name, ReadableMap info) {
        Log.i(TAG, name);
        Log.i(TAG, info.toString());
    }
}
