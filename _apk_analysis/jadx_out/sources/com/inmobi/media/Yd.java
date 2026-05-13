package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes10.dex */
public final class Yd extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3281ae f26642a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Yd(C3281ae c3281ae, hn.c cVar) {
        super(2, cVar);
        this.f26642a = c3281ae;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new Yd(this.f26642a, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new Yd(this.f26642a, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        this.f26642a.f26794g.setActivated(true);
        this.f26642a.f26794g.setFocusable(true);
        C3281ae c3281ae = this.f26642a;
        if (c3281ae.f26796i) {
            c3281ae.a();
        } else {
            P4.a(c3281ae.f26789b, new Zd(c3281ae, null));
        }
        return bn.r.f5635a;
    }
}
