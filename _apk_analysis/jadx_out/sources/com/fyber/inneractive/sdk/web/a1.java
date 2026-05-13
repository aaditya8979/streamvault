package com.fyber.inneractive.sdk.web;

/* JADX INFO: loaded from: classes2.dex */
public final class a1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b1 f19589a;

    public a1(b1 b1Var) {
        this.f19589a = b1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f19589a.f19592a.evictAll();
        } catch (Throwable unused) {
        }
    }
}
