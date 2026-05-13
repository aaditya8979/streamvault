package io.appmetrica.analytics.impl;

import android.content.Context;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.c5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4697c5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f66473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final R4 f66474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5293zk f66475c = C5009oa.k().B();

    public C4697c5(Context context, R4 r42) {
        this.f66473a = context;
        this.f66474b = r42;
    }

    public final Xe a() {
        return new Xe(this.f66475c.b(this.f66473a, this.f66474b));
    }
}
