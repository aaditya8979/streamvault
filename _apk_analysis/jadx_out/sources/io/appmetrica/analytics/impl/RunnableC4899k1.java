package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AnrListener;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.k1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class RunnableC4899k1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AnrListener f67080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5149u1 f67081b;

    public RunnableC4899k1(C5149u1 c5149u1, AnrListener anrListener) {
        this.f67081b = c5149u1;
        this.f67080a = anrListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5149u1.a(this.f67081b).a(this.f67080a);
    }
}
