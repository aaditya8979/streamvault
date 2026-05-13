package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;

/* JADX INFO: loaded from: classes11.dex */
public final class M implements Provider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f65548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Hi f65549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N f65550c;

    public M(N n10, Context context, Hi hi2) {
        this.f65550c = n10;
        this.f65548a = context;
        this.f65549b = hi2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    public final Object get() {
        return this.f65550c.f65610a.a(this.f65548a, this.f65549b);
    }
}
