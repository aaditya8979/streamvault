package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.q1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class RunnableC5050q1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f67551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f67552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C5149u1 f67553c;

    public RunnableC5050q1(C5149u1 c5149u1, String str, List list) {
        this.f67553c = c5149u1;
        this.f67551a = str;
        this.f67552b = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5149u1.a(this.f67553c).reportEvent(this.f67551a, CollectionUtils.getMapFromList(this.f67552b));
    }
}
