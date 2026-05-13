package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes7.dex */
public final class N4 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ go.u f25985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ M1 f25986c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N4(go.u uVar, M1 m12, hn.c cVar) {
        super(2, cVar);
        this.f25985b = uVar;
        this.f25986c = m12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new N4(this.f25985b, this.f25986c, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new N4(this.f25985b, this.f25986c, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f25984a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            go.u uVar = this.f25985b;
            M1 m12 = this.f25986c;
            this.f25984a = 1;
            if (uVar.collect(m12, this) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        return bn.r.f5635a;
    }
}
