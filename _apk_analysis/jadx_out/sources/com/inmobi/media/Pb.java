package com.inmobi.media;

import java.util.Iterator;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes9.dex */
public final class Pb extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C3856xb f26121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f26122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3856xb f26124d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f26125e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f26126f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pb(C3856xb c3856xb, long j10, int i10, hn.c cVar) {
        super(2, cVar);
        this.f26124d = c3856xb;
        this.f26125e = j10;
        this.f26126f = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new Pb(this.f26124d, this.f26125e, this.f26126f, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((Pb) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0043 A[Catch: all -> 0x0065, TRY_LEAVE, TryCatch #0 {all -> 0x0065, blocks: (B:7:0x0013, B:18:0x003d, B:20:0x0043, B:11:0x001f, B:17:0x0035, B:14:0x0026), top: B:28:0x0009 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = in.a.g()
            int r1 = r7.f26123c
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L23
            if (r1 == r4) goto L1f
            if (r1 != r3) goto L17
            java.util.Iterator r1 = r7.f26122b
            com.inmobi.media.xb r4 = r7.f26121a
            kotlin.c.b(r8)     // Catch: java.lang.Throwable -> L65
            goto L3d
        L17:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1f:
            kotlin.c.b(r8)     // Catch: java.lang.Throwable -> L65
            goto L35
        L23:
            kotlin.c.b(r8)
            com.inmobi.media.xb r8 = r7.f26124d     // Catch: java.lang.Throwable -> L65
            long r5 = r7.f26125e     // Catch: java.lang.Throwable -> L65
            int r1 = r7.f26126f     // Catch: java.lang.Throwable -> L65
            r7.f26123c = r4     // Catch: java.lang.Throwable -> L65
            java.lang.Object r8 = r8.a(r5, r1, r7)     // Catch: java.lang.Throwable -> L65
            if (r8 != r0) goto L35
            goto L5c
        L35:
            java.util.List r8 = (java.util.List) r8     // Catch: java.lang.Throwable -> L65
            com.inmobi.media.xb r4 = r7.f26124d     // Catch: java.lang.Throwable -> L65
            java.util.Iterator r1 = r8.iterator()     // Catch: java.lang.Throwable -> L65
        L3d:
            boolean r8 = r1.hasNext()     // Catch: java.lang.Throwable -> L65
            if (r8 == 0) goto L5d
            java.lang.Object r8 = r1.next()     // Catch: java.lang.Throwable -> L65
            com.inmobi.media.qb r8 = (com.inmobi.media.C3682qb) r8     // Catch: java.lang.Throwable -> L65
            java.lang.String r5 = r8.f27957a     // Catch: java.lang.Throwable -> L65
            com.inmobi.media.Tb.a(r5)     // Catch: java.lang.Throwable -> L65
            java.lang.String r8 = r8.f27957a     // Catch: java.lang.Throwable -> L65
            r7.f26121a = r4     // Catch: java.lang.Throwable -> L65
            r7.f26122b = r1     // Catch: java.lang.Throwable -> L65
            r7.f26123c = r3     // Catch: java.lang.Throwable -> L65
            java.lang.Object r8 = r4.a(r8, r7)     // Catch: java.lang.Throwable -> L65
            if (r8 != r0) goto L3d
        L5c:
            return r0
        L5d:
            java.util.concurrent.atomic.AtomicBoolean r8 = com.inmobi.media.Sb.f26294c
            r8.set(r2)
            bn.r r8 = bn.r.f5635a
            return r8
        L65:
            r8 = move-exception
            java.util.concurrent.atomic.AtomicBoolean r0 = com.inmobi.media.Sb.f26294c
            r0.set(r2)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Pb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
