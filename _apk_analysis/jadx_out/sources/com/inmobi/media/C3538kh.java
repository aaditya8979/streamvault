package com.inmobi.media;

import com.inmobi.adquality.models.AdQualityResult;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.kh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3538kh extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3563lh f27479b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3538kh(C3563lh c3563lh, hn.c cVar) {
        super(2, cVar);
        this.f27479b = c3563lh;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3538kh(this.f27479b, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3538kh(this.f27479b, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f27478a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            H0 h02 = (H0) E0.f25352a.getValue();
            AdQualityResult adQualityResult = this.f27479b.f27574a;
            this.f27478a = 1;
            if (h02.a(adQualityResult, this) == objG) {
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
