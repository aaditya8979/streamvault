package com.fyber.inneractive.sdk.click;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f15940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f15941b;

    public n(r rVar, b bVar) {
        this.f15941b = rVar;
        this.f15940a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o oVar = this.f15941b.f15945d;
        if (oVar != null) {
            oVar.a(this.f15940a);
        }
    }
}
