package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class pd2 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f93557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ud2 f93558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f93559d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pd2(ud2 ud2Var, hn.c cVar) {
        super(cVar);
        this.f93558c = ud2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f93557b = obj;
        this.f93559d |= Integer.MIN_VALUE;
        return this.f93558c.a(0L, this);
    }
}
