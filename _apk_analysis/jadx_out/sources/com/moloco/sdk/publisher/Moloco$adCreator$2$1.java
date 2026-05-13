package com.moloco.sdk.publisher;

import bn.r;
import com.moloco.sdk.internal.publisher.v;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes5.dex */
@jn.d(c = "com.moloco.sdk.publisher.Moloco$adCreator$2$1", f = "Moloco.kt", l = {513}, m = "invokeSuspend")
public final class Moloco$adCreator$2$1 extends SuspendLambda implements sn.l<hn.c<? super com.moloco.sdk.internal.e>, Object> {
    public int label;

    public Moloco$adCreator$2$1(hn.c<? super Moloco$adCreator$2$1> cVar) {
        super(1, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c<r> create(hn.c<?> cVar) {
        return new Moloco$adCreator$2$1(cVar);
    }

    @Override // sn.l
    public final Object invoke(hn.c<? super com.moloco.sdk.internal.e> cVar) {
        return ((Moloco$adCreator$2$1) create(cVar)).invokeSuspend(r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.c.b(obj);
            v initializationHandler = Moloco.INSTANCE.getInitializationHandler();
            this.label = 1;
            obj = initializationHandler.d(this);
            if (obj == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        return obj;
    }
}
