package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

/* JADX INFO: loaded from: classes4.dex */
public final class lh {
    public static int ouw = -1;

    public static int ouw(Context context) {
        DisplayMetrics displayMetrics;
        if (context != null) {
            try {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                Resources resources = context.getResources();
                if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null && resources.getConfiguration() != null) {
                    return Math.round(displayMetrics.heightPixels / displayMetrics.density);
                }
            } catch (Throwable unused) {
                return ouw;
            }
        }
        return ouw;
    }

    public static int ouw(Context context, int i10) {
        int iOuw = ouw(context);
        if (iOuw == -1) {
            return ouw;
        }
        return Math.max(Math.min(i10 > 655 ? Math.round((i10 / 728.0f) * 90.0f) : i10 > 632 ? 81 : i10 > 526 ? Math.round((i10 / 468.0f) * 60.0f) : i10 > 432 ? 68 : Math.round((i10 / 320.0f) * 50.0f), Math.min(90, Math.round(iOuw * 0.15f))), 50);
    }
}
