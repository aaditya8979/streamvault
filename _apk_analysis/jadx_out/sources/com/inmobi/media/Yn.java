package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.AdResponse;
import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
public final class Yn extends R0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Le f26669b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Yn(Le le2, C3605n9 c3605n9) {
        super(c3605n9);
        tn.p.k(le2, "networkRequest");
        this.f26669b = le2;
    }

    @Override // com.inmobi.media.R0
    public final bn.r a(AdResponse adResponse, sn.l lVar) {
        Objects.toString(adResponse);
        V0.a(adResponse, this.f26215a, lVar);
        return bn.r.f5635a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.inmobi.media.R0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(hn.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.inmobi.media.Xn
            if (r0 == 0) goto L13
            r0 = r5
            com.inmobi.media.Xn r0 = (com.inmobi.media.Xn) r0
            int r1 = r0.f26606c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26606c = r1
            goto L1a
        L13:
            com.inmobi.media.Xn r0 = new com.inmobi.media.Xn
            kotlin.coroutines.jvm.internal.ContinuationImpl r5 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r5
            r0.<init>(r4, r5)
        L1a:
            java.lang.Object r5 = r0.f26604a
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f26606c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.c.b(r5)
            goto L43
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            kotlin.c.b(r5)
            com.inmobi.media.s0 r5 = com.inmobi.media.C3720s0.f28083a
            com.inmobi.media.Le r2 = r4.f26669b
            r0.f26606c = r3
            java.lang.Object r5 = r5.a(r2, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            com.inmobi.media.Ne r5 = (com.inmobi.media.Ne) r5
            zn.i r0 = com.inmobi.media.Se.f26314a
            java.lang.String r0 = "<this>"
            tn.p.k(r5, r0)
            okio.ByteString r5 = r5.d()
            java.nio.charset.Charset r0 = bo.c.f5639b
            java.lang.String r5 = r5.string(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Yn.a(hn.c):java.lang.Object");
    }
}
