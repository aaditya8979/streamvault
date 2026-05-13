package com.fyber.inneractive.sdk.network;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f17008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f17009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m1 f17011d = new m1(this);

    public n1(t0 t0Var, Thread thread, int i10) {
        this.f17009b = new WeakReference(t0Var);
        this.f17008a = new WeakReference(thread);
        this.f17010c = i10;
    }
}
