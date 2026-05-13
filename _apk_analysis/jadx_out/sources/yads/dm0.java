package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class dm0 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public em0 f88912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f88913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ em0 f88914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f88915e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dm0(em0 em0Var, hn.c cVar) {
        super(cVar);
        this.f88914d = em0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f88913c = obj;
        this.f88915e |= Integer.MIN_VALUE;
        return this.f88914d.a(null, this);
    }
}
