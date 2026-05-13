package com.fyber.inneractive.sdk.player.cache;

import java.io.File;

/* JADX INFO: loaded from: classes8.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f17104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f17105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f17106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f17107e;

    public e(g gVar, String str) {
        this.f17107e = gVar;
        this.f17103a = str;
        this.f17104b = new long[gVar.f17116g];
    }

    public final File a(int i10) {
        return new File(this.f17107e.f17110a, this.f17103a + "." + i10);
    }

    public final File b(int i10) {
        return new File(this.f17107e.f17110a, this.f17103a + "." + i10 + ".tmp");
    }
}
