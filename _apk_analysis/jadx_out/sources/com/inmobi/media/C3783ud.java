package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.ud, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3783ud extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f28256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f28257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3858xd f28258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Dd f28259d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3783ud(C3858xd c3858xd, hn.c cVar, Dd dd2) {
        super(2, cVar);
        this.f28258c = c3858xd;
        this.f28259d = dd2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        C3783ud c3783ud = new C3783ud(this.f28258c, cVar, this.f28259d);
        c3783ud.f28257b = obj;
        return c3783ud;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((C3783ud) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f28256a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            p000do.l0 l0Var = (p000do.l0) this.f28257b;
            C3858xd c3858xd = this.f28258c;
            C3758td c3758td = new C3758td(l0Var, this.f28259d);
            this.f28256a = 1;
            if (c3858xd.collect(c3758td, this) == objG) {
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
