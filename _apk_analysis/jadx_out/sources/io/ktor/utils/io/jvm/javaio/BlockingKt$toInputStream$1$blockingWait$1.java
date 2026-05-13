package io.ktor.utils.io.jvm.javaio;

import bn.r;
import hn.c;
import io.ktor.utils.io.a;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000do.l0;
import sn.p;

/* JADX INFO: compiled from: Blocking.kt */
/* JADX INFO: loaded from: classes9.dex */
@d(c = "io.ktor.utils.io.jvm.javaio.BlockingKt$toInputStream$1$blockingWait$1", f = "Blocking.kt", l = {42}, m = "invokeSuspend")
public final class BlockingKt$toInputStream$1$blockingWait$1 extends SuspendLambda implements p<l0, c<? super Boolean>, Object> {
    public final /* synthetic */ a $this_toInputStream;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockingKt$toInputStream$1$blockingWait$1(a aVar, c<? super BlockingKt$toInputStream$1$blockingWait$1> cVar) {
        super(2, cVar);
        this.$this_toInputStream = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<r> create(Object obj, c<?> cVar) {
        return new BlockingKt$toInputStream$1$blockingWait$1(this.$this_toInputStream, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo2invoke(l0 l0Var, c<? super Boolean> cVar) {
        return ((BlockingKt$toInputStream$1$blockingWait$1) create(l0Var, cVar)).invokeSuspend(r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.c.b(obj);
            a aVar = this.$this_toInputStream;
            this.label = 1;
            obj = a.b.a(aVar, 0, this, 1, null);
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
