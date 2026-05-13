package com.inmobi.media;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import androidx.appcompat.widget.ActivityChooserModel;

/* JADX INFO: renamed from: com.inmobi.media.y5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC3875y5 {
    public static final int a() {
        int i10 = Resources.getSystem().getDisplayMetrics().densityDpi;
        if (640 <= i10 && i10 <= Integer.MAX_VALUE) {
            return 1080;
        }
        if (480 <= i10 && i10 < 640) {
            return 720;
        }
        if (320 > i10 || i10 >= 480) {
            return (240 > i10 || i10 >= 320) ? 240 : 360;
        }
        return 480;
    }

    public static final boolean a(Context context) {
        tn.p.k(context, "<this>");
        Object systemService = context.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        tn.p.i(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        ActivityManager activityManager = (ActivityManager) systemService;
        tn.p.k(activityManager, "<this>");
        C3850x5.f28483a.getClass();
        if (!(C3850x5.u() ? activityManager.isLowRamDevice() : true)) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            if (memoryInfo.availMem / ((long) 1048576) >= 100) {
                return false;
            }
        }
        return true;
    }
}
