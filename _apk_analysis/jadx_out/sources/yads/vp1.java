package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes8.dex */
public final class vp1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f96157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f96158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.monetization.ads.mediation.base.initialize.a f96159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f96160e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vp1(com.monetization.ads.mediation.base.initialize.a aVar, hn.c cVar) {
        super(cVar);
        this.f96159d = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f96158c = obj;
        this.f96160e |= Integer.MIN_VALUE;
        return this.f96159d.a(null, null, this);
    }
}
