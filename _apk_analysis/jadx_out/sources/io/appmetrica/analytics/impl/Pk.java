package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes.dex */
public final class Pk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Wk f65761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f65762b;

    public Pk(Wk wk2) {
        this.f65761a = wk2;
    }

    public final Qk a() {
        return new Qk(this);
    }

    public final Pk b() {
        this.f65762b = 3600;
        return this;
    }
}
