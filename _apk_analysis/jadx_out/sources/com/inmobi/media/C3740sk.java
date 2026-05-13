package com.inmobi.media;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.sk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3740sk extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f28145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f28146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sn.a f28147c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3740sk(long j10, sn.a aVar, hn.c cVar) {
        super(2, cVar);
        this.f28146b = j10;
        this.f28147c = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3740sk(this.f28146b, this.f28147c, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3740sk(this.f28146b, this.f28147c, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f28145a;
        try {
            if (i10 == 0) {
                kotlin.c.b(obj);
                long j10 = this.f28146b;
                this.f28145a = 1;
                if (p000do.s0.a(j10, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            this.f28147c.invoke();
        } catch (CancellationException unused) {
        }
        return bn.r.f5635a;
    }
}
