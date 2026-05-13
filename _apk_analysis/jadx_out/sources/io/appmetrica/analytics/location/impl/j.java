package io.appmetrica.analytics.location.impl;

import io.appmetrica.analytics.locationapi.internal.CacheArguments;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f68118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f68119b;

    public j(k kVar, i iVar) {
        this.f68119b = kVar;
        this.f68118a = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p pVar = this.f68119b.f68122c;
        i iVar = this.f68118a;
        pVar.f68139a = iVar;
        CacheArguments cacheArguments = iVar.f68117b;
        pVar.f68140b.updateCacheControl(cacheArguments.getRefreshPeriod(), cacheArguments.getOutdatedTimeInterval());
    }
}
