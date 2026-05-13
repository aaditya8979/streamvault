package yads;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes2.dex */
public final class xd extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f96713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yd f96714c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xd(yd ydVar, hn.c cVar) {
        super(2, cVar);
        this.f96714c = ydVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new xd(this.f96714c, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new xd(this.f96714c, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f96713b;
        if (i10 == 0) {
            kotlin.c.b(obj);
            p000do.p0 p0Var = this.f96714c.f97072c;
            this.f96713b = 1;
            obj = p0Var.N(this);
            if (obj == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        ke keVar = obj instanceof ke ? (ke) obj : null;
        if (keVar != null) {
            return keVar.f91579a;
        }
        return null;
    }
}
