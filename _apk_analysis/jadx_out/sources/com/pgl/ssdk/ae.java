package com.pgl.ssdk;

import android.content.Context;
import android.content.res.Configuration;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.iab.vast.tags.VastAttributes;

/* JADX INFO: loaded from: classes12.dex */
public class ae {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f51305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f51306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f51307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f51308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f51309e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f51310f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f51311g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f51312h;

    public static int a(Context context) {
        try {
            Configuration configuration = context.getResources().getConfiguration();
            if (configuration != null) {
                return configuration.touchscreen;
            }
        } catch (Throwable unused) {
        }
        return 666666;
    }

    private static void b(Context context) {
        if (context == null) {
            return;
        }
        try {
            new DisplayMetrics();
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            f51310f = (int) displayMetrics.density;
            f51309e = displayMetrics.densityDpi;
        } catch (Throwable unused) {
        }
    }

    private static void c(Context context) {
        try {
            new DisplayMetrics();
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            f51311g = (int) displayMetrics.xdpi;
            f51312h = (int) displayMetrics.ydpi;
        } catch (Throwable unused) {
        }
    }

    private static void d(Context context) {
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            f51305a = displayMetrics.widthPixels;
            f51306b = displayMetrics.heightPixels;
            Display.Mode mode = defaultDisplay.getMode();
            f51307c = mode.getPhysicalWidth();
            f51308d = mode.getPhysicalHeight();
        } catch (Throwable unused) {
        }
    }

    public static String e(Context context) {
        int i10 = -1;
        if (context != null) {
            try {
                i10 = Settings.System.getInt(context.getContentResolver(), "screen_brightness", -1);
            } catch (Throwable unused) {
            }
        }
        return String.valueOf(i10);
    }

    public static String f(Context context) {
        try {
            d(context);
            b(context);
            c(context);
        } catch (Throwable unused) {
        }
        return f51309e + "[<!>]" + f51305a + StringUtils.COMMA + f51306b + "[<!>]" + f51307c + VastAttributes.HORIZONTAL_POSITION + f51308d + "[<!>]";
    }
}
