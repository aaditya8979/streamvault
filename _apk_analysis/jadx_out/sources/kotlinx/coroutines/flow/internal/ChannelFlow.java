package kotlinx.coroutines.flow.internal;

import bn.r;
import cn.f0;
import fo.m;
import fo.o;
import go.e;
import go.f;
import hn.c;
import ho.j;
import in.a;
import java.util.ArrayList;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProduceKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import p000do.m0;
import sn.p;

/* JADX INFO: compiled from: ChannelFlow.kt */
/* JADX INFO: loaded from: classes6.dex */
public abstract class ChannelFlow<T> implements j<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final d f73401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f73402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final BufferOverflow f73403d;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.ChannelFlow$collect$2, reason: invalid class name */
    /* JADX INFO: compiled from: ChannelFlow.kt */
    @jn.d(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", l = {119}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements p<l0, c<? super r>, Object> {
        public final /* synthetic */ e<T> $collector;
        private /* synthetic */ Object L$0;
        public int label;
        public final /* synthetic */ ChannelFlow<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(e<? super T> eVar, ChannelFlow<T> channelFlow, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$collector = eVar;
            this.this$0 = channelFlow;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$collector, this.this$0, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, c<? super r> cVar) {
            return ((AnonymousClass2) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = a.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                l0 l0Var = (l0) this.L$0;
                e<T> eVar = this.$collector;
                o<T> oVarM = this.this$0.m(l0Var);
                this.label = 1;
                if (f.r(eVar, oVarM, this) == objG) {
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

    public ChannelFlow(@NotNull d dVar, int i10, @NotNull BufferOverflow bufferOverflow) {
        this.f73401b = dVar;
        this.f73402c = i10;
        this.f73403d = bufferOverflow;
    }

    public static /* synthetic */ <T> Object d(ChannelFlow<T> channelFlow, e<? super T> eVar, c<? super r> cVar) {
        Object objF = kotlinx.coroutines.d.f(new AnonymousClass2(eVar, channelFlow, null), cVar);
        return objF == a.g() ? objF : r.f5635a;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013 A[PHI: r4
      0x0013: PHI (r4v5 int) = (r4v2 int), (r4v2 int), (r4v4 int) binds: [B:8:0x0011, B:13:0x0019, B:16:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // ho.j
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public go.d<T> a(@org.jetbrains.annotations.NotNull kotlin.coroutines.d r2, int r3, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BufferOverflow r4) {
        /*
            r1 = this;
            kotlin.coroutines.d r0 = r1.f73401b
            kotlin.coroutines.d r2 = r2.plus(r0)
            kotlinx.coroutines.channels.BufferOverflow r0 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            if (r4 == r0) goto Lb
            goto L25
        Lb:
            int r4 = r1.f73402c
            r0 = -3
            if (r4 != r0) goto L11
            goto L23
        L11:
            if (r3 != r0) goto L15
        L13:
            r3 = r4
            goto L23
        L15:
            r0 = -2
            if (r4 != r0) goto L19
            goto L23
        L19:
            if (r3 != r0) goto L1c
            goto L13
        L1c:
            int r4 = r4 + r3
            if (r4 < 0) goto L20
            goto L13
        L20:
            r3 = 2147483647(0x7fffffff, float:NaN)
        L23:
            kotlinx.coroutines.channels.BufferOverflow r4 = r1.f73403d
        L25:
            kotlin.coroutines.d r0 = r1.f73401b
            boolean r0 = tn.p.f(r2, r0)
            if (r0 == 0) goto L36
            int r0 = r1.f73402c
            if (r3 != r0) goto L36
            kotlinx.coroutines.channels.BufferOverflow r0 = r1.f73403d
            if (r4 != r0) goto L36
            return r1
        L36:
            kotlinx.coroutines.flow.internal.ChannelFlow r2 = r1.f(r2, r3, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.ChannelFlow.a(kotlin.coroutines.d, int, kotlinx.coroutines.channels.BufferOverflow):go.d");
    }

    @Nullable
    public String c() {
        return null;
    }

    @Override // go.d
    @Nullable
    public Object collect(@NotNull e<? super T> eVar, @NotNull c<? super r> cVar) {
        return d(this, eVar, cVar);
    }

    @Nullable
    public abstract Object e(@NotNull m<? super T> mVar, @NotNull c<? super r> cVar);

    @NotNull
    public abstract ChannelFlow<T> f(@NotNull d dVar, int i10, @NotNull BufferOverflow bufferOverflow);

    @Nullable
    public go.d<T> j() {
        return null;
    }

    @NotNull
    public final p<m<? super T>, c<? super r>, Object> k() {
        return new ChannelFlow$collectToFun$1(this, null);
    }

    public final int l() {
        int i10 = this.f73402c;
        if (i10 == -3) {
            return -2;
        }
        return i10;
    }

    @NotNull
    public o<T> m(@NotNull l0 l0Var) {
        return ProduceKt.g(l0Var, this.f73401b, l(), this.f73403d, CoroutineStart.ATOMIC, null, k(), 16, null);
    }

    @NotNull
    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strC = c();
        if (strC != null) {
            arrayList.add(strC);
        }
        if (this.f73401b != EmptyCoroutineContext.INSTANCE) {
            arrayList.add("context=" + this.f73401b);
        }
        if (this.f73402c != -3) {
            arrayList.add("capacity=" + this.f73402c);
        }
        if (this.f73403d != BufferOverflow.SUSPEND) {
            arrayList.add("onBufferOverflow=" + this.f73403d);
        }
        return m0.a(this) + '[' + f0.D0(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}
