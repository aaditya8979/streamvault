package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class cz0 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public dz0 f88671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f88672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f88673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dz0 f88674e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f88675f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cz0(dz0 dz0Var, hn.c cVar) {
        super(cVar);
        this.f88674e = dz0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f88673d = obj;
        this.f88675f |= Integer.MIN_VALUE;
        return this.f88674e.a(null, false, this);
    }
}
