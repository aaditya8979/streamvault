package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes12.dex */
public final class gz0 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public hz0 f90163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f90164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hz0 f90165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f90166e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gz0(hz0 hz0Var, hn.c cVar) {
        super(cVar);
        this.f90165d = hz0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f90164c = obj;
        this.f90166e |= Integer.MIN_VALUE;
        return this.f90165d.a(false, this);
    }
}
