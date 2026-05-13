package yads;

import android.content.Context;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutKt;

/* JADX INFO: loaded from: classes2.dex */
public final class zd extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f97526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f97527c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd(Context context, hn.c cVar) {
        super(2, cVar);
        this.f97527c = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new zd(this.f97527c, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new zd(this.f97527c, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yd ydVar;
        Object objG = in.a.g();
        int i10 = this.f97526b;
        if (i10 == 0) {
            kotlin.c.b(obj);
            Object obj2 = yd.f97068d;
            Context context = this.f97527c;
            yd ydVar2 = yd.f97069e;
            if (ydVar2 == null) {
                synchronized (yd.f97068d) {
                    ydVar = yd.f97069e;
                    if (ydVar == null) {
                        ydVar = new yd(kotlinx.coroutines.d.a(p000do.j2.b(null, 1, null).plus(p000do.w0.b()).plus(new x10())), new le(), new ie(context));
                        yd.f97069e = ydVar;
                    }
                }
                ydVar2 = ydVar;
            }
            this.f97526b = 1;
            obj = TimeoutKt.e(((Number) ydVar2.f97071b.f90341b.getValue()).longValue(), new xd(ydVar2, null), this);
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
