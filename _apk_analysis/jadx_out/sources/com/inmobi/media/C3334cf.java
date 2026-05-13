package com.inmobi.media;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;

/* JADX INFO: renamed from: com.inmobi.media.cf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3334cf extends Zf {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final mo.a f26928f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public kotlinx.coroutines.g f26929g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3334cf(C3637og c3637og, C3601n5 c3601n5, Cif cif) {
        super(c3637og, c3601n5, cif);
        tn.p.k(c3637og, "dao");
        tn.p.k(c3601n5, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        tn.p.k(cif, "networkHandler");
        this.f26928f = mo.g.b(false, 1, null);
    }

    @Override // com.inmobi.media.Zf
    public final bn.r b() {
        p000do.i.d(A9.f25147c, null, null, new Ye(this, null), 3, null);
        return bn.r.f5635a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cb, code lost:
    
        if (r14 == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00db A[LOOP:0: B:47:0x00d5->B:49:0x00db, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3334cf.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        if (r12.isCancelled() == false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof com.inmobi.media.Ze
            if (r0 == 0) goto L13
            r0 = r12
            com.inmobi.media.Ze r0 = (com.inmobi.media.Ze) r0
            int r1 = r0.f26709d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26709d = r1
            goto L18
        L13:
            com.inmobi.media.Ze r0 = new com.inmobi.media.Ze
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.f26707b
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f26709d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            mo.a r0 = r0.f26706a
            kotlin.c.b(r12)
            goto L45
        L2c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L34:
            kotlin.c.b(r12)
            mo.a r12 = r11.f26928f
            r0.f26706a = r12
            r0.f26709d = r3
            java.lang.Object r0 = r12.c(r4, r0)
            if (r0 != r1) goto L44
            return r1
        L44:
            r0 = r12
        L45:
            kotlinx.coroutines.g r12 = r11.f26929g     // Catch: java.lang.Throwable -> L95
            if (r12 == 0) goto L63
            tn.p.h(r12)     // Catch: java.lang.Throwable -> L95
            boolean r12 = r12.d()     // Catch: java.lang.Throwable -> L95
            if (r12 == 0) goto L5d
            kotlinx.coroutines.g r12 = r11.f26929g     // Catch: java.lang.Throwable -> L95
            tn.p.h(r12)     // Catch: java.lang.Throwable -> L95
            boolean r12 = r12.isCancelled()     // Catch: java.lang.Throwable -> L95
            if (r12 != 0) goto L63
        L5d:
            bn.r r12 = bn.r.f5635a     // Catch: java.lang.Throwable -> L95
            r0.d(r4)
            return r12
        L63:
            com.inmobi.media.core.config.models.AdConfig$PingsV2Config r12 = com.inmobi.media.Zf.a()     // Catch: java.lang.Throwable -> L95
            com.inmobi.media.core.config.models.AdConfig$PingsV2Config$PingIntervalConfig r12 = r12.getInterval()     // Catch: java.lang.Throwable -> L95
            int r12 = r12.getNormal()     // Catch: java.lang.Throwable -> L95
            long r1 = (long) r12     // Catch: java.lang.Throwable -> L95
            r5 = 0
            int r12 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r12 > 0) goto L7c
            bn.r r12 = bn.r.f5635a     // Catch: java.lang.Throwable -> L95
            r0.d(r4)
            return r12
        L7c:
            do.l0 r5 = com.inmobi.media.A9.f25147c     // Catch: java.lang.Throwable -> L95
            r6 = 0
            r12 = 1000(0x3e8, float:1.401E-42)
            long r8 = (long) r12     // Catch: java.lang.Throwable -> L95
            long r8 = r8 * r1
            com.inmobi.media.af r10 = new com.inmobi.media.af     // Catch: java.lang.Throwable -> L95
            r10.<init>(r11, r4)     // Catch: java.lang.Throwable -> L95
            kotlinx.coroutines.g r12 = com.inmobi.media.F3.a(r5, r6, r8, r10)     // Catch: java.lang.Throwable -> L95
            r11.f26929g = r12     // Catch: java.lang.Throwable -> L95
            bn.r r12 = bn.r.f5635a     // Catch: java.lang.Throwable -> L95
            r0.d(r4)
            return r12
        L95:
            r12 = move-exception
            r0.d(r4)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3334cf.c(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.inmobi.media.C3308bf
            if (r0 == 0) goto L13
            r0 = r6
            com.inmobi.media.bf r0 = (com.inmobi.media.C3308bf) r0
            int r1 = r0.f26870d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26870d = r1
            goto L18
        L13:
            com.inmobi.media.bf r0 = new com.inmobi.media.bf
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f26868b
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f26870d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            mo.a r0 = r0.f26867a
            kotlin.c.b(r6)
            goto L45
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            kotlin.c.b(r6)
            mo.a r6 = r5.f26928f
            r0.f26867a = r6
            r0.f26870d = r3
            java.lang.Object r0 = r6.c(r4, r0)
            if (r0 != r1) goto L44
            return r1
        L44:
            r0 = r6
        L45:
            kotlinx.coroutines.g r6 = r5.f26929g     // Catch: java.lang.Throwable -> L54
            if (r6 == 0) goto L4c
            kotlinx.coroutines.g.a.a(r6, r4, r3, r4)     // Catch: java.lang.Throwable -> L54
        L4c:
            r5.f26929g = r4     // Catch: java.lang.Throwable -> L54
            bn.r r6 = bn.r.f5635a     // Catch: java.lang.Throwable -> L54
            r0.d(r4)
            return r6
        L54:
            r6 = move-exception
            r0.d(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3334cf.d(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
