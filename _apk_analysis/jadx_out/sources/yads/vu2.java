package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes8.dex */
public final class vu2 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zu2 f96191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q61 f96192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w5 f96193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public v5 f96194e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public kotlinx.coroutines.g f96195f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f96196g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ zu2 f96197h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f96198i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vu2(zu2 zu2Var, hn.c cVar) {
        super(cVar);
        this.f96197h = zu2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f96196g = obj;
        this.f96198i |= Integer.MIN_VALUE;
        return this.f96197h.a(null, this);
    }
}
