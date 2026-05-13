package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;

/* JADX INFO: loaded from: classes11.dex */
public final class L implements Provider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f65506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N f65507b;

    public L(N n10, Context context) {
        this.f65507b = n10;
        this.f65506a = context;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    public final Object get() {
        return this.f65507b.f65610a.a(this.f65506a);
    }
}
