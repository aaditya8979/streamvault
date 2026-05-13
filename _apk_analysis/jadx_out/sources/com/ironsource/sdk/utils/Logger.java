package com.ironsource.sdk.utils;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.C4266t8;

/* JADX INFO: loaded from: classes2.dex */
public class Logger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f34013a;

    public static void d(String str, String str2) {
        if (f34013a) {
            Log.d(str, str2);
        }
    }

    public static void d(String str, String str2, Throwable th2) {
        if (f34013a) {
            Log.d(str, str2, th2);
        }
    }

    public static void e(String str, String str2) {
        if (f34013a) {
            Log.e(str, str2);
        }
    }

    public static void e(String str, String str2, Throwable th2) {
        if (f34013a) {
            Log.e(str, str2, th2);
        }
    }

    public static void enableLogging(int i10) {
        f34013a = C4266t8.d.MODE_0.b() != i10;
    }

    public static void i(String str, String str2) {
        if (f34013a) {
            Log.i(str, str2);
        }
    }

    public static void i(String str, String str2, Throwable th2) {
        if (!f34013a || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.i(str, str2, th2);
    }

    public static void v(String str, String str2) {
        if (f34013a) {
            Log.v(str, str2);
        }
    }

    public static void v(String str, String str2, Throwable th2) {
        if (f34013a) {
            Log.v(str, str2, th2);
        }
    }

    public static void w(String str, String str2) {
        if (f34013a) {
            Log.w(str, str2);
        }
    }

    public static void w(String str, String str2, Throwable th2) {
        if (f34013a) {
            Log.w(str, str2, th2);
        }
    }
}
