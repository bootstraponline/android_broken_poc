package io.appium.uiautomator2.commands;

import android.app.Instrumentation;
import android.support.test.InstrumentationRegistry;
import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject2;

import org.json.JSONException;
import org.json.JSONObject;

import io.appium.uiautomator2.server.IAppiumRequest;
import io.appium.uiautomator2.util.Log;

public class FindElement extends AbstractCommand {
    private Instrumentation instrumentation = InstrumentationRegistry.getInstrumentation();
    private UiDevice uiDevice;
    @Override
    public String execute(final IAppiumRequest request) throws JSONException {

        JSONObject payload = getPayload(request);
        String method = payload.getString("action");
        String selector = payload.getString("id");

        Log.i("Method::::::::::::::"+ method);
        Log.i("Selector::::::::::::::"+ selector);

        uiDevice = UiDevice.getInstance(instrumentation);

        UiObject2 button1 = uiDevice.findObject(By.text(selector));
        button1.click();

        uiDevice.waitForIdle(5000);

        UiObject2 button2 = uiDevice.findObject(By.text(selector));
        button2.click();

//        uiDevice.pressHome();
        return "find element!";
    }
}
