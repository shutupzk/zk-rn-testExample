package com.example.nativemoduleexample;

import android.util.Log;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;

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
    public void testPrint(String name, Promise promise) {
        WritableMap map = Arguments.createMap();
        map.putString("name", name);
        promise.resolve(map);
    }
}
