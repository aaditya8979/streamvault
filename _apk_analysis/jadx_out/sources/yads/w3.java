package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class w3 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x3 f96262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public if1 f96263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public oa2 f96264d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f96265e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x3 f96266f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f96267g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(x3 x3Var, hn.c cVar) {
        super(cVar);
        this.f96266f = x3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f96265e = obj;
        this.f96267g |= Integer.MIN_VALUE;
        return this.f96266f.a(null, null, null, null, this);
    }
}
