package io.appmetrica.analytics.impl;

import android.content.Context;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4639a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f66326a;

    public C4639a(Context context) {
        this.f66326a = context;
    }

    public final byte[] a() {
        try {
            return AbstractC4840hj.a(new StringBuilder(this.f66326a.getPackageName()).reverse().toString());
        } catch (Throwable unused) {
            return new byte[16];
        }
    }

    public final byte[] b() {
        try {
            return AbstractC4840hj.a(this.f66326a.getPackageName());
        } catch (Throwable unused) {
            return new byte[16];
        }
    }
}
