package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes12.dex */
public final class nw0 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public rw0 f93017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public dn2 f93018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f93019d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rw0 f93020e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f93021f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nw0(rw0 rw0Var, hn.c cVar) {
        super(cVar);
        this.f93020e = rw0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f93019d = obj;
        this.f93021f |= Integer.MIN_VALUE;
        return this.f93020e.a(null, this);
    }
}
