package com.inmobi.media;

import android.view.ViewGroup;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes8.dex */
public final class J1 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ M1 f25679b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J1(M1 m12, hn.c cVar) {
        super(2, cVar);
        this.f25679b = m12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new J1(this.f25679b, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new J1(this.f25679b, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f25678a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            M1 m12 = this.f25679b;
            ViewGroup viewGroup = m12.f25919b;
            p000do.l0 l0Var = m12.f25918a;
            this.f25678a = 1;
            if (M1.a(m12, viewGroup, l0Var, this) == objG) {
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
