package yads;

import android.content.Context;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes6.dex */
public final class vy1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ry1 f96223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f96224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yy1 f96225d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f96226e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vy1(yy1 yy1Var, hn.c cVar) {
        super(cVar);
        this.f96225d = yy1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f96224c = obj;
        this.f96226e |= Integer.MIN_VALUE;
        return this.f96225d.a((Context) null, (ry1) null, this);
    }
}
