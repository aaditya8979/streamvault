package io.ktor.client.plugins;

import androidx.compose.material.TextFieldImplKt;
import bn.r;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import sn.q;

/* JADX INFO: compiled from: HttpCallValidator.kt */
/* JADX INFO: loaded from: classes10.dex */
@d(c = "io.ktor.client.plugins.RequestError$install$1", f = "HttpCallValidator.kt", l = {TextFieldImplKt.AnimationDuration, 152}, m = "invokeSuspend")
public final class RequestError$install$1 extends SuspendLambda implements q<ql.c<Object, cl.d>, Object, hn.c<? super r>, Object> {
    public final /* synthetic */ q<cl.b, Throwable, hn.c<? super Throwable>, Object> $handler;
    private /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RequestError$install$1(q<? super cl.b, ? super Throwable, ? super hn.c<? super Throwable>, ? extends Object> qVar, hn.c<? super RequestError$install$1> cVar) {
        super(3, cVar);
        this.$handler = qVar;
    }

    @Override // sn.q
    public final Object invoke(ql.c<Object, cl.d> cVar, Object obj, hn.c<? super r> cVar2) {
        RequestError$install$1 requestError$install$1 = new RequestError$install$1(this.$handler, cVar2);
        requestError$install$1.L$0 = cVar;
        return requestError$install$1.invokeSuspend(r.f5635a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [ql.c] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objG = in.a.g();
        ?? r12 = this.label;
        try {
        } catch (Throwable th2) {
            q<cl.b, Throwable, hn.c<? super Throwable>, Object> qVar = this.$handler;
            cl.b bVarE = HttpCallValidatorKt.e((cl.d) r12.getContext());
            this.L$0 = null;
            this.label = 2;
            obj = qVar.invoke(bVarE, th2, this);
            if (obj == objG) {
                return objG;
            }
        }
        if (r12 == 0) {
            kotlin.c.b(obj);
            ql.c cVar = (ql.c) this.L$0;
            this.L$0 = cVar;
            this.label = 1;
            Object objC = cVar.c(this);
            r12 = cVar;
            if (objC == objG) {
                return objG;
            }
        } else {
            if (r12 != 1) {
                if (r12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
                Throwable th3 = (Throwable) obj;
                if (th3 != null) {
                    throw th3;
                }
                return r.f5635a;
            }
            ql.c cVar2 = (ql.c) this.L$0;
            kotlin.c.b(obj);
            r12 = cVar2;
        }
        return r.f5635a;
    }
}
