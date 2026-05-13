package io.appmetrica.analytics.impl;

import android.content.Context;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.xd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC5236xd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static C5257y9 f67945a;

    public static final synchronized C5257y9 a(Context context) {
        C5257y9 c5257y9;
        c5257y9 = f67945a;
        if (c5257y9 == null) {
            c5257y9 = new C5257y9(context, "uuid.dat");
            f67945a = c5257y9;
        }
        return c5257y9;
    }
}
