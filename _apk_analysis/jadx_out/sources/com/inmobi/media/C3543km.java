package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.km, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3543km extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3643om f27498c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3543km(C3643om c3643om, hn.c cVar) {
        super(2, cVar);
        this.f27498c = c3643om;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        C3543km c3543km = new C3543km(this.f27498c, cVar);
        c3543km.f27497b = obj;
        return c3543km;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        C3543km c3543km = new C3543km(this.f27498c, (hn.c) obj2);
        c3543km.f27497b = (Rl) obj;
        return c3543km.invokeSuspend(bn.r.f5635a);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00d6  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3543km.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
