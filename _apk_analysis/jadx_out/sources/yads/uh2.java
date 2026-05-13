package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class uh2 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f95647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xh2 f95648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f95649d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uh2(xh2 xh2Var, hn.c cVar) {
        super(cVar);
        this.f95648c = xh2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f95647b = obj;
        this.f95649d |= Integer.MIN_VALUE;
        return xh2.a(0L, null, null, null, this.f95648c, null, this);
    }
}
