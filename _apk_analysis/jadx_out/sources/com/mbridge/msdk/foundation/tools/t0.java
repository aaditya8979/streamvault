package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import java.io.File;

/* JADX INFO: compiled from: SameSDCardTool.java */
/* JADX INFO: loaded from: classes6.dex */
public class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f38177a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile boolean f38178b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f38179c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f38180d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static long f38181e;

    /* JADX INFO: compiled from: SameSDCardTool.java */
    public class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            t0.b();
        }
    }

    public static int a() {
        if (System.currentTimeMillis() - f38181e > 1800000) {
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new a());
        }
        return f38179c;
    }

    public static void a(Context context) {
        if (context == null) {
            return;
        }
        try {
            if (f38178b) {
                return;
            }
            f38178b = true;
            File externalFilesDir = context.getExternalFilesDir(null);
            if (externalFilesDir != null) {
                f38177a = externalFilesDir.getAbsolutePath();
            }
            try {
                b(context);
            } catch (Exception unused) {
                b(context);
            }
        } catch (Exception e10) {
            q0.b("SameSDCardTool", e10.getMessage());
        }
    }

    public static void b() {
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            long blockSize = statFs.getBlockSize();
            long availableBlocks = statFs.getAvailableBlocks();
            f38180d = Long.valueOf(((((long) statFs.getBlockCount()) * blockSize) / 1000) / 1000).intValue();
            f38179c = Long.valueOf(((availableBlocks * blockSize) / 1000) / 1000).intValue();
            f38181e = System.currentTimeMillis();
        } catch (Exception e10) {
            q0.b("SameSDCardTool", e10.getMessage());
        }
    }

    private static void b(Context context) {
        File externalFilesDir;
        if (TextUtils.isEmpty(f38177a) && (externalFilesDir = context.getExternalFilesDir(null)) != null) {
            f38177a = externalFilesDir.getAbsolutePath();
        }
        if (!TextUtils.isEmpty(f38177a)) {
            com.mbridge.msdk.foundation.same.directory.e.a(new com.mbridge.msdk.foundation.same.directory.d(f38177a));
            com.mbridge.msdk.foundation.same.directory.e.b().a();
        }
        b();
    }

    public static int c() {
        return f38180d;
    }
}
