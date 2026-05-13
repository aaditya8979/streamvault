package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.jj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3515jj extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Cj f27419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3615nj f27421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3813vi f27422d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3515jj(C3615nj c3615nj, C3813vi c3813vi, hn.c cVar) {
        super(2, cVar);
        this.f27421c = c3615nj;
        this.f27422d = c3813vi;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3515jj(this.f27421c, this.f27422d, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3515jj(this.f27421c, this.f27422d, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f27420b;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Cj cj2 = this.f27419a;
            kotlin.c.b(obj);
            return cj2;
        }
        kotlin.c.b(obj);
        Cj cj3 = new Cj(this.f27421c.f27702a);
        C3615nj c3615nj = this.f27421c;
        String str = this.f27422d.f28373a;
        this.f27419a = cj3;
        this.f27420b = 1;
        return C3615nj.a(c3615nj, str, cj3, this) == objG ? objG : cj3;
    }
}
