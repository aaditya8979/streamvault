package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes10.dex */
public final class bm0 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public cm0 f88070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f88071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cm0 f88072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f88073e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm0(cm0 cm0Var, hn.c cVar) {
        super(cVar);
        this.f88072d = cm0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f88071c = obj;
        this.f88073e |= Integer.MIN_VALUE;
        return this.f88072d.a(null, this);
    }
}
