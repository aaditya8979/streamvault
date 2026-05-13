package com.bytedance.sdk.component.utils;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public class bly {
    private static volatile Handler ouw;

    public static Handler ouw() {
        return com.bytedance.sdk.component.pno.ouw.ouw.ouw().vt();
    }

    public static Handler vt() {
        if (ouw == null) {
            synchronized (bly.class) {
                if (ouw == null) {
                    ouw = new Handler(Looper.getMainLooper());
                }
            }
        }
        return ouw;
    }
}
