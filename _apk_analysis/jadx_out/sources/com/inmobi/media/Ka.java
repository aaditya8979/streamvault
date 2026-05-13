package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes9.dex */
public final class Ka extends SuspendLambda implements sn.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ La f25805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Q9 f25806c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ka(La la2, Q9 q92, hn.c cVar) {
        super(1, cVar);
        this.f25805b = la2;
        this.f25806c = q92;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(hn.c cVar) {
        return new Ka(this.f25805b, this.f25806c, cVar);
    }

    @Override // sn.l
    public final Object invoke(Object obj) {
        return new Ka(this.f25805b, this.f25806c, (hn.c) obj).invokeSuspend(bn.r.f5635a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0074, code lost:
    
        if (com.inmobi.media.La.a(r6, r1, r5) == r0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009d, code lost:
    
        if (com.inmobi.media.La.a(r6, r1, r5) == r0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ca, code lost:
    
        if (com.inmobi.media.La.a(r6, r1, r5) == r0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00cc, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Ka.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
