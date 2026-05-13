package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.tg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3761tg extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f28188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3836wg f28189b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3761tg(C3836wg c3836wg, hn.c cVar) {
        super(2, cVar);
        this.f28189b = c3836wg;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3761tg(this.f28189b, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3761tg(this.f28189b, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f28188a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            C3836wg c3836wg = this.f28189b;
            this.f28188a = 1;
            if (C3836wg.a(c3836wg, this) == objG) {
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
