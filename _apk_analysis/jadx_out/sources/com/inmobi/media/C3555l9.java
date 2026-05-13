package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Objects;

/* JADX INFO: renamed from: com.inmobi.media.l9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3555l9 implements Gg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InMobiJsonResponse f27552b;

    public C3555l9(String str) {
        tn.p.k(str, "content");
        this.f27551a = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // com.inmobi.media.Gg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(hn.c r6) {
        /*
            r5 = this;
            java.lang.String r0 = "type"
            boolean r1 = r6 instanceof com.inmobi.media.C3530k9
            if (r1 == 0) goto L15
            r1 = r6
            com.inmobi.media.k9 r1 = (com.inmobi.media.C3530k9) r1
            int r2 = r1.f27460d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f27460d = r2
            goto L1c
        L15:
            com.inmobi.media.k9 r1 = new com.inmobi.media.k9
            kotlin.coroutines.jvm.internal.ContinuationImpl r6 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r6
            r1.<init>(r5, r6)
        L1c:
            java.lang.Object r6 = r1.f27458b
            java.lang.Object r2 = in.a.g()
            int r3 = r1.f27460d
            r4 = 1
            if (r3 == 0) goto L37
            if (r3 != r4) goto L2f
            com.inmobi.media.l9 r0 = r1.f27457a
            kotlin.c.b(r6)     // Catch: java.lang.Throwable -> L6b
            goto L64
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L37:
            kotlin.c.b(r6)
            java.lang.Class<com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse> r6 = com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse.class
            java.lang.String r3 = "clazz"
            tn.p.k(r6, r3)     // Catch: java.lang.Throwable -> L6b
            tn.p.k(r6, r0)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r3 = r5.f27551a     // Catch: java.lang.Throwable -> L6b
            r1.f27457a = r5     // Catch: java.lang.Throwable -> L6b
            r1.f27460d = r4     // Catch: java.lang.Throwable -> L6b
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L6b
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r3 = "jsonObject"
            tn.p.k(r1, r3)     // Catch: java.lang.Throwable -> L6b
            tn.p.k(r6, r0)     // Catch: java.lang.Throwable -> L6b
            r0 = 0
            java.lang.Object r0 = com.inmobi.media.AbstractC3581ma.a(r1, r6, r0, r0)     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r6 = r6.cast(r0)     // Catch: java.lang.Throwable -> L6b
            if (r6 != r2) goto L63
            return r2
        L63:
            r0 = r5
        L64:
            com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse r6 = (com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse) r6     // Catch: java.lang.Throwable -> L6b
            r0.f27552b = r6     // Catch: java.lang.Throwable -> L6b
            bn.r r6 = bn.r.f5635a
            return r6
        L6b:
            r6 = move-exception
            bn.d.b(r6)
            boolean r0 = r6 instanceof org.json.JSONException
            if (r0 != 0) goto L7d
            boolean r6 = r6 instanceof java.lang.ClassCastException
            if (r6 == 0) goto L7a
            r6 = 2310(0x906, float:3.237E-42)
            goto L7f
        L7a:
            r6 = 2311(0x907, float:3.238E-42)
            goto L7f
        L7d:
            r6 = 2309(0x905, float:3.236E-42)
        L7f:
            short r6 = (short) r6
            java.lang.Short r6 = jn.a.f(r6)
            java.lang.String r0 = "errorCode"
            kotlin.Pair r6 = bn.h.a(r0, r6)
            kotlin.Pair[] r0 = new kotlin.Pair[r4]
            r1 = 0
            r0[r1] = r6
            java.util.Map r6 = kotlin.collections.a.o(r0)
            com.inmobi.media.Y r0 = new com.inmobi.media.Y
            com.inmobi.ads.InMobiAdRequestStatus r1 = new com.inmobi.ads.InMobiAdRequestStatus
            com.inmobi.ads.InMobiAdRequestStatus$StatusCode r2 = com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR
            r1.<init>(r2)
            com.inmobi.media.Ni r2 = new com.inmobi.media.Ni
            r2.<init>(r6)
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3555l9.a(hn.c):java.lang.Object");
    }

    @Override // com.inmobi.media.Gg
    public final void a() {
        if (this.f27552b == null || this.f27551a.length() == 0) {
            throw new Ig(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new Ni(kotlin.collections.a.o(bn.h.a(IronSourceConstants.EVENTS_ERROR_CODE, (short) 3))));
        }
    }

    @Override // com.inmobi.media.Gg
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InMobiJsonResponse b() {
        Objects.toString(this.f27552b);
        return this.f27552b;
    }
}
