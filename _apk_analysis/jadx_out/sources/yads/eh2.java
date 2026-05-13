package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes7.dex */
public final class eh2 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f89256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fh2 f89257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f89258d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh2(fh2 fh2Var, hn.c cVar) {
        super(cVar);
        this.f89257c = fh2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f89256b = obj;
        this.f89258d |= Integer.MIN_VALUE;
        return this.f89257c.a(null, null, this);
    }
}
