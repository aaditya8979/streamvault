package p000do;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.d;
import sn.p;

/* JADX INFO: compiled from: Builders.kt */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class h {
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> T a(@org.jetbrains.annotations.NotNull kotlin.coroutines.d r4, @org.jetbrains.annotations.NotNull sn.p<? super p000do.l0, ? super hn.c<? super T>, ? extends java.lang.Object> r5) throws java.lang.InterruptedException {
        /*
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            kotlin.coroutines.c$b r1 = kotlin.coroutines.c.G8
            kotlin.coroutines.d$b r1 = r4.get(r1)
            kotlin.coroutines.c r1 = (kotlin.coroutines.c) r1
            if (r1 != 0) goto L1f
            do.m2 r1 = p000do.m2.f59866a
            do.c1 r1 = r1.b()
            do.m1 r2 = p000do.m1.f59865b
            kotlin.coroutines.d r4 = r4.plus(r1)
            kotlin.coroutines.d r4 = p000do.f0.j(r2, r4)
            goto L42
        L1f:
            boolean r2 = r1 instanceof p000do.c1
            r3 = 0
            if (r2 == 0) goto L27
            do.c1 r1 = (p000do.c1) r1
            goto L28
        L27:
            r1 = r3
        L28:
            if (r1 == 0) goto L36
            boolean r2 = r1.W()
            if (r2 == 0) goto L31
            r3 = r1
        L31:
            if (r3 != 0) goto L34
            goto L36
        L34:
            r1 = r3
            goto L3c
        L36:
            do.m2 r1 = p000do.m2.f59866a
            do.c1 r1 = r1.a()
        L3c:
            do.m1 r2 = p000do.m1.f59865b
            kotlin.coroutines.d r4 = p000do.f0.j(r2, r4)
        L42:
            do.e r2 = new do.e
            r2.<init>(r4, r0, r1)
            kotlinx.coroutines.CoroutineStart r4 = kotlinx.coroutines.CoroutineStart.DEFAULT
            r2.i1(r4, r2, r5)
            java.lang.Object r4 = r2.j1()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000do.h.a(kotlin.coroutines.d, sn.p):java.lang.Object");
    }

    public static /* synthetic */ Object b(d dVar, p pVar, int i10, Object obj) throws InterruptedException {
        if ((i10 & 1) != 0) {
            dVar = EmptyCoroutineContext.INSTANCE;
        }
        return g.e(dVar, pVar);
    }
}
