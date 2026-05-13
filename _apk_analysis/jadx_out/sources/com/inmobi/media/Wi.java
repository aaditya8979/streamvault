package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes9.dex */
public final class Wi extends SuspendLambda implements sn.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26548a;

    public Wi(hn.c cVar) {
        super(1, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(hn.c cVar) {
        return new Wi(cVar);
    }

    @Override // sn.l
    public final Object invoke(Object obj) {
        return new Wi((hn.c) obj).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f26548a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            tn.p.j(Yi.f26653b, "access$getTAG$p(...)");
            Qi qi2 = Qi.f26188a;
            boolean zIsSessionEnabled = Yi.a().isSessionEnabled();
            qi2.getClass();
            Qi.f26192e = zIsSessionEnabled;
            if (!zIsSessionEnabled) {
                Qi.f26191d = null;
            }
            Qi.c();
            if (Ji.b() == null || Yi.a().isLocationEnabled()) {
                C3582mb c3582mb = C3582mb.f27616a;
                this.f26548a = 1;
                if (c3582mb.a(this) == objG) {
                    return objG;
                }
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
