package com.inmobi.media;

/* JADX INFO: loaded from: classes10.dex */
public final class U0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final U0 f26404a = new U0();

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r7 = this;
            java.lang.String r0 = "type"
            boolean r1 = r9 instanceof com.inmobi.media.T0
            if (r1 == 0) goto L15
            r1 = r9
            com.inmobi.media.T0 r1 = (com.inmobi.media.T0) r1
            int r2 = r1.f26342c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f26342c = r2
            goto L1a
        L15:
            com.inmobi.media.T0 r1 = new com.inmobi.media.T0
            r1.<init>(r7, r9)
        L1a:
            java.lang.Object r9 = r1.f26340a
            java.lang.Object r2 = in.a.g()
            int r3 = r1.f26342c
            r4 = 0
            java.lang.String r5 = "errorCode"
            r6 = 1
            if (r3 == 0) goto L36
            if (r3 != r6) goto L2e
            kotlin.c.b(r9)     // Catch: java.lang.Exception -> L87
            goto L5e
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            kotlin.c.b(r9)
            java.lang.Class<com.inmobi.media.ads.network.common.model.AdResponse> r9 = com.inmobi.media.ads.network.common.model.AdResponse.class
            java.lang.String r3 = "clazz"
            tn.p.k(r9, r3)     // Catch: java.lang.Exception -> L87
            tn.p.k(r9, r0)     // Catch: java.lang.Exception -> L87
            r1.f26342c = r6     // Catch: java.lang.Exception -> L87
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L87
            r1.<init>(r8)     // Catch: java.lang.Exception -> L87
            java.lang.String r8 = "jsonObject"
            tn.p.k(r1, r8)     // Catch: java.lang.Exception -> L87
            tn.p.k(r9, r0)     // Catch: java.lang.Exception -> L87
            r8 = 0
            java.lang.Object r8 = com.inmobi.media.AbstractC3581ma.a(r1, r9, r8, r8)     // Catch: java.lang.Exception -> L87
            java.lang.Object r9 = r9.cast(r8)     // Catch: java.lang.Exception -> L87
            if (r9 != r2) goto L5e
            return r2
        L5e:
            com.inmobi.media.ads.network.common.model.AdResponse r9 = (com.inmobi.media.ads.network.common.model.AdResponse) r9     // Catch: java.lang.Exception -> L87
            if (r9 == 0) goto L63
            return r9
        L63:
            r8 = 2232(0x8b8, float:3.128E-42)
            java.lang.Short r8 = jn.a.f(r8)
            kotlin.Pair r8 = bn.h.a(r5, r8)
            kotlin.Pair[] r9 = new kotlin.Pair[r6]
            r9[r4] = r8
            java.util.Map r8 = kotlin.collections.a.o(r9)
            com.inmobi.media.Y r9 = new com.inmobi.media.Y
            com.inmobi.ads.InMobiAdRequestStatus r0 = new com.inmobi.ads.InMobiAdRequestStatus
            com.inmobi.ads.InMobiAdRequestStatus$StatusCode r1 = com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR
            r0.<init>(r1)
            com.inmobi.media.Ni r1 = new com.inmobi.media.Ni
            r1.<init>(r8)
            r9.<init>(r0, r1)
            throw r9
        L87:
            r8 = move-exception
            boolean r9 = r8 instanceof org.json.JSONException
            if (r9 != 0) goto L96
            boolean r9 = r8 instanceof java.lang.ClassCastException
            if (r9 == 0) goto L93
            r9 = 2207(0x89f, float:3.093E-42)
            goto L98
        L93:
            r9 = 2204(0x89c, float:3.088E-42)
            goto L98
        L96:
            r9 = 2113(0x841, float:2.961E-42)
        L98:
            r8.toString()
            short r8 = (short) r9
            java.lang.Short r8 = jn.a.f(r8)
            kotlin.Pair r8 = bn.h.a(r5, r8)
            kotlin.Pair[] r9 = new kotlin.Pair[r6]
            r9[r4] = r8
            java.util.Map r8 = kotlin.collections.a.o(r9)
            com.inmobi.media.Y r9 = new com.inmobi.media.Y
            com.inmobi.ads.InMobiAdRequestStatus r0 = new com.inmobi.ads.InMobiAdRequestStatus
            com.inmobi.ads.InMobiAdRequestStatus$StatusCode r1 = com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR
            r0.<init>(r1)
            com.inmobi.media.Ni r1 = new com.inmobi.media.Ni
            r1.<init>(r8)
            r9.<init>(r0, r1)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.U0.a(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
