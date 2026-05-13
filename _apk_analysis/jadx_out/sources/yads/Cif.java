package yads;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutKt;
import yads.Cif;

/* JADX INFO: renamed from: yads.if, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class Cif extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f90791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ jf f90792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f90793d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cif(jf jfVar, long j10, hn.c cVar) {
        super(2, cVar);
        this.f90792c = jfVar;
        this.f90793d = j10;
    }

    public static final void a(p000do.t tVar) {
        tVar.n(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new Cif(this.f90792c, this.f90793d, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new Cif(this.f90792c, this.f90793d, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f90791b;
        if (i10 == 0) {
            kotlin.c.b(obj);
            final p000do.t tVarC = p000do.v.c(null, 1, null);
            this.f90792c.f91203b.post(new Runnable() { // from class: bt.t2
                @Override // java.lang.Runnable
                public final void run() {
                    Cif.a(tVarC);
                }
            });
            long j10 = this.f90793d;
            hf hfVar = new hf(tVarC, null);
            this.f90791b = 1;
            obj = TimeoutKt.e(j10, hfVar, this);
            if (obj == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        return jn.a.a(obj != null);
    }
}
