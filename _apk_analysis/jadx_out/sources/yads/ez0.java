package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes12.dex */
public final class ez0 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f89411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz0 f89412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f89413d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ez0(fz0 fz0Var, hn.c cVar) {
        super(cVar);
        this.f89412c = fz0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f89411b = obj;
        this.f89413d |= Integer.MIN_VALUE;
        return this.f89412c.a(false, this);
    }
}
