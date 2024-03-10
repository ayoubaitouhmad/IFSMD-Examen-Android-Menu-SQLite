package com.ifsmd.androidfirstexam.utils;

import android.content.Context;
import android.content.SharedPreferences;

public class Auth {

    private Context mContext;

    public Auth(Context context) {
        mContext = context;
    }

    private SharedPreferences sharedPreferences() {
        return mContext.getSharedPreferences("user", Context.MODE_PRIVATE);
    }

    public void login(String userId) {
        SharedPreferences.Editor editor = sharedPreferences().edit();
        editor.putString("userId", userId);
        editor.apply();
    }

    public String user() {
        SharedPreferences preferences = sharedPreferences();
        return preferences.getString("userId", null);
    }

    public Boolean check() {
        SharedPreferences preferences = sharedPreferences();
        return preferences.contains("userId");
    }

    public void logout() {
        SharedPreferences.Editor editor = sharedPreferences().edit();
        editor.remove("userId");
        editor.apply();

    }


}
