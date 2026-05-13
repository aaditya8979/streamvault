package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.rd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3708rd extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f28057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Dd f28058b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3708rd(Dd dd2, hn.c cVar) {
        super(2, cVar);
        this.f28058b = dd2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3708rd(this.f28058b, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3708rd(this.f28058b, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b6, code lost:
    
        if (r13 != r0) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b4  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = in.a.g()
            int r1 = r12.f28057a
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L27
            if (r1 == r4) goto L23
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L17
            kotlin.c.b(r13)
            goto Lb9
        L17:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1f:
            kotlin.c.b(r13)
            goto L4d
        L23:
            kotlin.c.b(r13)
            goto L42
        L27:
            kotlin.c.b(r13)
            com.inmobi.media.Dd r13 = r12.f28058b
            r12.f28057a = r4
            r13.getClass()
            do.y1 r1 = p000do.w0.c()
            com.inmobi.media.sd r4 = new com.inmobi.media.sd
            r4.<init>(r13, r5)
            java.lang.Object r13 = p000do.g.g(r1, r4, r12)
            if (r13 != r0) goto L42
            goto Lb8
        L42:
            com.inmobi.media.pf r13 = com.inmobi.media.C3661pf.f27874a
            r12.f28057a = r3
            java.lang.Object r13 = r13.a(r12)
            if (r13 != r0) goto L4d
            goto Lb8
        L4d:
            com.inmobi.media.Dd r13 = r12.f28058b
            com.inmobi.media.Ec r1 = r13.f25315b
            com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse r1 = r1.f25380b
            com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject r1 = r1.getAssetsObject()
            if (r1 == 0) goto L5e
            com.inmobi.media.ads.network.inmobiJson.model.NativeMedia r1 = r1.getMedia()
            goto L5f
        L5e:
            r1 = r5
        L5f:
            java.lang.String r3 = "NativeLoadingState"
            if (r1 != 0) goto L71
            com.inmobi.media.m9 r13 = r13.l()
            if (r13 == 0) goto L9d
            com.inmobi.media.n9 r13 = (com.inmobi.media.C3605n9) r13
            java.lang.String r1 = "listenToVideoLoadAndErrorEvents - no media assets, skipping"
            r13.a(r3, r1)
            goto L9d
        L71:
            com.inmobi.media.m9 r1 = r13.l()
            if (r1 == 0) goto L7e
            com.inmobi.media.n9 r1 = (com.inmobi.media.C3605n9) r1
            java.lang.String r4 = "listenToVideoLoadAndErrorEvents - media assets found, setting up listener"
            r1.a(r3, r4)
        L7e:
            com.inmobi.media.Ec r1 = r13.f25315b
            bn.g r1 = r1.f25385g
            java.lang.Object r1 = r1.getValue()
            com.inmobi.media.lc r1 = (com.inmobi.media.C3558lc) r1
            go.k r1 = r1.f27564e
            com.inmobi.media.xd r3 = new com.inmobi.media.xd
            r3.<init>(r1)
            do.l0 r6 = r13.f25318e
            com.inmobi.media.ud r9 = new com.inmobi.media.ud
            r9.<init>(r3, r5, r13)
            r7 = 0
            r8 = 0
            r10 = 3
            r11 = 0
            p000do.g.d(r6, r7, r8, r9, r10, r11)
        L9d:
            com.inmobi.media.Dd r13 = r12.f28058b
            r12.f28057a = r2
            r13.getClass()
            com.inmobi.media.Ad r1 = new com.inmobi.media.Ad
            r1.<init>(r13, r5)
            java.lang.Object r13 = p000do.j2.c(r1, r12)
            java.lang.Object r1 = in.a.g()
            if (r13 != r1) goto Lb4
            goto Lb6
        Lb4:
            bn.r r13 = bn.r.f5635a
        Lb6:
            if (r13 != r0) goto Lb9
        Lb8:
            return r0
        Lb9:
            bn.r r13 = bn.r.f5635a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3708rd.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
