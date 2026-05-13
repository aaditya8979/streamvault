package com.mbridge.msdk.foundation.same;

/* JADX INFO: compiled from: MBridgeRefactor.java */
/* JADX INFO: loaded from: classes11.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile b f37718b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Boolean f37719a = null;

    private b() {
    }

    public static b b() {
        if (f37718b == null) {
            synchronized (b.class) {
                if (f37718b == null) {
                    f37718b = new b();
                }
            }
        }
        return f37718b;
    }

    public Boolean a() {
        return this.f37719a;
    }
}
