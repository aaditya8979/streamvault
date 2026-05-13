package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes11.dex */
public final class u72 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x72 f95571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f95572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x72 f95573d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f95574e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u72(x72 x72Var, hn.c cVar) {
        super(cVar);
        this.f95573d = x72Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f95572c = obj;
        this.f95574e |= Integer.MIN_VALUE;
        return x72.a(this.f95573d, null, this);
    }
}
