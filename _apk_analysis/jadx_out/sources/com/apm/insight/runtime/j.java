package com.apm.insight.runtime;

import com.apm.insight.MonitorCrash;

/* JADX INFO: compiled from: MonitorCrashInner.java */
/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static MonitorCrash f7525a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f7526b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f7527c;

    public static MonitorCrash a() {
        if (f7525a == null) {
            MonitorCrash monitorCrashInitSDK = MonitorCrash.initSDK(com.apm.insight.e.g(), "239017", 20089L, "2008-20250701130429", "com.apm.insight");
            f7525a = monitorCrashInitSDK;
            monitorCrashInitSDK.config().setChannel("release");
        }
        return f7525a;
    }

    public static void a(Throwable th2, String str) {
        if (com.apm.insight.e.g() == null) {
            return;
        }
        if (f7526b == -1) {
            f7526b = 5;
        }
        int i10 = f7527c;
        boolean z10 = true;
        if (i10 < f7526b) {
            f7527c = i10 + 1;
        } else {
            z10 = false;
        }
        if (z10) {
            a().reportCustomErr(str, "INNER", th2);
        }
    }
}
