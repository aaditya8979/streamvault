package com.safedk.android.utils;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class Logger {
    private static boolean debugMode = false;

    private Logger() {
    }

    public static int d(String str) {
        if (!debugMode) {
            return 0;
        }
        String[] strArrSplit = str.split("\\|");
        if (strArrSplit.length > 1) {
            return Log.d(strArrSplit[0], strArrSplit[1]);
        }
        if (strArrSplit.length == 1) {
            return Log.d("UnknownClass", strArrSplit[0]);
        }
        return 0;
    }

    public static int d(String str, String str2) {
        if (debugMode) {
            return Log.d(str, str2);
        }
        return 0;
    }

    public static int d(String str, String str2, Throwable th2) {
        if (debugMode) {
            return Log.d(str, str2, th2);
        }
        return 0;
    }

    public static int e(String str, String str2) {
        try {
            return Log.e(str, str2);
        } catch (Throwable th2) {
            return 0;
        }
    }

    public static int e(String str, String str2, Throwable th2) {
        try {
            return Log.e(str, str2, th2);
        } catch (Throwable th3) {
            return 0;
        }
    }

    public static boolean getDebugMode() {
        return debugMode;
    }

    public static int i(String str, String str2) {
        return Log.i(str, str2);
    }

    public static int i(String str, String str2, Throwable th2) {
        return Log.i(str, str2, th2);
    }

    public static void printStackTrace() {
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            Log.d("StackTrace", stackTraceElement.toString());
        }
    }

    public static void printStackTrace(String str) {
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            Log.d(str, "printStackTrace " + stackTraceElement.toString());
        }
    }

    public static void setDebugMode(boolean z10) {
        debugMode = z10;
    }

    public static int v(String str, String str2) {
        if (debugMode) {
            return Log.v(str, str2);
        }
        return 0;
    }

    public static int v(String str, String str2, Throwable th2) {
        if (debugMode) {
            return Log.v(str, str2, th2);
        }
        return 0;
    }

    public static int w(String str, String str2) {
        return Log.w(str, str2);
    }

    public static int w(String str, String str2, Throwable th2) {
        return Log.w(str, str2, th2);
    }

    public static int w(String str, Throwable th2) {
        return Log.w(str, th2);
    }
}
