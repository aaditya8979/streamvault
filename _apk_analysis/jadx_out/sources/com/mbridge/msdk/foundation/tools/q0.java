package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.MBridgeConstans;

/* JADX INFO: compiled from: SameLogTool.java */
/* JADX INFO: loaded from: classes7.dex */
public class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f38148a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f38149b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f38150c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f38151d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f38152e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f38153f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f38154g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f38155h = true;

    static {
        if (MBridgeConstans.DEBUG) {
            return;
        }
        f38154g = false;
        f38148a = false;
        f38150c = false;
        f38155h = false;
        f38149b = false;
        f38153f = false;
        f38152e = false;
        f38151d = false;
    }

    private static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        return "MBRIDGE_" + str;
    }

    public static void a(String str, String str2) {
        if (!f38148a || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.d(a(str), str2);
    }

    public static void a(String str, String str2, Throwable th2) {
        if (!f38148a || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.d(a(str), str2, th2);
    }

    public static void a(String str, Throwable th2) {
        if (!f38155h || th2 == null) {
            return;
        }
        Log.w(a(str), th2);
    }

    public static void b(String str, String str2) {
        if (!f38149b || str2 == null) {
            return;
        }
        Log.e(a(str), str2);
    }

    public static void b(String str, String str2, Throwable th2) {
        if (!f38149b || str2 == null || th2 == null) {
            return;
        }
        Log.e(a(str), str2, th2);
    }

    public static void c(String str, String str2) {
        if (!f38150c || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.i(a(str), str2);
    }

    public static void c(String str, String str2, Throwable th2) {
        if (!f38155h || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.w(a(str), str2, th2);
    }

    public static void d(String str, String str2) {
        if (!f38155h || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.w(a(str), str2);
    }
}
