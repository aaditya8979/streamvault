package com.fyber.inneractive.sdk.web;

/* JADX INFO: loaded from: classes3.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v0 f19697a;

    public r0(v0 v0Var) {
        this.f19697a = v0Var;
    }

    public final void a(boolean z10) {
        if (this.f19697a.f19730u.compareAndSet(false, true)) {
            this.f19697a.d("onCancelResult(" + z10 + ");");
            this.f19697a.f19731v.set(false);
        }
    }
}
