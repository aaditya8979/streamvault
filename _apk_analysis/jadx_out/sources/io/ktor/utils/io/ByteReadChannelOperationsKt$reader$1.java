package io.ktor.utils.io;

import bn.r;
import hn.c;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.g;
import sn.l;

/* JADX INFO: compiled from: ByteReadChannelOperations.kt */
/* JADX INFO: loaded from: classes5.dex */
@d(c = "io.ktor.utils.io.ByteReadChannelOperationsKt$reader$1", f = "ByteReadChannelOperations.kt", l = {353}, m = "invokeSuspend")
public final class ByteReadChannelOperationsKt$reader$1 extends SuspendLambda implements l<c<? super r>, Object> {
    public final /* synthetic */ g $job;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ByteReadChannelOperationsKt$reader$1(g gVar, c<? super ByteReadChannelOperationsKt$reader$1> cVar) {
        super(1, cVar);
        this.$job = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<r> create(c<?> cVar) {
        return new ByteReadChannelOperationsKt$reader$1(this.$job, cVar);
    }

    @Override // sn.l
    public final Object invoke(c<? super r> cVar) {
        return ((ByteReadChannelOperationsKt$reader$1) create(cVar)).invokeSuspend(r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.c.b(obj);
            g gVar = this.$job;
            this.label = 1;
            if (gVar.C(this) == objG) {
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
