package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes7.dex */
public final class N6 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Yc f25991a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N6(Yc yc2, hn.c cVar) {
        super(2, cVar);
        this.f25991a = yc2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new N6(this.f25991a, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new N6(this.f25991a, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        Yc yc2 = this.f25991a;
        Hc hc2 = yc2.f26069d;
        G g10 = yc2.f28550a.f28473b;
        hc2.onAdFetchSuccessful(new AdMetaInfo(g10.f25492e, g10.f25499l));
        return bn.r.f5635a;
    }
}
