package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.m5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class RunnableC4954m5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC4680be f67262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4979n5 f67263b;

    public RunnableC4954m5(C4979n5 c4979n5, InterfaceC4680be interfaceC4680be) {
        this.f67263b = c4979n5;
        this.f67262a = interfaceC4680be;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f67263b) {
            C4979n5 c4979n5 = this.f67263b;
            Object obj = c4979n5.f67325a;
            if (obj == null) {
                c4979n5.f67326b.add(this.f67262a);
            } else {
                this.f67262a.consume(obj);
            }
        }
    }
}
