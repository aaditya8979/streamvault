package io.ktor.client.content;

import bn.r;
import hn.c;
import in.a;
import jl.c;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import sl.f;
import sl.s;
import sn.p;

/* JADX INFO: compiled from: ObservableContent.kt */
/* JADX INFO: loaded from: classes8.dex */
@d(c = "io.ktor.client.content.ObservableContent$getContent$1", f = "ObservableContent.kt", l = {53}, m = "invokeSuspend")
public final class ObservableContent$getContent$1 extends SuspendLambda implements p<s, c<? super r>, Object> {
    public final /* synthetic */ jl.c $delegate;
    private /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObservableContent$getContent$1(jl.c cVar, c<? super ObservableContent$getContent$1> cVar2) {
        super(2, cVar2);
        this.$delegate = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<r> create(Object obj, c<?> cVar) {
        ObservableContent$getContent$1 observableContent$getContent$1 = new ObservableContent$getContent$1(this.$delegate, cVar);
        observableContent$getContent$1.L$0 = obj;
        return observableContent$getContent$1;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo2invoke(s sVar, c<? super r> cVar) {
        return ((ObservableContent$getContent$1) create(sVar, cVar)).invokeSuspend(r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = a.g();
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.c.b(obj);
            s sVar = (s) this.L$0;
            c.e eVar = (c.e) this.$delegate;
            f fVarA = sVar.a();
            this.label = 1;
            if (eVar.d(fVarA, this) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        return r.f5635a;
    }
}
