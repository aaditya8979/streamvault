package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes8.dex */
public final class J4 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f25688b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J4(long j10, hn.c cVar) {
        super(2, cVar);
        this.f25688b = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new J4(this.f25688b, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new J4(this.f25688b, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f25687a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            C4 c42 = (C4) K4.f25793b.getValue();
            int maxAdRecords = K4.c().getContextualData().getMaxAdRecords();
            long j10 = this.f25688b;
            this.f25687a = 1;
            if (c42.a(maxAdRecords, j10, this) == objG) {
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
