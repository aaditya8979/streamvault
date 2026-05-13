package yads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes11.dex */
public final class su1 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f94930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lu2 f94931c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su1(Context context, lu2 lu2Var, hn.c cVar) {
        super(2, cVar);
        this.f94930b = context;
        this.f94931c = lu2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new su1(this.f94930b, this.f94931c, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new su1(this.f94930b, this.f94931c, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        boolean z10 = ha3.f90337a;
        ha3.a(this.f94930b, ((iu3) this.f94931c).a());
        xf.a(this.f94930b, ((iu3) this.f94931c).a());
        AtomicBoolean atomicBoolean = ji.f91229a;
        ji.a(this.f94930b, ((iu3) this.f94931c).a());
        return bn.r.f5635a;
    }
}
