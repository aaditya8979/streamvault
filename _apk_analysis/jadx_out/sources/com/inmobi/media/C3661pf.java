package com.inmobi.media;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.inmobi.media.pf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3661pf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3661pf f27874a = new C3661pf();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicInteger f27875b = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static C3735sf f27876c;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.content.Context r6, com.inmobi.media.core.config.models.AdConfig.OmidConfig r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.inmobi.media.C3636of
            if (r0 == 0) goto L13
            r0 = r8
            com.inmobi.media.of r0 = (com.inmobi.media.C3636of) r0
            int r1 = r0.f27792c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27792c = r1
            goto L18
        L13:
            com.inmobi.media.of r0 = new com.inmobi.media.of
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f27790a
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f27792c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.c.b(r8)
            goto L61
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            kotlin.c.b(r8)
            java.util.concurrent.atomic.AtomicInteger r8 = com.inmobi.media.C3661pf.f27875b
            int r2 = r8.get()
            if (r2 == r3) goto L6b
            int r8 = r8.get()
            r2 = 2
            if (r8 == r2) goto L6b
            com.inmobi.media.sf r8 = com.inmobi.media.C3661pf.f27876c
            if (r8 != 0) goto L4e
            com.inmobi.media.sf r8 = new com.inmobi.media.sf
            r8.<init>(r6)
            com.inmobi.media.C3661pf.f27876c = r8
        L4e:
            r0.f27792c = r3
            do.h0 r6 = p000do.w0.b()
            com.inmobi.media.qf r2 = new com.inmobi.media.qf
            r4 = 0
            r2.<init>(r8, r7, r4)
            java.lang.Object r8 = p000do.g.g(r6, r2, r0)
            if (r8 != r1) goto L61
            return r1
        L61:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r6 = r8.booleanValue()
            if (r6 != 0) goto L6a
            goto L6b
        L6a:
            r3 = 0
        L6b:
            java.lang.Boolean r6 = jn.a.a(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3661pf.a(android.content.Context, com.inmobi.media.core.config.models.AdConfig$OmidConfig, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.inmobi.media.C3561lf
            if (r0 == 0) goto L13
            r0 = r11
            com.inmobi.media.lf r0 = (com.inmobi.media.C3561lf) r0
            int r1 = r0.f27570e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27570e = r1
            goto L18
        L13:
            com.inmobi.media.lf r0 = new com.inmobi.media.lf
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f27568c
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f27570e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            android.content.Context r1 = r0.f27567b
            com.inmobi.media.core.config.models.AdConfig$OmidConfig r0 = r0.f27566a
            kotlin.c.b(r11)
            goto L69
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L35:
            kotlin.c.b(r11)
            com.inmobi.media.i4 r11 = com.inmobi.media.Y3.f26611a
            java.lang.Class<com.inmobi.media.core.config.models.AdConfig> r11 = com.inmobi.media.core.config.models.AdConfig.class
            java.lang.String r2 = "clazz"
            tn.p.k(r11, r2)
            com.inmobi.media.i4 r2 = com.inmobi.media.Y3.f26611a
            com.inmobi.media.core.config.models.Config r11 = r2.a(r11)
            com.inmobi.media.core.config.models.AdConfig r11 = (com.inmobi.media.core.config.models.AdConfig) r11
            com.inmobi.media.core.config.models.AdConfig$ViewabilityConfig r11 = r11.getViewability()
            com.inmobi.media.core.config.models.AdConfig$OmidConfig r11 = r11.getOmidConfig()
            android.content.Context r2 = com.inmobi.media.Ji.f25747a
            if (r2 != 0) goto L58
            bn.r r11 = bn.r.f5635a
            return r11
        L58:
            r0.f27566a = r11
            r0.f27567b = r2
            r0.f27570e = r3
            java.lang.Object r0 = r10.a(r2, r11, r0)
            if (r0 != r1) goto L65
            return r1
        L65:
            r1 = r2
            r9 = r0
            r0 = r11
            r11 = r9
        L69:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L74
            bn.r r11 = bn.r.f5635a
            return r11
        L74:
            java.util.concurrent.atomic.AtomicInteger r11 = com.inmobi.media.C3661pf.f27875b
            r2 = 2
            r11.set(r2)
            do.l0 r3 = com.inmobi.media.A9.f25147c
            com.inmobi.media.mf r6 = new com.inmobi.media.mf
            r11 = 0
            r6.<init>(r0, r1, r11)
            r4 = 0
            r5 = 0
            r7 = 3
            r8 = 0
            p000do.g.d(r3, r4, r5, r6, r7, r8)
            bn.r r11 = bn.r.f5635a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3661pf.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
