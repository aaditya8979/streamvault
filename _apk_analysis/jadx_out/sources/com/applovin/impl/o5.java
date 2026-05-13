package com.applovin.impl;

import com.applovin.impl.v;

/* JADX INFO: loaded from: classes.dex */
public class o5 extends i5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a f9445g;

    public interface a {
        void a(v.a aVar);
    }

    public o5(com.applovin.impl.sdk.k kVar, a aVar) {
        super("TaskCollectAdvertisingId", kVar, true);
        this.f9445g = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f9445g.a(this.f8505a.A().f());
    }
}
