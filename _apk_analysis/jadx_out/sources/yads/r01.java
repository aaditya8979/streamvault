package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class r01 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f94242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s01 f94243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f94244d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r01(s01 s01Var, hn.c cVar) {
        super(cVar);
        this.f94243c = s01Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f94242b = obj;
        this.f94244d |= Integer.MIN_VALUE;
        return this.f94243c.a(null, null, this);
    }
}
