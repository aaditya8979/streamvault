package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.kc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3533kc extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3558lc f27463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC3876y6 f27464c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3533kc(C3558lc c3558lc, AbstractC3876y6 abstractC3876y6, hn.c cVar) {
        super(2, cVar);
        this.f27463b = c3558lc;
        this.f27464c = abstractC3876y6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3533kc(this.f27463b, this.f27464c, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3533kc(this.f27463b, this.f27464c, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0079, code lost:
    
        if (r1.a(r13, r12) == r0) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = in.a.g()
            int r1 = r12.f27462a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.c.b(r13)
            goto L7c
        L12:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1a:
            kotlin.c.b(r13)
            goto L6b
        L1e:
            kotlin.c.b(r13)
            com.inmobi.media.lc r13 = r12.f27463b
            com.inmobi.media.x6 r1 = r13.f27563d
            com.inmobi.media.y6 r4 = r12.f27464c
            r1.getClass()
            java.lang.String r5 = "experienceModel"
            tn.p.k(r4, r5)
            boolean r5 = r4 instanceof com.inmobi.media.C3864xj
            if (r5 == 0) goto L45
            com.inmobi.media.wj r5 = new com.inmobi.media.wj
            android.content.Context r7 = r1.f28501a
            do.l0 r8 = r1.f28502b
            r9 = r4
            com.inmobi.media.xj r9 = (com.inmobi.media.C3864xj) r9
            go.k r10 = r1.f28503c
            com.inmobi.media.n9 r11 = r1.f28504d
            r6 = r5
            r6.<init>(r7, r8, r9, r10, r11)
            goto L5a
        L45:
            boolean r5 = r4 instanceof com.inmobi.media.C3668pm
            if (r5 == 0) goto L81
            com.inmobi.media.om r5 = new com.inmobi.media.om
            android.content.Context r7 = r1.f28501a
            do.l0 r8 = r1.f28502b
            r9 = r4
            com.inmobi.media.pm r9 = (com.inmobi.media.C3668pm) r9
            go.k r10 = r1.f28503c
            com.inmobi.media.n9 r11 = r1.f28504d
            r6 = r5
            r6.<init>(r7, r8, r9, r10, r11)
        L5a:
            r13.f27561b = r5
            com.inmobi.media.lc r13 = r12.f27463b
            com.inmobi.media.j2 r13 = r13.f27561b
            if (r13 == 0) goto L6b
            r12.f27462a = r3
            java.lang.Object r13 = r13.a(r12)
            if (r13 != r0) goto L6b
            goto L7b
        L6b:
            com.inmobi.media.lc r13 = r12.f27463b
            com.inmobi.media.j2 r1 = r13.f27561b
            if (r1 == 0) goto L7c
            com.inmobi.media.ads.nativeAd.MediaView r13 = r13.f27562c
            r12.f27462a = r2
            java.lang.Object r13 = r1.a(r13, r12)
            if (r13 != r0) goto L7c
        L7b:
            return r0
        L7c:
            com.inmobi.media.lc r13 = r12.f27463b
            com.inmobi.media.ads.nativeAd.MediaView r13 = r13.f27562c
            return r13
        L81:
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3533kc.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
