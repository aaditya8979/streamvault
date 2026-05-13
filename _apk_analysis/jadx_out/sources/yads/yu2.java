package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class yu2 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zu2 f97299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public w5 f97300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public v5 f97301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f97302e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zu2 f97303f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f97304g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yu2(zu2 zu2Var, hn.c cVar) {
        super(cVar);
        this.f97303f = zu2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f97302e = obj;
        this.f97304g |= Integer.MIN_VALUE;
        return this.f97303f.a(this);
    }
}
