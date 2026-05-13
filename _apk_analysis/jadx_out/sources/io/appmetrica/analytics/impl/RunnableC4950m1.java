package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.m1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class RunnableC4950m1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f67252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5149u1 f67253b;

    public RunnableC4950m1(C5149u1 c5149u1, List list) {
        this.f67253b = c5149u1;
        this.f67252a = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5149u1.a(this.f67253b).reportAnr(CollectionUtils.getMapFromList(this.f67252a));
    }
}
