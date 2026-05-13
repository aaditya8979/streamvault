package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.ln, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3569ln extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3669pn f27586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ij f27587b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3569ln(C3669pn c3669pn, Ij ij2, hn.c cVar) {
        super(2, cVar);
        this.f27586a = c3669pn;
        this.f27587b = ij2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3569ln(this.f27586a, this.f27587b, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3569ln(this.f27586a, this.f27587b, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        C3669pn c3669pn = this.f27586a;
        c3669pn.f27907h = this.f27587b;
        c3669pn.f27905f.a(c3669pn.f27909j);
        return bn.r.f5635a;
    }
}
