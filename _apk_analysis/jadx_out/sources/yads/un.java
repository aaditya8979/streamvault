package yads;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes2.dex */
public final class un extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d4 f95723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f95724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f95725d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zn f95726e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ra3 f95727f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hp f95728g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public un(zn znVar, ra3 ra3Var, hp hpVar, hn.c cVar) {
        super(2, cVar);
        this.f95726e = znVar;
        this.f95727f = ra3Var;
        this.f95728g = hpVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        un unVar = new un(this.f95726e, this.f95727f, this.f95728g, cVar);
        unVar.f95725d = obj;
        return unVar;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((un) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = in.a.g()
            int r1 = r11.f95724c
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L29
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L17
            java.lang.Object r0 = r11.f95725d
            yads.d4 r0 = (yads.d4) r0
            kotlin.c.b(r12)
            goto L7b
        L17:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1f:
            yads.d4 r1 = r11.f95723b
            java.lang.Object r3 = r11.f95725d
            do.p0 r3 = (p000do.p0) r3
            kotlin.c.b(r12)
            goto L64
        L29:
            kotlin.c.b(r12)
            java.lang.Object r12 = r11.f95725d
            do.l0 r12 = (p000do.l0) r12
            yads.tn r8 = new yads.tn
            yads.zn r1 = r11.f95726e
            yads.hp r5 = r11.f95728g
            r8.<init>(r1, r5, r4)
            r6 = 0
            r7 = 0
            r9 = 3
            r10 = 0
            r5 = r12
            do.p0 r1 = p000do.g.b(r5, r6, r7, r8, r9, r10)
            yads.sn r8 = new yads.sn
            yads.zn r5 = r11.f95726e
            yads.hp r6 = r11.f95728g
            r8.<init>(r5, r6, r4)
            r6 = 0
            r5 = r12
            do.p0 r12 = p000do.g.b(r5, r6, r7, r8, r9, r10)
            yads.zn r5 = r11.f95726e
            yads.d4 r5 = r5.f97678c
            r11.f95725d = r1
            r11.f95723b = r5
            r11.f95724c = r3
            java.lang.Object r12 = r12.N(r11)
            if (r12 != r0) goto L62
            return r0
        L62:
            r3 = r1
            r1 = r5
        L64:
            java.lang.String r12 = (java.lang.String) r12
            r1.f88747h = r12
            yads.zn r12 = r11.f95726e
            yads.d4 r12 = r12.f97678c
            r11.f95725d = r12
            r11.f95723b = r4
            r11.f95724c = r2
            java.lang.Object r1 = r3.N(r11)
            if (r1 != r0) goto L79
            return r0
        L79:
            r0 = r12
            r12 = r1
        L7b:
            java.lang.String r12 = (java.lang.String) r12
            r0.f88748i = r12
            yads.zn r12 = r11.f95726e
            yads.w5 r12 = r12.f97677b
            yads.v5 r0 = yads.v5.f95928g
            r12.a(r0)
            yads.zn r12 = r11.f95726e
            yads.ra3 r0 = r11.f95727f
            monitor-enter(r12)
            do.l0 r5 = r12.f97680e     // Catch: java.lang.Throwable -> L9f
            r6 = 0
            r7 = 0
            yads.qn r8 = new yads.qn     // Catch: java.lang.Throwable -> L9f
            r8.<init>(r12, r0, r4)     // Catch: java.lang.Throwable -> L9f
            r9 = 3
            r10 = 0
            p000do.g.d(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L9f
            monitor-exit(r12)
            bn.r r12 = bn.r.f5635a
            return r12
        L9f:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.un.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
