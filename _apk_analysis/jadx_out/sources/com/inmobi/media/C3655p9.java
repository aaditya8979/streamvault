package com.inmobi.media;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.lang.ref.WeakReference;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.p9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3655p9 extends SuspendLambda implements sn.l {
    public C3655p9(hn.c cVar) {
        super(1, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(hn.c cVar) {
        return new C3655p9(cVar);
    }

    @Override // sn.l
    public final Object invoke(Object obj) {
        return new C3655p9((hn.c) obj).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        C3856xb c3856xb = (C3856xb) AbstractC3881yb.f28577a.getValue();
        C3630o9 c3630o9 = AbstractC3680q9.f27955c;
        c3856xb.getClass();
        tn.p.k(c3630o9, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        c3856xb.f28512b = new WeakReference(c3630o9);
        return bn.r.f5635a;
    }
}
