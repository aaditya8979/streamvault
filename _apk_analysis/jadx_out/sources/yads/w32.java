package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class w32 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z32 f96274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public mi2 f96275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ry1 f96276d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w5 f96277e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public v5 f96278f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f96279g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ z32 f96280h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f96281i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w32(z32 z32Var, hn.c cVar) {
        super(cVar);
        this.f96280h = z32Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f96279g = obj;
        this.f96281i |= Integer.MIN_VALUE;
        return this.f96280h.a(null, null, null, this);
    }
}
