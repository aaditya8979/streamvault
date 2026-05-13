package com.applovin.impl;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes9.dex */
public abstract class c0 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.applovin.impl.sdk.k f7903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.applovin.impl.sdk.o f7905c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f7907e = new AtomicBoolean();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f7906d = com.applovin.impl.sdk.k.o();

    public c0(String str, com.applovin.impl.sdk.k kVar) {
        this.f7904b = str;
        this.f7903a = kVar;
        this.f7905c = kVar.O();
    }

    public Context a() {
        return this.f7906d;
    }

    public void a(boolean z10) {
        this.f7907e.set(z10);
    }
}
