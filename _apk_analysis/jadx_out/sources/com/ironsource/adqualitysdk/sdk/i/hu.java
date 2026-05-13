package com.ironsource.adqualitysdk.sdk.i;

/* JADX INFO: loaded from: classes11.dex */
public final class hu {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static hu f2425;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final hq f2427 = new hq();

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private final hz f2426 = new hz();

    private hu() {
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static synchronized hu m6425() {
        if (f2425 == null) {
            f2425 = new hu();
        }
        return f2425;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static synchronized void m6426() {
        f2425 = null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final hz m6427() {
        return this.f2426;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final hq m6428() {
        return this.f2427;
    }
}
