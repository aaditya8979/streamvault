package com.fyber.inneractive.sdk.web;

/* JADX INFO: loaded from: classes2.dex */
public final class e1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i1 f19621a;

    public e1(i1 i1Var) {
        this.f19621a = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m mVar = this.f19621a.f19631b;
        if (mVar != null) {
            mVar.getViewTreeObserver().addOnPreDrawListener(this.f19621a.K);
        }
    }
}
