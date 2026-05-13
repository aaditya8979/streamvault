package com.inmobi.media;

import p000do.i0;

/* JADX INFO: renamed from: com.inmobi.media.u8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3778u8 extends kotlin.coroutines.a implements p000do.i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3803v8 f28244a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3778u8(i0.b bVar, C3803v8 c3803v8) {
        super(bVar);
        this.f28244a = c3803v8;
    }

    @Override // p000do.i0
    public final void handleException(kotlin.coroutines.d dVar, Throwable th2) {
        InterfaceC3580m9 interfaceC3580m9 = this.f28244a.f28337c;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).b("HybridVideoPlayerHandler", "Unhandled exception: " + th2.getMessage());
        }
        bn.g gVar = P9.f26117a;
        P9.a(new L2(th2));
    }
}
