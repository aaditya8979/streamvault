package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.u7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3777u7 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f28240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f28241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3852x7 f28242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ N7 f28243d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3777u7(C3852x7 c3852x7, hn.c cVar, N7 n72) {
        super(2, cVar);
        this.f28242c = c3852x7;
        this.f28243d = n72;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        C3777u7 c3777u7 = new C3777u7(this.f28242c, cVar, this.f28243d);
        c3777u7.f28241b = obj;
        return c3777u7;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((C3777u7) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f28240a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            p000do.l0 l0Var = (p000do.l0) this.f28241b;
            C3852x7 c3852x7 = this.f28242c;
            C3752t7 c3752t7 = new C3752t7(l0Var, this.f28243d);
            this.f28240a = 1;
            if (c3852x7.collect(c3752t7, this) == objG) {
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
