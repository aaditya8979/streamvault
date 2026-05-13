package yads;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes11.dex */
public final class su2 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f94932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zu2 f94933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tu2 f94934d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su2(zu2 zu2Var, tu2 tu2Var, hn.c cVar) {
        super(2, cVar);
        this.f94933c = zu2Var;
        this.f94934d = tu2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new su2(this.f94933c, this.f94934d, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new su2(this.f94933c, this.f94934d, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f94932b;
        try {
            if (i10 == 0) {
                kotlin.c.b(obj);
                zu2 zu2Var = this.f94933c;
                q61 q61Var = q61.f93902c;
                this.f94932b = 1;
                obj = zu2Var.a(q61Var, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            this.f94934d.f95359d.a((ru2) obj);
            tu2.f95356f.remove(this.f94933c);
            return bn.r.f5635a;
        } catch (Throwable th2) {
            tu2.f95356f.remove(this.f94933c);
            throw th2;
        }
    }
}
