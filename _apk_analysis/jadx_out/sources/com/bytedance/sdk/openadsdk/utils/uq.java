package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import java.io.File;
import java.lang.Thread;

/* JADX INFO: loaded from: classes4.dex */
public final class uq implements Thread.UncaughtExceptionHandler {
    public static volatile boolean ouw;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private String f14391lh;
    private final Thread.UncaughtExceptionHandler vt = Thread.getDefaultUncaughtExceptionHandler();

    private uq() {
        Thread.setDefaultUncaughtExceptionHandler(this);
        vt();
    }

    public static uq ouw() {
        return new uq();
    }

    private void vt() {
        Context contextOuw = com.bytedance.sdk.openadsdk.core.zih.ouw();
        if (contextOuw == null) {
            return;
        }
        try {
            File file = new File(contextOuw.getFilesDir(), "TTCache");
            file.mkdirs();
            this.f14391lh = file.getPath();
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0180 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0185 A[EXC_TOP_SPLITTER, PHI: r3
      0x0185: PHI (r3v4 java.io.FileOutputStream) = (r3v3 java.io.FileOutputStream), (r3v8 java.io.FileOutputStream) binds: [B:75:0x0197, B:65:0x0183] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0194 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01aa A[ADDED_TO_REGION] */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void uncaughtException(java.lang.Thread r20, java.lang.Throwable r21) {
        /*
            Method dump skipped, instruction units count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.uq.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
