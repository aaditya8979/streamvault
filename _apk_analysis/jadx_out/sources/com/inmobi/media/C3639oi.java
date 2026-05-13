package com.inmobi.media;

import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.oi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3639oi extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC3713ri f27798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f27799b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3639oi(AbstractC3713ri abstractC3713ri, Map map, hn.c cVar) {
        super(2, cVar);
        this.f27798a = abstractC3713ri;
        this.f27799b = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3639oi(this.f27798a, this.f27799b, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3639oi(this.f27798a, this.f27799b, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        this.f27798a.f28066d.onAdClicked(this.f27799b);
        return bn.r.f5635a;
    }
}
