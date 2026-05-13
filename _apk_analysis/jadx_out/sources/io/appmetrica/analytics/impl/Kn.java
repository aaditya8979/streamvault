package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes7.dex */
public class Kn implements Hi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f65503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f65504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f65505c = 0;

    public Kn(int i10, int i11) {
        this.f65503a = i10;
        this.f65504b = i11;
    }

    public final int a() {
        return this.f65504b;
    }

    public final boolean b() {
        int i10 = this.f65505c;
        this.f65505c = i10 + 1;
        return i10 < this.f65503a;
    }

    public final void c() {
        this.f65505c = 0;
    }
}
