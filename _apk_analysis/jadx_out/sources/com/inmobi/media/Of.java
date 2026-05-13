package com.inmobi.media;

import android.app.Activity;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes8.dex */
public final class Of extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Pf f26084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Activity f26085c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Of(Pf pf2, Activity activity, hn.c cVar) {
        super(2, cVar);
        this.f26084b = pf2;
        this.f26085c = activity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new Of(this.f26084b, this.f26085c, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new Of(this.f26084b, this.f26085c, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f26083a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            Pf pf2 = this.f26084b;
            Activity activity = this.f26085c;
            this.f26083a = 1;
            if (Pf.a(pf2, activity, this) == objG) {
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
