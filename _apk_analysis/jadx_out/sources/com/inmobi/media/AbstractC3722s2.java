package com.inmobi.media;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.inmobi.media.s2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC3722s2 implements InterfaceC3878y8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p000do.l0 f28085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3868xn f28086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final go.l f28087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mo.a f28088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f28089e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public kotlinx.coroutines.g f28090f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Ee f28091g;

    public AbstractC3722s2(p000do.l0 l0Var, C3793un c3793un, C3868xn c3868xn, go.l lVar) {
        tn.p.k(l0Var, "coroutineScope");
        tn.p.k(c3793un, "viewabilityModel");
        tn.p.k(c3868xn, "viewabilityCriteria");
        tn.p.k(lVar, "lifecycleObserver");
        this.f28085a = l0Var;
        this.f28086b = c3868xn;
        this.f28087c = lVar;
        this.f28088d = mo.g.b(false, 1, null);
        this.f28089e = new AtomicBoolean(false);
        this.f28091g = new Ee(l0Var, c3793un);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.inmobi.media.AbstractC3722s2 r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof com.inmobi.media.C3623o2
            if (r0 == 0) goto L16
            r0 = r6
            com.inmobi.media.o2 r0 = (com.inmobi.media.C3623o2) r0
            int r1 = r0.f27742d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f27742d = r1
            goto L1b
        L16:
            com.inmobi.media.o2 r0 = new com.inmobi.media.o2
            r0.<init>(r5, r6)
        L1b:
            java.lang.Object r6 = r0.f27740b
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f27742d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            mo.a r0 = r0.f27739a
            kotlin.c.b(r6)
            goto L48
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            kotlin.c.b(r6)
            mo.a r6 = r5.f28088d
            r0.f27739a = r6
            r0.f27742d = r3
            java.lang.Object r0 = r6.c(r4, r0)
            if (r0 != r1) goto L47
            return r1
        L47:
            r0 = r6
        L48:
            com.inmobi.media.Bn r6 = r5.c()     // Catch: java.lang.Throwable -> L77
            com.inmobi.media.wg r1 = r6.f25231a     // Catch: java.lang.Throwable -> L77
            java.util.concurrent.atomic.AtomicBoolean r2 = r1.f28447f     // Catch: java.lang.Throwable -> L77
            r2.set(r3)     // Catch: java.lang.Throwable -> L77
            kotlinx.coroutines.g r2 = r1.f28446e     // Catch: java.lang.Throwable -> L77
            com.inmobi.media.H6.a(r2)     // Catch: java.lang.Throwable -> L77
            r1.f28446e = r4     // Catch: java.lang.Throwable -> L77
            com.inmobi.media.Cn r1 = r6.f25234d     // Catch: java.lang.Throwable -> L77
            kotlinx.coroutines.g r1 = r1.f25276a     // Catch: java.lang.Throwable -> L77
            com.inmobi.media.H6.a(r1)     // Catch: java.lang.Throwable -> L77
            com.inmobi.media.Cn r1 = r6.f25234d     // Catch: java.lang.Throwable -> L77
            r1.f25276a = r4     // Catch: java.lang.Throwable -> L77
            kotlinx.coroutines.g r1 = r6.f25235e     // Catch: java.lang.Throwable -> L77
            com.inmobi.media.H6.a(r1)     // Catch: java.lang.Throwable -> L77
            r6.f25235e = r4     // Catch: java.lang.Throwable -> L77
            com.inmobi.media.Ee r5 = r5.f28091g     // Catch: java.lang.Throwable -> L77
            r5.b()     // Catch: java.lang.Throwable -> L77
            bn.r r5 = bn.r.f5635a     // Catch: java.lang.Throwable -> L77
            r0.d(r4)
            return r5
        L77:
            r5 = move-exception
            r0.d(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.AbstractC3722s2.a(com.inmobi.media.s2, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(com.inmobi.media.AbstractC3722s2 r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof com.inmobi.media.C3648p2
            if (r0 == 0) goto L16
            r0 = r6
            com.inmobi.media.p2 r0 = (com.inmobi.media.C3648p2) r0
            int r1 = r0.f27828d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f27828d = r1
            goto L1b
        L16:
            com.inmobi.media.p2 r0 = new com.inmobi.media.p2
            r0.<init>(r5, r6)
        L1b:
            java.lang.Object r6 = r0.f27826b
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f27828d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            mo.a r0 = r0.f27825a
            kotlin.c.b(r6)
            goto L48
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            kotlin.c.b(r6)
            mo.a r6 = r5.f28088d
            r0.f27825a = r6
            r0.f27828d = r3
            java.lang.Object r0 = r6.c(r4, r0)
            if (r0 != r1) goto L47
            return r1
        L47:
            r0 = r6
        L48:
            java.util.concurrent.atomic.AtomicBoolean r6 = r5.f28089e     // Catch: java.lang.Throwable -> L92
            boolean r6 = r6.get()     // Catch: java.lang.Throwable -> L92
            if (r6 == 0) goto L56
            com.inmobi.media.Ee r6 = r5.f28091g     // Catch: java.lang.Throwable -> L92
            r6.a()     // Catch: java.lang.Throwable -> L92
            goto L5b
        L56:
            com.inmobi.media.Ee r6 = r5.f28091g     // Catch: java.lang.Throwable -> L92
            r6.b()     // Catch: java.lang.Throwable -> L92
        L5b:
            java.util.concurrent.atomic.AtomicBoolean r6 = r5.f28089e     // Catch: java.lang.Throwable -> L92
            boolean r6 = r6.get()     // Catch: java.lang.Throwable -> L92
            if (r6 == 0) goto L73
            com.inmobi.media.Bn r5 = r5.c()     // Catch: java.lang.Throwable -> L92
            com.inmobi.media.wg r5 = r5.f25231a     // Catch: java.lang.Throwable -> L92
            java.util.concurrent.atomic.AtomicBoolean r6 = r5.f28447f     // Catch: java.lang.Throwable -> L92
            r1 = 0
            r6.set(r1)     // Catch: java.lang.Throwable -> L92
            r5.a()     // Catch: java.lang.Throwable -> L92
            goto L8c
        L73:
            com.inmobi.media.Bn r5 = r5.c()     // Catch: java.lang.Throwable -> L92
            com.inmobi.media.wg r5 = r5.f25231a     // Catch: java.lang.Throwable -> L92
            go.l r6 = r5.f28443b     // Catch: java.lang.Throwable -> L92
            com.inmobi.media.Mn r1 = com.inmobi.media.Mn.f25977a     // Catch: java.lang.Throwable -> L92
            r6.setValue(r1)     // Catch: java.lang.Throwable -> L92
            java.util.concurrent.atomic.AtomicBoolean r6 = r5.f28447f     // Catch: java.lang.Throwable -> L92
            r6.set(r3)     // Catch: java.lang.Throwable -> L92
            kotlinx.coroutines.g r6 = r5.f28446e     // Catch: java.lang.Throwable -> L92
            com.inmobi.media.H6.a(r6)     // Catch: java.lang.Throwable -> L92
            r5.f28446e = r4     // Catch: java.lang.Throwable -> L92
        L8c:
            bn.r r5 = bn.r.f5635a     // Catch: java.lang.Throwable -> L92
            r0.d(r4)
            return r5
        L92:
            r5 = move-exception
            r0.d(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.AbstractC3722s2.b(com.inmobi.media.s2, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.inmobi.media.InterfaceC3878y8
    public final void a() {
        this.f28089e.set(false);
        this.f28091g.b();
        Bn bnC = c();
        C3836wg c3836wg = bnC.f25231a;
        c3836wg.f28447f.set(true);
        H6.a(c3836wg.f28446e);
        c3836wg.f28446e = null;
        H6.a(bnC.f25234d.f25276a);
        bnC.f25234d.f25276a = null;
        H6.a(bnC.f25235e);
        bnC.f25235e = null;
        H6.a(this.f28090f);
        this.f28090f = null;
    }

    @Override // com.inmobi.media.InterfaceC3878y8
    public final go.d b() {
        if (this.f28090f == null) {
            this.f28090f = p000do.i.d(this.f28085a, null, null, new C3598n2(this.f28087c, null, this), 3, null);
            bn.r rVar = bn.r.f5635a;
        }
        Bn bnC = c();
        if (bnC.f25235e == null) {
            C3836wg c3836wg = bnC.f25231a;
            c3836wg.a();
            bnC.f25235e = p000do.i.d(bnC.f25232b.f25345a, null, null, new C3918zn(c3836wg.f28443b, null, bnC), 3, null);
            bn.r rVar2 = bn.r.f5635a;
        }
        return go.f.F(go.f.H(bnC.f25233c, new C3673q2(this, null)), new C3697r2(this, null));
    }

    public abstract Bn c();
}
