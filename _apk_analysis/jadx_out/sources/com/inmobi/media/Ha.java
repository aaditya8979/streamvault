package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes8.dex */
public final class Ha extends SuspendLambda implements sn.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ La f25593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ L2 f25594c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ha(La la2, L2 l22, hn.c cVar) {
        super(1, cVar);
        this.f25593b = la2;
        this.f25594c = l22;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(hn.c cVar) {
        return new Ha(this.f25593b, this.f25594c, cVar);
    }

    @Override // sn.l
    public final Object invoke(Object obj) {
        return new Ha(this.f25593b, this.f25594c, (hn.c) obj).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f25592a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            La la2 = this.f25593b;
            L2 l22 = this.f25594c;
            this.f25592a = 1;
            if (La.a(la2, l22, this) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        this.f25593b.a();
        return bn.r.f5635a;
    }
}
