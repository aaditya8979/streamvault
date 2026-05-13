package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes11.dex */
public final class jz0 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f91426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f91427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kz0 f91428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f91429e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jz0(kz0 kz0Var, hn.c cVar) {
        super(cVar);
        this.f91428d = kz0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f91427c = obj;
        this.f91429e |= Integer.MIN_VALUE;
        return this.f91428d.a(null, false, this);
    }
}
