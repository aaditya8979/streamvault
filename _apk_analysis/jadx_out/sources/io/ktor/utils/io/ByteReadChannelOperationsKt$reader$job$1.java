package io.ktor.utils.io;

import bn.r;
import hn.c;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000do.l0;
import p000do.t1;
import p000do.w;
import sn.p;

/* JADX INFO: compiled from: ByteReadChannelOperations.kt */
/* JADX INFO: loaded from: classes5.dex */
@d(c = "io.ktor.utils.io.ByteReadChannelOperationsKt$reader$job$1", f = "ByteReadChannelOperations.kt", l = {333, 343, 343, 343}, m = "invokeSuspend")
public final class ByteReadChannelOperationsKt$reader$job$1 extends SuspendLambda implements p<l0, c<? super r>, Object> {
    public final /* synthetic */ p<sl.p, c<? super r>, Object> $block;
    public final /* synthetic */ ByteChannel $channel;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ByteReadChannelOperationsKt$reader$job$1(p<? super sl.p, ? super c<? super r>, ? extends Object> pVar, ByteChannel byteChannel, c<? super ByteReadChannelOperationsKt$reader$job$1> cVar) {
        super(2, cVar);
        this.$block = pVar;
        this.$channel = byteChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<r> create(Object obj, c<?> cVar) {
        ByteReadChannelOperationsKt$reader$job$1 byteReadChannelOperationsKt$reader$job$1 = new ByteReadChannelOperationsKt$reader$job$1(this.$block, this.$channel, cVar);
        byteReadChannelOperationsKt$reader$job$1.L$0 = obj;
        return byteReadChannelOperationsKt$reader$job$1;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo2invoke(l0 l0Var, c<? super r> cVar) {
        return ((ByteReadChannelOperationsKt$reader$job$1) create(l0Var, cVar)).invokeSuspend(r.f5635a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.g] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v6, types: [do.w, kotlinx.coroutines.g] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        l0 l0Var;
        Object objG = in.a.g();
        ?? r12 = this.label;
        try {
        } catch (Throwable th2) {
            try {
                t1.d(r12, "Exception thrown while reading from channel", th2);
                ByteWriteChannelOperationsKt.b(this.$channel, th2);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
                if (r12.C(this) == objG) {
                    return objG;
                }
            } catch (Throwable th3) {
                this.L$0 = th3;
                this.L$1 = null;
                this.label = 4;
                if (r12.C(this) == objG) {
                    return objG;
                }
                throw th3;
            }
        }
        if (r12 == 0) {
            kotlin.c.b(obj);
            l0 l0Var2 = (l0) this.L$0;
            w wVarA = t1.a(t1.m(l0Var2.getCoroutineContext()));
            p<sl.p, c<? super r>, Object> pVar = this.$block;
            sl.p pVar2 = new sl.p(this.$channel, l0Var2.getCoroutineContext().plus(wVarA));
            this.L$0 = l0Var2;
            this.L$1 = wVarA;
            this.label = 1;
            if (pVar.mo2invoke(pVar2, this) == objG) {
                return objG;
            }
            l0Var = l0Var2;
            r12 = wVarA;
        } else {
            if (r12 != 1) {
                if (r12 == 2 || r12 == 3) {
                    kotlin.c.b(obj);
                    return r.f5635a;
                }
                if (r12 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Throwable th4 = (Throwable) this.L$0;
                kotlin.c.b(obj);
                throw th4;
            }
            w wVar = (w) this.L$1;
            l0Var = (l0) this.L$0;
            kotlin.c.b(obj);
            r12 = wVar;
        }
        r12.complete();
        if (t1.m(l0Var.getCoroutineContext()).isCancelled()) {
            this.$channel.a(t1.m(l0Var.getCoroutineContext()).B());
        }
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        if (r12.C(this) == objG) {
            return objG;
        }
        return r.f5635a;
    }
}
