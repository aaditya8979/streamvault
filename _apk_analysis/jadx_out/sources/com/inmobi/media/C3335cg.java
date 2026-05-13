package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.cg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3335cg extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3386eg f26931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f26932c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3335cg(C3386eg c3386eg, String str, hn.c cVar) {
        super(2, cVar);
        this.f26931b = c3386eg;
        this.f26932c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3335cg(this.f26931b, this.f26932c, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3335cg(this.f26931b, this.f26932c, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f26930a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            C3386eg c3386eg = this.f26931b;
            String str = this.f26932c;
            this.f26930a = 1;
            if (c3386eg.a(str, this) == objG) {
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
