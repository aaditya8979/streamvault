package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class uy1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public oi f95874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f95875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yy1 f95876d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f95877e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uy1(yy1 yy1Var, hn.c cVar) {
        super(cVar);
        this.f95876d = yy1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f95875c = obj;
        this.f95877e |= Integer.MIN_VALUE;
        return yy1.a(this.f95876d, (oi) null, this);
    }
}
