package io.jchat.android;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.lwansbrough.RCTCamera.RCTCamera;
import com.lwansbrough.RCTCamera.RCTCameraPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomReactPackage implements ReactPackage {
    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        List<NativeModule> result = new ArrayList<>();
        result.add(new JMessageHelper(reactContext));
        result.add(new MessageController(reactContext));
        return result;
    }

    @Override
    public List<Class<? extends JavaScriptModule>> createJSModules() {
        return Collections.emptyList();
    }

    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        return Collections.emptyList();
    }
}
