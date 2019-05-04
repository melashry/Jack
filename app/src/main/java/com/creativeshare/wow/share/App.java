package com.creativeshare.wow.share;

import android.app.Application;
import android.content.Context;

import com.creativeshare.wow.language.Language_Helper;

public class App extends Application {
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(Language_Helper.updateResources(base,Language_Helper.getLanguage(base)));
    }


}
