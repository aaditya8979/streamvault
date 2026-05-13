package com.inmobi.media;

import p000do.i0;

/* JADX INFO: loaded from: classes8.dex */
public final class K7 extends kotlin.coroutines.a implements p000do.i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N7 f25801a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K7(i0.b bVar, N7 n72) {
        super(bVar);
        this.f25801a = n72;
    }

    @Override // p000do.i0
    public final void handleException(kotlin.coroutines.d dVar, Throwable th2) {
        InterfaceC3580m9 interfaceC3580m9 = this.f25801a.f25993b;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).b("HtmlMediaPlayer", "Unhandled exception: " + th2.getMessage());
        }
        bn.g gVar = P9.f26117a;
        P9.a(new L2(th2));
    }
}
