package yads;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
public final class ii extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f90845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ io2 f90846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p000do.l0 f90847d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ii(Context context, io2 io2Var, p000do.l0 l0Var, hn.c cVar) {
        super(2, cVar);
        this.f90845b = context;
        this.f90846c = io2Var;
        this.f90847d = l0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new ii(this.f90845b, this.f90846c, this.f90847d, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((ii) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        try {
            if (ji.f91230b != null) {
                return bn.r.f5635a;
            }
            Object obj2 = dw2.f89000j;
            nt2 nt2VarA = cw2.a().a(this.f90845b);
            if (nt2VarA != null && nt2VarA.f92953i0) {
                Set setF = nt2VarA.f92963n0;
                if (setF == null) {
                    setF = cn.w0.f();
                }
                Integer num = nt2VarA.f92955j0;
                int iIntValue = num != null ? num.intValue() : 10;
                Integer num2 = nt2VarA.f92957k0;
                int iIntValue2 = num2 != null ? num2.intValue() : 91;
                Boolean bool = nt2VarA.f92959l0;
                boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                wf wfVar = new wf(setF, iIntValue, iIntValue2, zBooleanValue);
                ei eiVar = new ei(this.f90845b);
                fi fiVar = new fi(this.f90846c, zBooleanValue);
                kf kfVar = new kf(ug1.a(this.f90845b, "YadPreferenceFile"));
                AtomicBoolean atomicBoolean = ji.f91229a;
                ji.f91230b = new hi(wfVar, this.f90847d, eiVar, fiVar, kfVar, this.f90846c);
                hi hiVar = ji.f91230b;
                if (hiVar != null && !hiVar.f90426h.getAndSet(true)) {
                    p000do.i.d(hiVar.f90420b, hiVar.f90424f, null, new gi(hiVar, null), 2, null);
                }
            }
            ji.f91229a.set(false);
            return bn.r.f5635a;
        } finally {
            ji.f91229a.set(false);
        }
    }
}
