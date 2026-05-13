package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes12.dex */
public final class yi0 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w5 f97149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v5 f97150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f97151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cj0 f97152e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f97153f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yi0(cj0 cj0Var, hn.c cVar) {
        super(cVar);
        this.f97152e = cj0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f97151d = obj;
        this.f97153f |= Integer.MIN_VALUE;
        return this.f97152e.a(this);
    }
}
