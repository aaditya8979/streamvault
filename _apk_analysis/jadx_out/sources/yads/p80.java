package yads;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes12.dex */
public final class p80 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public mo.a f93481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q80 f93482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q80 f93483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f93484e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f93485f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q80 f93486g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f93487h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p80(q80 q80Var, boolean z10, hn.c cVar) {
        super(2, cVar);
        this.f93486g = q80Var;
        this.f93487h = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new p80(this.f93486g, this.f93487h, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new p80(this.f93486g, this.f93487h, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            java.lang.Object r0 = in.a.g()
            int r1 = r7.f93485f
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L35
            if (r1 == r3) goto L2a
            if (r1 != r2) goto L22
            yads.q80 r0 = r7.f93483d
            yads.q80 r1 = r7.f93482c
            mo.a r2 = r7.f93481b
            kotlin.c.b(r8)     // Catch: java.lang.Throwable -> L1f
            kotlin.Result r8 = (kotlin.Result) r8     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r8 = r8.m7542unboximpl()     // Catch: java.lang.Throwable -> L1f
            goto L6e
        L1f:
            r8 = move-exception
            goto L8c
        L22:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L2a:
            boolean r1 = r7.f93484e
            yads.q80 r3 = r7.f93482c
            mo.a r5 = r7.f93481b
            kotlin.c.b(r8)
            r8 = r3
            goto L50
        L35:
            kotlin.c.b(r8)
            yads.q80 r8 = r7.f93486g
            mo.a r1 = r8.f93953f
            boolean r5 = r7.f93487h
            r7.f93481b = r1
            r7.f93482c = r8
            r7.f93484e = r5
            r7.f93485f = r3
            java.lang.Object r3 = r1.c(r4, r7)
            if (r3 != r0) goto L4d
            return r0
        L4d:
            r6 = r5
            r5 = r1
            r1 = r6
        L50:
            yads.j80 r3 = r8.f93952e     // Catch: java.lang.Throwable -> L8e
            if (r3 == 0) goto L59
            if (r1 == 0) goto L57
            goto L59
        L57:
            r2 = r5
            goto L7a
        L59:
            yads.cn2 r1 = r8.f93949b     // Catch: java.lang.Throwable -> L8e
            r7.f93481b = r5     // Catch: java.lang.Throwable -> L8e
            r7.f93482c = r8     // Catch: java.lang.Throwable -> L8e
            r7.f93483d = r8     // Catch: java.lang.Throwable -> L8e
            r7.f93485f = r2     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r1 = r1.a(r7)     // Catch: java.lang.Throwable -> L8e
            if (r1 != r0) goto L6a
            return r0
        L6a:
            r0 = r8
            r2 = r5
            r8 = r1
            r1 = r0
        L6e:
            boolean r3 = kotlin.Result.m7539isFailureimpl(r8)     // Catch: java.lang.Throwable -> L1f
            if (r3 == 0) goto L75
            r8 = r4
        L75:
            yads.j80 r8 = (yads.j80) r8     // Catch: java.lang.Throwable -> L1f
            r0.f93952e = r8     // Catch: java.lang.Throwable -> L1f
            r8 = r1
        L7a:
            yads.pg1 r0 = r8.f93948a     // Catch: java.lang.Throwable -> L1f
            yads.b80 r0 = r0.a()     // Catch: java.lang.Throwable -> L1f
            yads.v50 r1 = r8.f93950c     // Catch: java.lang.Throwable -> L1f
            yads.j80 r8 = r8.f93952e     // Catch: java.lang.Throwable -> L1f
            yads.u50 r8 = r1.a(r0, r8)     // Catch: java.lang.Throwable -> L1f
            r2.d(r4)
            return r8
        L8c:
            r5 = r2
            goto L8f
        L8e:
            r8 = move-exception
        L8f:
            r5.d(r4)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.p80.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
