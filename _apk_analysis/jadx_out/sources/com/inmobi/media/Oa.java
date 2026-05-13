package com.inmobi.media;

import java.util.LinkedHashMap;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes8.dex */
public final class Oa extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f26076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Na f26077b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oa(LinkedHashMap linkedHashMap, Na na2, hn.c cVar) {
        super(2, cVar);
        this.f26076a = linkedHashMap;
        this.f26077b = na2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new Oa(this.f26076a, this.f26077b, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new Oa(this.f26076a, this.f26077b, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        this.f26076a.put("networkType", C3850x5.m());
        String str = this.f26077b.f26028a;
        LinkedHashMap linkedHashMap = this.f26076a;
        Wj wj2 = Wj.f26549a;
        Wj.b(str, linkedHashMap, EnumC3287ak.f26805a);
        return bn.r.f5635a;
    }
}
