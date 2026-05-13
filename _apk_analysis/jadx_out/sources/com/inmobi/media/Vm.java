package com.inmobi.media;

/* JADX INFO: loaded from: classes9.dex */
public final class Vm implements go.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ go.l f26512a;

    public Vm(go.l lVar) {
        this.f26512a = lVar;
    }

    @Override // go.d
    public final Object collect(go.e eVar, hn.c cVar) {
        Object objCollect = this.f26512a.collect(new Um(eVar), cVar);
        return objCollect == in.a.g() ? objCollect : bn.r.f5635a;
    }
}
