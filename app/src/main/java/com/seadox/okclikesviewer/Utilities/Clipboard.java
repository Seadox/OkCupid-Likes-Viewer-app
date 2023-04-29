package com.seadox.okclikesviewer.Utilities;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;

public class Clipboard {
    private static Clipboard instance = null;
    private ClipboardManager clipboard;

    private Clipboard(Context context) {
        clipboard = (ClipboardManager) context.getSystemService(Context.CLIPBOARD_SERVICE);
    }

    public static void init(Context context) {
        if (instance == null)
            instance = new Clipboard(context);
    }

    public static Clipboard getInstance() {
        return instance;
    }

    public void copy(String label, String text) {
        ClipData clip = ClipData.newPlainText(label, text);
        clipboard.setPrimaryClip(clip);
    }
}
