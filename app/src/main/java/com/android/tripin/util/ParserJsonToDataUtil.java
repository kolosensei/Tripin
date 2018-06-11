package com.android.tripin.util;

import com.android.tripin.entity.ResponseMessage;
import com.google.gson.Gson;

public class ParserJsonToDataUtil {
    private final static String TAG = ParserJsonToDataUtil.class.getSimpleName();

    private static Gson gson = new Gson();

    public static String getLoginResponseMessage(String loginResponse){
        ResponseMessage responseMessage = gson.fromJson(loginResponse,ResponseMessage.class);
        String errorCode = responseMessage.getErrorCode();
        return errorCode;
    }
}
