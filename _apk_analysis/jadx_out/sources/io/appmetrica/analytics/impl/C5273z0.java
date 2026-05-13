package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5273z0 {
    public static boolean a() {
        boolean z10;
        synchronized (C5248y0.class) {
            z10 = C5248y0.f67996f;
        }
        return z10;
    }

    public static void b() {
        synchronized (C5248y0.class) {
            C5248y0.f67996f = true;
        }
    }
}
