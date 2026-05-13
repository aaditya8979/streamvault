package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: classes11.dex */
public final class ho extends SuspendLambda implements sn.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f27315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3580m9 f27316c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ho(String str, InterfaceC3580m9 interfaceC3580m9, hn.c cVar) {
        super(1, cVar);
        this.f27315b = str;
        this.f27316c = interfaceC3580m9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(hn.c cVar) {
        return new ho(this.f27315b, this.f27316c, cVar);
    }

    @Override // sn.l
    public final Object invoke(Object obj) {
        return new ho(this.f27315b, this.f27316c, (hn.c) obj).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f27314a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            return obj;
        }
        kotlin.c.b(obj);
        jo joVar = jo.f27432a;
        String str = this.f27315b;
        InterfaceC3580m9 interfaceC3580m9 = this.f27316c;
        this.f27314a = 1;
        p000do.p0 p0VarB = p000do.i.b(A9.f25148d, null, CoroutineStart.UNDISPATCHED, new C3420fo(str, interfaceC3580m9, null), 1, null);
        return p0VarB == objG ? objG : p0VarB;
    }
}
