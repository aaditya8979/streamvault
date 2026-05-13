package com.safedk.android.internal;

import android.app.Application;
import android.content.ContentProvider;
import android.content.Context;
import com.safedk.android.SafeDK;
import com.safedk.android.utils.Logger;

/* JADX INFO: loaded from: classes12.dex */
public class DexBridge {
    private static final String TAG = "DexBridge";

    public static void appClassOnCreateBefore(Application application) {
        Logger.d("SafeDKApplication", "onCreate");
        SafeDK.a(application.getApplicationContext());
        SafeDK.a(application);
    }

    public static String generateString(String str) {
        return str;
    }

    public static Context getContext() {
        return SafeDK.getInstance().l();
    }

    public static void providerOnCreateBefore(ContentProvider contentProvider) {
        Logger.d(TAG, "Content Provider: onCreate (not active)");
    }
}
