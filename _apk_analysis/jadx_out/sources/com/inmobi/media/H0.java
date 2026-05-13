package com.inmobi.media;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes7.dex */
public final class H0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3431g9 f25562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f25563b;

    public H0(C3431g9 c3431g9) {
        tn.p.k(c3431g9, "databaseHelper");
        this.f25562a = c3431g9;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.inmobi.adquality.models.AdQualityResult r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.inmobi.media.G0
            if (r0 == 0) goto L13
            r0 = r8
            com.inmobi.media.G0 r0 = (com.inmobi.media.G0) r0
            int r1 = r0.f25504c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25504c = r1
            goto L18
        L13:
            com.inmobi.media.G0 r0 = new com.inmobi.media.G0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f25502a
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f25504c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.c.b(r8)
            goto L74
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            kotlin.c.b(r8)
            com.inmobi.media.g9 r8 = r6.f25562a
            java.lang.String r2 = "<this>"
            tn.p.k(r7, r2)
            android.content.ContentValues r2 = new android.content.ContentValues
            r2.<init>()
            java.lang.String r4 = r7.getImageLocation()
            java.lang.String r5 = "image_location"
            r2.put(r5, r4)
            java.lang.String r4 = r7.getSdkModelResult()
            if (r4 != 0) goto L51
            java.lang.String r4 = ""
        L51:
            java.lang.String r5 = "sdk_model_result"
            r2.put(r5, r4)
            java.lang.String r4 = r7.getBeaconUrl()
            java.lang.String r5 = "beacon_url"
            r2.put(r5, r4)
            java.lang.String r7 = r7.getExtras()
            java.lang.String r4 = "extras"
            r2.put(r4, r7)
            r0.f25504c = r3
            r7 = 4
            java.lang.String r3 = "ad_quality_db"
            java.lang.Object r7 = r8.a(r3, r2, r7, r0)
            if (r7 != r1) goto L74
            return r1
        L74:
            java.lang.ref.WeakReference r7 = r6.f25563b
            if (r7 == 0) goto L97
            java.lang.Object r7 = r7.get()
            com.inmobi.media.z0 r7 = (com.inmobi.media.C3895z0) r7
            if (r7 == 0) goto L97
            com.inmobi.media.A0 r8 = r7.f28615a
            java.util.concurrent.atomic.AtomicBoolean r8 = r8.f25126b
            boolean r8 = r8.get()
            if (r8 == 0) goto L97
            com.inmobi.media.A0 r8 = r7.f28615a
            java.util.concurrent.atomic.AtomicBoolean r8 = r8.f25126b
            r0 = 0
            r8.set(r0)
            com.inmobi.media.A0 r7 = r7.f28615a
            r7.a()
        L97:
            bn.r r7 = bn.r.f5635a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.H0.a(com.inmobi.adquality.models.AdQualityResult, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.inmobi.media.F0
            if (r0 == 0) goto L13
            r0 = r8
            com.inmobi.media.F0 r0 = (com.inmobi.media.F0) r0
            int r1 = r0.f25413c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25413c = r1
            goto L18
        L13:
            com.inmobi.media.F0 r0 = new com.inmobi.media.F0
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f25411a
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f25413c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.c.b(r8)
            goto L4a
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L31:
            kotlin.c.b(r8)
            com.inmobi.media.g9 r8 = r7.f25562a
            r0.f25413c = r3
            r8.getClass()
            com.inmobi.media.c9 r2 = new com.inmobi.media.c9
            r3 = 0
            java.lang.String r4 = "SELECT * FROM ad_quality_db"
            r2.<init>(r8, r4, r3)
            java.lang.Object r8 = r8.a(r2, r0)
            if (r8 != r1) goto L4a
            return r1
        L4a:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = cn.x.x(r8, r1)
            r0.<init>(r1)
            java.util.Iterator r8 = r8.iterator()
        L5b:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L95
            java.lang.Object r1 = r8.next()
            android.content.ContentValues r1 = (android.content.ContentValues) r1
            java.lang.String r2 = "<this>"
            tn.p.k(r1, r2)
            com.inmobi.adquality.models.AdQualityResult r2 = new com.inmobi.adquality.models.AdQualityResult
            java.lang.String r3 = "image_location"
            java.lang.String r3 = r1.getAsString(r3)
            java.lang.String r4 = "getAsString(...)"
            tn.p.j(r3, r4)
            java.lang.String r5 = "sdk_model_result"
            java.lang.String r5 = r1.getAsString(r5)
            java.lang.String r6 = "beacon_url"
            java.lang.String r6 = r1.getAsString(r6)
            tn.p.j(r6, r4)
            java.lang.String r4 = "extras"
            java.lang.String r1 = r1.getAsString(r4)
            r2.<init>(r3, r5, r6, r1)
            r0.add(r2)
            goto L5b
        L95:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.H0.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
