package com.fyber.inneractive.sdk.web;

/* JADX INFO: loaded from: classes10.dex */
public final class s0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v0 f19705a;

    public s0(v0 v0Var) {
        this.f19705a = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f19705a.f19730u.compareAndSet(false, true)) {
            this.f19705a.d("onCancelResult(true);");
            this.f19705a.f19731v.set(false);
        }
    }
}
