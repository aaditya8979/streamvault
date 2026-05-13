package yads;

import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AwaitKt;

/* JADX INFO: loaded from: classes5.dex */
public final class wh2 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f96394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f96395c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wh2(List list, hn.c cVar) {
        super(2, cVar);
        this.f96395c = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new wh2(this.f96395c, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new wh2(this.f96395c, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f96394b;
        if (i10 == 0) {
            kotlin.c.b(obj);
            List list = this.f96395c;
            this.f96394b = 1;
            obj = AwaitKt.a(list, this);
            if (obj == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        return cn.f0.q0((Iterable) obj);
    }
}
