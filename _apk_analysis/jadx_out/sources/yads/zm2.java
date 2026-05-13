package yads;

import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class zm2 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f97668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cn2 f97669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f97670d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm2(cn2 cn2Var, hn.c cVar) {
        super(cVar);
        this.f97669c = cn2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f97668b = obj;
        this.f97670d |= Integer.MIN_VALUE;
        Object objA = this.f97669c.a(this);
        return objA == in.a.g() ? objA : Result.m7533boximpl(objA);
    }
}
