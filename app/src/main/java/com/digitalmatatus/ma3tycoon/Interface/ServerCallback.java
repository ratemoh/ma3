package com.digitalmatatus.ma3tycoon.Interface;

import org.json.JSONObject;

/**
 * Created by stephineosoro on 08/12/2016.
 */

public interface ServerCallback {
    void onSuccess(String result);

    void onSuccess(JSONObject response);
}