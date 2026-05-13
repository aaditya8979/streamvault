package yads;

import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes12.dex */
public final class sd2 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f94798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ud2 f94799c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sd2(ud2 ud2Var, hn.c cVar) {
        super(2, cVar);
        this.f94799c = ud2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new sd2(this.f94799c, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new sd2(this.f94799c, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f94798b;
        if (i10 == 0) {
            kotlin.c.b(obj);
            ud2 ud2Var = this.f94799c;
            this.f94798b = 1;
            kotlinx.coroutines.c cVar = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.d(this), 1);
            cVar.K();
            try {
                Task<AppSetIdInfo> appSetIdInfo = AppSet.getClient(ud2Var.f95601a.getApplicationContext()).getAppSetIdInfo();
                final qd2 qd2Var = new qd2(cVar);
                appSetIdInfo.addOnSuccessListener(new OnSuccessListener() { // from class: yads.td2
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final /* synthetic */ void onSuccess(Object obj2) {
                        qd2Var.invoke(obj2);
                    }
                }).addOnFailureListener(new rd2(cVar));
            } catch (Throwable unused) {
                cVar.p(null, null);
            }
            obj = cVar.B();
            if (obj == in.a.g()) {
                jn.f.c(this);
            }
            if (obj == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        return obj;
    }
}
