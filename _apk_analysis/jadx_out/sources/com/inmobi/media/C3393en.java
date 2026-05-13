package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.en, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3393en extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3419fn f27125c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3393en(C3419fn c3419fn, hn.c cVar) {
        super(2, cVar);
        this.f27125c = c3419fn;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        C3393en c3393en = new C3393en(this.f27125c, cVar);
        c3393en.f27124b = obj;
        return c3393en;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        C3393en c3393en = new C3393en(this.f27125c, (hn.c) obj2);
        c3393en.f27124b = (p000do.l0) obj;
        return c3393en.invokeSuspend(bn.r.f5635a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035 A[PHI: r0 r1 r8
      0x0035: PHI (r0v5 java.lang.Object) = (r0v4 java.lang.Object), (r0v0 java.lang.Object) binds: [B:25:0x0060, B:15:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x0035: PHI (r1v6 do.l0) = (r1v5 do.l0), (r1v8 do.l0) binds: [B:25:0x0060, B:15:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x0035: PHI (r8v5 com.inmobi.media.en) = (r8v4 com.inmobi.media.en), (r8v8 com.inmobi.media.en) binds: [B:25:0x0060, B:15:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0060 -> B:16:0x0035). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = in.a.g()
            int r1 = r7.f27123a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            java.lang.Object r1 = r7.f27124b
            do.l0 r1 = (p000do.l0) r1
            kotlin.c.b(r8)
            goto L34
        L16:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1e:
            java.lang.Object r1 = r7.f27124b
            do.l0 r1 = (p000do.l0) r1
            kotlin.c.b(r8)     // Catch: java.lang.IllegalStateException -> L27
            r8 = r7
            goto L54
        L27:
            r8 = move-exception
            r4 = r1
            r1 = r0
            r0 = r7
            goto L4e
        L2c:
            kotlin.c.b(r8)
            java.lang.Object r8 = r7.f27124b
            r1 = r8
            do.l0 r1 = (p000do.l0) r1
        L34:
            r8 = r7
        L35:
            boolean r4 = kotlinx.coroutines.d.h(r1)
            if (r4 == 0) goto L63
            com.inmobi.media.fn r4 = r8.f27125c     // Catch: java.lang.IllegalStateException -> L48
            r8.f27124b = r1     // Catch: java.lang.IllegalStateException -> L48
            r8.f27123a = r3     // Catch: java.lang.IllegalStateException -> L48
            java.lang.Object r4 = com.inmobi.media.C3419fn.a(r4, r8)     // Catch: java.lang.IllegalStateException -> L48
            if (r4 != r0) goto L54
            goto L62
        L48:
            r4 = move-exception
            r6 = r0
            r0 = r8
            r8 = r4
            r4 = r1
            r1 = r6
        L4e:
            r8.toString()
            r8 = r0
            r0 = r1
            r1 = r4
        L54:
            com.inmobi.media.fn r4 = r8.f27125c
            long r4 = r4.f27188c
            r8.f27124b = r1
            r8.f27123a = r2
            java.lang.Object r4 = p000do.s0.a(r4, r8)
            if (r4 != r0) goto L35
        L62:
            return r0
        L63:
            bn.r r8 = bn.r.f5635a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3393en.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
