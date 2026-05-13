package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes7.dex */
public final class H1 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I1 f25564a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H1(I1 i12, hn.c cVar) {
        super(2, cVar);
        this.f25564a = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new H1(this.f25564a, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new H1(this.f25564a, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3, types: [bn.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        I1 i12;
        in.a.g();
        kotlin.c.b(obj);
        boolean z10 = 0;
        z10 = 0;
        try {
            try {
                I1 i13 = this.f25564a;
                i13.f25632c = i13.f25630a.invoke();
                i12 = this.f25564a;
            } catch (Exception e10) {
                e10.getMessage();
                i12 = this.f25564a;
            }
            i12.f25633d.set(false);
            z10 = bn.r.f5635a;
            return z10;
        } catch (Throwable th2) {
            this.f25564a.f25633d.set(z10);
            throw th2;
        }
    }
}
