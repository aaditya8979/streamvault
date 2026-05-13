package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class cb0 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public db0 f88402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public wa0 f88403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f88404d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ db0 f88405e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f88406f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cb0(db0 db0Var, hn.c cVar) {
        super(cVar);
        this.f88405e = db0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f88404d = obj;
        this.f88406f |= Integer.MIN_VALUE;
        return this.f88405e.a(null, null, this);
    }
}
