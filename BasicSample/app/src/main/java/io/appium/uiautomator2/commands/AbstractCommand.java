package io.appium.uiautomator2.commands;

import org.json.JSONException;
import org.json.JSONObject;

import io.appium.uiautomator2.server.IAppiumRequest;

public abstract class AbstractCommand {
    public abstract String execute(final IAppiumRequest request) throws JSONException;

    public JSONObject getPayload(IAppiumRequest request) throws JSONException {
        String json = request.body();
        if (json != null && !json.isEmpty()) {
            return new JSONObject(json);
        }
        return new JSONObject();
    }
}
