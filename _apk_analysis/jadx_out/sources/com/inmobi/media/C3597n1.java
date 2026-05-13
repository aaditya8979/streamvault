package com.inmobi.media;

import p000do.i0;

/* JADX INFO: renamed from: com.inmobi.media.n1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3597n1 extends kotlin.coroutines.a implements p000do.i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3622o1 f27663a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3597n1(i0.b bVar, C3622o1 c3622o1) {
        super(bVar);
        this.f27663a = c3622o1;
    }

    @Override // p000do.i0
    public final void handleException(kotlin.coroutines.d dVar, Throwable th2) {
        C3605n9 c3605n9 = this.f27663a.f27735c;
        if (c3605n9 != null) {
            c3605n9.b("AdUnitManager", "Exception: " + bn.d.b(th2));
        }
        bn.g gVar = P9.f26117a;
        P9.a(new L2(th2));
    }
}
