package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes8.dex */
public final class Ia extends SuspendLambda implements sn.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ La f25651b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ia(La la2, hn.c cVar) {
        super(1, cVar);
        this.f25651b = la2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(hn.c cVar) {
        return new Ia(this.f25651b, cVar);
    }

    @Override // sn.l
    public final Object invoke(Object obj) {
        return new Ia(this.f25651b, (hn.c) obj).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f25650a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            La la2 = this.f25651b;
            la2.getClass();
            la2.f25864b = new C3552l6("crash", (N9) P9.f26117a.getValue(), la2, la2.f25863a.getEventConfig(), null);
            La la3 = this.f25651b;
            this.f25650a = 1;
            if (La.a(la3, this) == objG) {
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
