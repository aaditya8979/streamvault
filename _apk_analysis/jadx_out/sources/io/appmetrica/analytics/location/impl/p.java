package io.appmetrica.analytics.location.impl;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f68139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f68140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f68141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f68142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f68143e = new HashMap();

    public p(List list, i iVar) {
        this.f68142d = list;
        this.f68139a = iVar;
        m mVar = new m();
        this.f68140b = mVar;
        this.f68141c = new h(mVar);
    }

    public final m a() {
        return this.f68140b;
    }
}
