package com.seadox.okclikesviewer.Utilities;

import android.content.Context;
import android.widget.Toast;

public class SignalGenerator {
    private static SignalGenerator instance = null;
    private Context context;

    private SignalGenerator(Context context) {
        this.context = context;
    }

    public static void init(Context context) {
        if (instance == null) {
            instance = new SignalGenerator(context);
        }
    }

    public static SignalGenerator getInstance() {
        return instance;
    }

    public void toast(String text, int length) {
        Toast.makeText(context, text, length).show();
    }
}
