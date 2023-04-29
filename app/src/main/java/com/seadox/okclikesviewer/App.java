package com.seadox.okclikesviewer;

import android.app.Application;

import com.seadox.okclikesviewer.Utilities.Clipboard;
import com.seadox.okclikesviewer.Utilities.SP;
import com.seadox.okclikesviewer.Utilities.SignalGenerator;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        SP.init(this);
        SignalGenerator.init(this);
        Clipboard.init(this);
    }
}
