package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes9.dex */
public final class R7 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ S7 f26236a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R7(S7 s72, hn.c cVar) {
        super(2, cVar);
        this.f26236a = s72;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new R7(this.f26236a, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new R7(this.f26236a, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        if (this.f26236a.f26288d.d()) {
            S7 s72 = this.f26236a;
            s72.f26286b.setVolume(1.0f);
            P4.a(s72.f26287c, s72.f26285a, new S1(1.0f, false));
            s72.f26289e = false;
        } else {
            this.f26236a.a();
        }
        return bn.r.f5635a;
    }
}
