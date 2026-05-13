package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.ge, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3436ge extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3734se f27220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f27221b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3436ge(C3734se c3734se, boolean z10, hn.c cVar) {
        super(2, cVar);
        this.f27220a = c3734se;
        this.f27221b = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3436ge(this.f27220a, this.f27221b, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3436ge(this.f27220a, this.f27221b, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        this.f27220a.f28119h.onAudioStateChanged(this.f27221b);
        return bn.r.f5635a;
    }
}
