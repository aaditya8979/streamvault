package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.fj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC3415fj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p000do.l0 f27176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mo.a f27177b;

    public AbstractC3415fj(p000do.l0 l0Var) {
        tn.p.k(l0Var, "coroutineScope");
        this.f27176a = l0Var;
        this.f27177b = mo.g.b(false, 1, null);
    }

    public abstract InterfaceC3338cj a();

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.inmobi.media.Vc r6, com.inmobi.media.InterfaceC3338cj r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.inmobi.media.C3389ej
            if (r0 == 0) goto L13
            r0 = r8
            com.inmobi.media.ej r0 = (com.inmobi.media.C3389ej) r0
            int r1 = r0.f27118f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27118f = r1
            goto L18
        L13:
            com.inmobi.media.ej r0 = new com.inmobi.media.ej
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f27116d
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f27118f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            mo.a r6 = r0.f27115c
            com.inmobi.media.cj r7 = r0.f27114b
            com.inmobi.media.cj r0 = r0.f27113a
            kotlin.c.b(r8)
            r8 = r6
            r6 = r0
            goto L4e
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            kotlin.c.b(r8)
            mo.a r8 = r5.f27177b
            r0.f27113a = r6
            r0.f27114b = r7
            r0.f27115c = r8
            r0.f27118f = r3
            java.lang.Object r0 = r8.c(r4, r0)
            if (r0 != r1) goto L4e
            return r1
        L4e:
            r5.b(r6, r7)     // Catch: java.lang.Throwable -> L57
            bn.r r6 = bn.r.f5635a     // Catch: java.lang.Throwable -> L57
            r8.d(r4)
            return r6
        L57:
            r6 = move-exception
            r8.d(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.AbstractC3415fj.a(com.inmobi.media.Vc, com.inmobi.media.cj, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public abstract void a(InterfaceC3338cj interfaceC3338cj);

    public final void a(InterfaceC3338cj interfaceC3338cj, InterfaceC3338cj interfaceC3338cj2) {
        tn.p.k(interfaceC3338cj, "newState");
        tn.p.k(interfaceC3338cj2, "callerState");
        p000do.i.d(this.f27176a, null, null, new C3364dj(this, interfaceC3338cj, interfaceC3338cj2, null), 3, null);
    }

    public final void b(InterfaceC3338cj interfaceC3338cj, InterfaceC3338cj interfaceC3338cj2) {
        if (tn.p.f(a(), interfaceC3338cj2) && !tn.p.f(a(), interfaceC3338cj)) {
            tn.p.j(getClass().getSimpleName(), "getSimpleName(...)");
            a().getClass();
            interfaceC3338cj.getClass();
            a().c();
            a(interfaceC3338cj);
            a().a();
        }
    }
}
