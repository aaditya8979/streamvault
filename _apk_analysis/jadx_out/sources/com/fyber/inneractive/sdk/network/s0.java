package com.fyber.inneractive.sdk.network;

/* JADX INFO: loaded from: classes4.dex */
public final class s0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f17030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Exception f17031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f17032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t0 f17033d;

    public s0(t0 t0Var, Object obj, Exception exc, boolean z10) {
        this.f17033d = t0Var;
        this.f17030a = obj;
        this.f17031b = exc;
        this.f17032c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17033d.f17035b.a(this.f17030a, this.f17031b, this.f17032c);
    }
}
