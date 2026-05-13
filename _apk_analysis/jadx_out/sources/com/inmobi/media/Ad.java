package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes7.dex */
public final class Ad extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Nc f25157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f25159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Dd f25160d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ad(Dd dd2, hn.c cVar) {
        super(2, cVar);
        this.f25160d = dd2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        Ad ad2 = new Ad(this.f25160d, cVar);
        ad2.f25159c = obj;
        return ad2;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        Ad ad2 = new Ad(this.f25160d, (hn.c) obj2);
        ad2.f25159c = (p000do.l0) obj;
        return ad2.invokeSuspend(bn.r.f5635a);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0102  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Ad.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
