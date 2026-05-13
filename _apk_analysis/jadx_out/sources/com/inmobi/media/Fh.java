package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes6.dex */
public final class Fh extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f25450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C3856xb f25451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Gh f25453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f25454e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f25455f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fh(Gh gh2, long j10, boolean z10, hn.c cVar) {
        super(2, cVar);
        this.f25453d = gh2;
        this.f25454e = j10;
        this.f25455f = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new Fh(this.f25453d, this.f25454e, this.f25455f, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((Fh) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0084, code lost:
    
        if (r2.b(r7, r19) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00af  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Fh.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
