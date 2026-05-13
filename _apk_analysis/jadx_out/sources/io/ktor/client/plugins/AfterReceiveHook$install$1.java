package io.ktor.client.plugins;

import bn.r;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import sn.p;
import sn.q;

/* JADX INFO: compiled from: BodyProgress.kt */
/* JADX INFO: loaded from: classes2.dex */
@d(c = "io.ktor.client.plugins.AfterReceiveHook$install$1", f = "BodyProgress.kt", l = {50, 51}, m = "invokeSuspend")
public final class AfterReceiveHook$install$1 extends SuspendLambda implements q<ql.c<dl.c, r>, dl.c, hn.c<? super r>, Object> {
    public final /* synthetic */ p<dl.c, hn.c<? super dl.c>, Object> $handler;
    private /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AfterReceiveHook$install$1(p<? super dl.c, ? super hn.c<? super dl.c>, ? extends Object> pVar, hn.c<? super AfterReceiveHook$install$1> cVar) {
        super(3, cVar);
        this.$handler = pVar;
    }

    @Override // sn.q
    public final Object invoke(ql.c<dl.c, r> cVar, dl.c cVar2, hn.c<? super r> cVar3) {
        AfterReceiveHook$install$1 afterReceiveHook$install$1 = new AfterReceiveHook$install$1(this.$handler, cVar3);
        afterReceiveHook$install$1.L$0 = cVar;
        afterReceiveHook$install$1.L$1 = cVar2;
        return afterReceiveHook$install$1.invokeSuspend(r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ql.c cVar;
        Object objG = in.a.g();
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.c.b(obj);
            cVar = (ql.c) this.L$0;
            dl.c cVar2 = (dl.c) this.L$1;
            p<dl.c, hn.c<? super dl.c>, Object> pVar = this.$handler;
            this.L$0 = cVar;
            this.label = 1;
            obj = pVar.mo2invoke(cVar2, this);
            if (obj == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
                return r.f5635a;
            }
            cVar = (ql.c) this.L$0;
            kotlin.c.b(obj);
        }
        dl.c cVar3 = (dl.c) obj;
        if (cVar3 != null) {
            this.L$0 = null;
            this.label = 2;
            if (cVar.d(cVar3, this) == objG) {
                return objG;
            }
        }
        return r.f5635a;
    }
}
