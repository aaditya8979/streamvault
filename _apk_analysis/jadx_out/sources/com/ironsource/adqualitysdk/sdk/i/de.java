package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.view.View;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class de extends cz {
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static boolean m5949(List<Object> list) {
        return ke.m6971((View) cz.m5927(list, 0, View.class));
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static WebView m5950(List<Object> list) {
        int iIntValue;
        Activity activity = (Activity) cz.m5927(list, 0, Activity.class);
        List arrayList = new ArrayList();
        String str = null;
        if (list.size() > 1) {
            iIntValue = ((Integer) cz.m5927(list, 1, Integer.class)).intValue();
            if (list.size() > 2) {
                str = (String) cz.m5927(list, 2, String.class);
                if (list.size() > 3) {
                    arrayList = (List) cz.m5927(list, 3, List.class);
                }
            }
        } else {
            iIntValue = -1;
        }
        return (WebView) ke.m6962(activity, WebView.class, iIntValue, arrayList, str);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static <E extends View> E m5951(List<Object> list) {
        return (E) ke.m6967((View) cz.m5927(list, 0, View.class), (Class) cz.m5927(list, 1, Class.class), ((Boolean) cz.m5927(list, 2, Boolean.class)).booleanValue());
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static View m5952(List<Object> list) {
        return ke.m6968((Activity) cz.m5927(list, 0, Activity.class));
    }
}
