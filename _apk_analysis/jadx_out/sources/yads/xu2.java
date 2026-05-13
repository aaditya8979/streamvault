package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class xu2 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w5 f96877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v5 f96878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f96879d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zu2 f96880e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f96881f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xu2(zu2 zu2Var, hn.c cVar) {
        super(cVar);
        this.f96880e = zu2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f96879d = obj;
        this.f96881f |= Integer.MIN_VALUE;
        return this.f96880e.b(null, this);
    }
}
