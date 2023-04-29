package com.seadox.okclikesviewer.Utilities;

import android.content.Context;
import android.content.SharedPreferences;

public class SP {
    private static final String DB_FILE = "OKC_COOKIES";
    private static SP instance = null;
    private SharedPreferences sharedPreferences;

    private SP(Context context) {
        sharedPreferences = context.getSharedPreferences(DB_FILE, Context.MODE_PRIVATE);
    }

    public static void init(Context context) {
        if (instance == null)
            instance = new SP(context);
    }

    public static SP getInstance() {
        return instance;
    }

    public String getString(String key, String value) {
        return sharedPreferences.getString(key, value);
    }

    public void putString(String key, String value) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(key, value);
        editor.apply();
    }

    public boolean isEmpty(String key) {
        return getString(key, "").equals("");
    }
}
