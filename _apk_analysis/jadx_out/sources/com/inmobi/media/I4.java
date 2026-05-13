package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes8.dex */
public final class I4 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W5 f25639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f25640c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I4(W5 w52, long j10, hn.c cVar) {
        super(2, cVar);
        this.f25639b = w52;
        this.f25640c = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new I4(this.f25639b, this.f25640c, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new I4(this.f25639b, this.f25640c, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f25638a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            K4 k42 = K4.f25792a;
            W5 w52 = this.f25639b;
            int maxAdRecords = K4.c().getContextualData().getMaxAdRecords();
            long j10 = this.f25640c;
            this.f25638a = 1;
            tn.p.j("K4", "TAG");
            C4 c42 = (C4) K4.f25793b.getValue();
            C3431g9 c3431g9 = c42.f25245a;
            B4 b42 = new B4(c42, w52, j10, maxAdRecords, null);
            c3431g9.getClass();
            Object objA = c3431g9.a(new C3405f9(c3431g9, b42, null), this);
            if (objA != in.a.g()) {
                objA = bn.r.f5635a;
            }
            if (objA != in.a.g()) {
                objA = bn.r.f5635a;
            }
            if (objA == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        return bn.r.f5635a;
    }
}
