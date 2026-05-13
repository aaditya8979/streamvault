package com.inmobi.media;

import java.io.File;

/* JADX INFO: loaded from: classes6.dex */
public final class E5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f25362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f25363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public D5 f25364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ H5 f25365e;

    public E5(H5 h52, String str) {
        this.f25365e = h52;
        this.f25361a = str;
        this.f25362b = new long[h52.f25575h];
    }

    public final File a(int i10) {
        return new File(this.f25365e.f25569b, this.f25361a + "." + i10);
    }

    public final File b(int i10) {
        return new File(this.f25365e.f25569b, this.f25361a + "." + i10 + ".tmp");
    }
}
