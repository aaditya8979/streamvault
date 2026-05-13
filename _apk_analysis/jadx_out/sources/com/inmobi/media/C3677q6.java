package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.q6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3677q6 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3776u6 f27939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f27940c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3677q6(C3776u6 c3776u6, long j10, hn.c cVar) {
        super(2, cVar);
        this.f27939b = c3776u6;
        this.f27940c = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3677q6(this.f27939b, this.f27940c, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3677q6(this.f27939b, this.f27940c, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f27938a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            go.k kVar = this.f27939b.f28230c;
            Pl pl2 = new Pl(this.f27940c);
            this.f27938a = 1;
            if (kVar.emit(pl2, this) == objG) {
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
