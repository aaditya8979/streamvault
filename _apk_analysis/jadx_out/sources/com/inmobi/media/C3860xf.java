package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.xf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3860xf extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f28520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3885yf f28521b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3860xf(C3885yf c3885yf, hn.c cVar) {
        super(2, cVar);
        this.f28521b = c3885yf;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3860xf(this.f28521b, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3860xf(this.f28521b, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (r5.a(r4) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = in.a.g()
            int r1 = r4.f28520a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.c.b(r5)
            goto L37
        L12:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1a:
            kotlin.c.b(r5)
            goto L2c
        L1e:
            kotlin.c.b(r5)
            com.inmobi.media.yf r5 = r4.f28521b
            r4.f28520a = r3
            java.lang.Object r5 = com.inmobi.media.C3885yf.a(r5, r4)
            if (r5 != r0) goto L2c
            goto L36
        L2c:
            com.inmobi.media.pf r5 = com.inmobi.media.C3661pf.f27874a
            r4.f28520a = r2
            java.lang.Object r5 = r5.a(r4)
            if (r5 != r0) goto L37
        L36:
            return r0
        L37:
            bn.r r5 = bn.r.f5635a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3860xf.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
