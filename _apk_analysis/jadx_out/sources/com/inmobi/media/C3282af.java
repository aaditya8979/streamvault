package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.af, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3282af extends SuspendLambda implements sn.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3334cf f26801b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3282af(C3334cf c3334cf, hn.c cVar) {
        super(1, cVar);
        this.f26801b = c3334cf;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(hn.c cVar) {
        return new C3282af(this.f26801b, cVar);
    }

    @Override // sn.l
    public final Object invoke(Object obj) {
        return new C3282af(this.f26801b, (hn.c) obj).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f26800a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            C3334cf c3334cf = this.f26801b;
            this.f26800a = 1;
            if (c3334cf.b(this) == objG) {
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
