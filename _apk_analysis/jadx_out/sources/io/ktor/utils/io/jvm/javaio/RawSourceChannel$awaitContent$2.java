package io.ktor.utils.io.jvm.javaio;

import bn.r;
import hn.c;
import in.a;
import io.ktor.utils.io.CloseToken;
import java.io.EOFException;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000do.l0;
import sn.p;
import ul.e;

/* JADX INFO: compiled from: Reading.kt */
/* JADX INFO: loaded from: classes8.dex */
@d(c = "io.ktor.utils.io.jvm.javaio.RawSourceChannel$awaitContent$2", f = "Reading.kt", l = {}, m = "invokeSuspend")
public final class RawSourceChannel$awaitContent$2 extends SuspendLambda implements p<l0, c<? super r>, Object> {
    public final /* synthetic */ int $min;
    public int label;
    public final /* synthetic */ RawSourceChannel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RawSourceChannel$awaitContent$2(RawSourceChannel rawSourceChannel, int i10, c<? super RawSourceChannel$awaitContent$2> cVar) {
        super(2, cVar);
        this.this$0 = rawSourceChannel;
        this.$min = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<r> create(Object obj, c<?> cVar) {
        return new RawSourceChannel$awaitContent$2(this.this$0, this.$min, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo2invoke(l0 l0Var, c<? super r> cVar) {
        return ((RawSourceChannel$awaitContent$2) create(l0Var, cVar)).invokeSuspend(r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.g();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.c.b(obj);
        long jS = 0;
        while (e.b(this.this$0.f71282e) < this.$min && jS >= 0) {
            try {
                jS = this.this$0.f71279b.s(this.this$0.f71282e, Long.MAX_VALUE);
            } catch (EOFException unused) {
                jS = -1;
            }
        }
        if (jS == -1) {
            this.this$0.f71279b.close();
            this.this$0.i().complete();
            this.this$0.f71281d = new CloseToken(null);
        }
        return r.f5635a;
    }
}
