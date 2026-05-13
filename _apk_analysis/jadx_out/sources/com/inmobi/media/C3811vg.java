package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.vg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3811vg extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3836wg f28370a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3811vg(C3836wg c3836wg, hn.c cVar) {
        super(2, cVar);
        this.f28370a = c3836wg;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3811vg(this.f28370a, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3811vg(this.f28370a, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        C3836wg c3836wg = this.f28370a;
        c3836wg.f28443b.setValue(c3836wg.f28442a.a());
        return bn.r.f5635a;
    }
}
