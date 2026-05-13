package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class rn extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zn f94499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ra3 f94500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f94501d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zn f94502e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f94503f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rn(zn znVar, hn.c cVar) {
        super(cVar);
        this.f94502e = znVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f94501d = obj;
        this.f94503f |= Integer.MIN_VALUE;
        return zn.a(this.f94502e, null, this);
    }
}
