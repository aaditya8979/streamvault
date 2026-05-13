package kotlinx.coroutines.flow;

import go.e;
import go.k;
import go.q;
import go.r;
import hn.c;
import ho.j;
import io.e0;
import java.util.Arrays;
import jn.d;
import jn.f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.n;
import p000do.y0;
import tn.p;

/* JADX INFO: compiled from: SharedFlow.kt */
/* JADX INFO: loaded from: classes5.dex */
public class SharedFlowImpl<T> extends ho.a<r> implements k<T>, go.a<T>, j<T> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f73373f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f73374g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final BufferOverflow f73375h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public Object[] f73376i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f73377j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f73378k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f73379l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f73380m;

    /* JADX INFO: compiled from: SharedFlow.kt */
    public static final class a implements y0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final SharedFlowImpl<?> f73381b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f73382c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final Object f73383d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final c<bn.r> f73384e;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull SharedFlowImpl<?> sharedFlowImpl, long j10, @Nullable Object obj, @NotNull c<? super bn.r> cVar) {
            this.f73381b = sharedFlowImpl;
            this.f73382c = j10;
            this.f73383d = obj;
            this.f73384e = cVar;
        }

        @Override // p000do.y0
        public void dispose() {
            this.f73381b.y(this);
        }
    }

    /* JADX INFO: compiled from: SharedFlow.kt */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BufferOverflow.values().length];
            try {
                iArr[BufferOverflow.SUSPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BufferOverflow.DROP_LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BufferOverflow.DROP_OLDEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.SharedFlowImpl$collect$1, reason: invalid class name */
    /* JADX INFO: compiled from: SharedFlow.kt */
    @d(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", l = {387, 394, 397}, m = "collect$suspendImpl")
    public static final class AnonymousClass1<T> extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;
        public final /* synthetic */ SharedFlowImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SharedFlowImpl<T> sharedFlowImpl, c<? super AnonymousClass1> cVar) {
            super(cVar);
            this.this$0 = sharedFlowImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SharedFlowImpl.A(this.this$0, null, this);
        }
    }

    public SharedFlowImpl(int i10, int i11, @NotNull BufferOverflow bufferOverflow) {
        this.f73373f = i10;
        this.f73374g = i11;
        this.f73375h = bufferOverflow;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ <T> java.lang.Object A(kotlinx.coroutines.flow.SharedFlowImpl<T> r8, go.e<? super T> r9, hn.c<?> r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.SharedFlowImpl.A(kotlinx.coroutines.flow.SharedFlowImpl, go.e, hn.c):java.lang.Object");
    }

    public static /* synthetic */ <T> Object F(SharedFlowImpl<T> sharedFlowImpl, T t10, c<? super bn.r> cVar) {
        Object objG;
        return (!sharedFlowImpl.h(t10) && (objG = sharedFlowImpl.G(t10, cVar)) == in.a.g()) ? objG : bn.r.f5635a;
    }

    public final void B(long j10) {
        ho.c[] cVarArr;
        if (this.f63554c != 0 && (cVarArr = this.f63553b) != null) {
            for (ho.c cVar : cVarArr) {
                if (cVar != null) {
                    r rVar = (r) cVar;
                    long j11 = rVar.f62656a;
                    if (j11 >= 0 && j11 < j10) {
                        rVar.f62656a = j10;
                    }
                }
            }
        }
        this.f73378k = j10;
    }

    @Override // ho.a
    @NotNull
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public r f() {
        return new r();
    }

    @Override // ho.a
    @NotNull
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public r[] j(int i10) {
        return new r[i10];
    }

    public final void E() {
        Object[] objArr = this.f73376i;
        p.h(objArr);
        q.g(objArr, K(), null);
        this.f73379l--;
        long jK = K() + 1;
        if (this.f73377j < jK) {
            this.f73377j = jK;
        }
        if (this.f73378k < jK) {
            B(jK);
        }
    }

    public final Object G(T t10, c<? super bn.r> cVar) {
        c<bn.r>[] cVarArrI;
        a aVar;
        kotlinx.coroutines.c cVar2 = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.d(cVar), 1);
        cVar2.K();
        c<bn.r>[] cVarArrI2 = ho.b.f63557a;
        synchronized (this) {
            if (R(t10)) {
                Result.a aVar2 = Result.Companion;
                cVar2.resumeWith(Result.m7534constructorimpl(bn.r.f5635a));
                cVarArrI = I(cVarArrI2);
                aVar = null;
            } else {
                a aVar3 = new a(this, ((long) P()) + K(), t10, cVar2);
                H(aVar3);
                this.f73380m++;
                if (this.f73374g == 0) {
                    cVarArrI2 = I(cVarArrI2);
                }
                cVarArrI = cVarArrI2;
                aVar = aVar3;
            }
        }
        if (aVar != null) {
            n.a(cVar2, aVar);
        }
        for (c<bn.r> cVar3 : cVarArrI) {
            if (cVar3 != null) {
                Result.a aVar4 = Result.Companion;
                cVar3.resumeWith(Result.m7534constructorimpl(bn.r.f5635a));
            }
        }
        Object objB = cVar2.B();
        if (objB == in.a.g()) {
            f.c(cVar);
        }
        return objB == in.a.g() ? objB : bn.r.f5635a;
    }

    public final void H(Object obj) {
        int iP = P();
        Object[] objArrQ = this.f73376i;
        if (objArrQ == null) {
            objArrQ = Q(null, 0, 2);
        } else if (iP >= objArrQ.length) {
            objArrQ = Q(objArrQ, iP, objArrQ.length * 2);
        }
        q.g(objArrQ, K() + ((long) iP), obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [hn.c<bn.r>[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final c<bn.r>[] I(c<bn.r>[] cVarArr) {
        ho.c[] cVarArr2;
        r rVar;
        c<? super bn.r> cVar;
        int length = cVarArr.length;
        if (this.f63554c != 0 && (cVarArr2 = this.f63553b) != null) {
            int i10 = 0;
            int length2 = cVarArr2.length;
            cVarArr = cVarArr;
            while (i10 < length2) {
                ho.c cVar2 = cVarArr2[i10];
                if (cVar2 != null && (cVar = (rVar = (r) cVar2).f62657b) != null && T(rVar) >= 0) {
                    int length3 = cVarArr.length;
                    cVarArr = cVarArr;
                    if (length >= length3) {
                        Object[] objArrCopyOf = Arrays.copyOf((Object[]) cVarArr, Math.max(2, cVarArr.length * 2));
                        p.j(objArrCopyOf, "copyOf(...)");
                        cVarArr = objArrCopyOf;
                    }
                    ((c[]) cVarArr)[length] = cVar;
                    rVar.f62657b = null;
                    length++;
                }
                i10++;
                cVarArr = cVarArr;
            }
        }
        return (c[]) cVarArr;
    }

    public final long J() {
        return K() + ((long) this.f73379l);
    }

    public final long K() {
        return Math.min(this.f73378k, this.f73377j);
    }

    public final T L() {
        Object[] objArr = this.f73376i;
        p.h(objArr);
        return (T) q.f(objArr, (this.f73377j + ((long) O())) - 1);
    }

    public final Object M(long j10) {
        Object[] objArr = this.f73376i;
        p.h(objArr);
        Object objF = q.f(objArr, j10);
        return objF instanceof a ? ((a) objF).f73383d : objF;
    }

    public final long N() {
        return K() + ((long) this.f73379l) + ((long) this.f73380m);
    }

    public final int O() {
        return (int) ((K() + ((long) this.f73379l)) - this.f73377j);
    }

    public final int P() {
        return this.f73379l + this.f73380m;
    }

    public final Object[] Q(Object[] objArr, int i10, int i11) {
        if (!(i11 > 0)) {
            throw new IllegalStateException("Buffer size overflow".toString());
        }
        Object[] objArr2 = new Object[i11];
        this.f73376i = objArr2;
        if (objArr == null) {
            return objArr2;
        }
        long jK = K();
        for (int i12 = 0; i12 < i10; i12++) {
            long j10 = ((long) i12) + jK;
            q.g(objArr2, j10, q.f(objArr, j10));
        }
        return objArr2;
    }

    public final boolean R(T t10) {
        if (l() == 0) {
            return S(t10);
        }
        if (this.f73379l >= this.f73374g && this.f73378k <= this.f73377j) {
            int i10 = b.$EnumSwitchMapping$0[this.f73375h.ordinal()];
            if (i10 == 1) {
                return false;
            }
            if (i10 == 2) {
                return true;
            }
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        H(t10);
        int i11 = this.f73379l + 1;
        this.f73379l = i11;
        if (i11 > this.f73374g) {
            E();
        }
        if (O() > this.f73373f) {
            V(this.f73377j + 1, this.f73378k, J(), N());
        }
        return true;
    }

    public final boolean S(T t10) {
        if (this.f73373f == 0) {
            return true;
        }
        H(t10);
        int i10 = this.f73379l + 1;
        this.f73379l = i10;
        if (i10 > this.f73373f) {
            E();
        }
        this.f73378k = K() + ((long) this.f73379l);
        return true;
    }

    public final long T(r rVar) {
        long j10 = rVar.f62656a;
        if (j10 < J()) {
            return j10;
        }
        if (this.f73374g <= 0 && j10 <= K() && this.f73380m != 0) {
            return j10;
        }
        return -1L;
    }

    public final Object U(r rVar) {
        Object obj;
        c<bn.r>[] cVarArrW = ho.b.f63557a;
        synchronized (this) {
            long jT = T(rVar);
            if (jT < 0) {
                obj = q.f62655a;
            } else {
                long j10 = rVar.f62656a;
                Object objM = M(jT);
                rVar.f62656a = jT + 1;
                cVarArrW = W(j10);
                obj = objM;
            }
        }
        for (c<bn.r> cVar : cVarArrW) {
            if (cVar != null) {
                Result.a aVar = Result.Companion;
                cVar.resumeWith(Result.m7534constructorimpl(bn.r.f5635a));
            }
        }
        return obj;
    }

    public final void V(long j10, long j11, long j12, long j13) {
        long jMin = Math.min(j11, j10);
        for (long jK = K(); jK < jMin; jK++) {
            Object[] objArr = this.f73376i;
            p.h(objArr);
            q.g(objArr, jK, null);
        }
        this.f73377j = j10;
        this.f73378k = j11;
        this.f73379l = (int) (j12 - jMin);
        this.f73380m = (int) (j13 - j12);
    }

    @NotNull
    public final c<bn.r>[] W(long j10) {
        long j11;
        long j12;
        long j13;
        ho.c[] cVarArr;
        if (j10 > this.f73378k) {
            return ho.b.f63557a;
        }
        long jK = K();
        long j14 = ((long) this.f73379l) + jK;
        if (this.f73374g == 0 && this.f73380m > 0) {
            j14++;
        }
        if (this.f63554c != 0 && (cVarArr = this.f63553b) != null) {
            for (ho.c cVar : cVarArr) {
                if (cVar != null) {
                    long j15 = ((r) cVar).f62656a;
                    if (j15 >= 0 && j15 < j14) {
                        j14 = j15;
                    }
                }
            }
        }
        if (j14 <= this.f73378k) {
            return ho.b.f63557a;
        }
        long J = J();
        int iMin = l() > 0 ? Math.min(this.f73380m, this.f73374g - ((int) (J - j14))) : this.f73380m;
        c<bn.r>[] cVarArr2 = ho.b.f63557a;
        long j16 = ((long) this.f73380m) + J;
        if (iMin > 0) {
            cVarArr2 = new c[iMin];
            Object[] objArr = this.f73376i;
            p.h(objArr);
            long j17 = J;
            int i10 = 0;
            while (true) {
                if (J >= j16) {
                    j11 = j14;
                    j12 = j16;
                    break;
                }
                Object objF = q.f(objArr, J);
                j11 = j14;
                e0 e0Var = q.f62655a;
                if (objF != e0Var) {
                    p.i(objF, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    a aVar = (a) objF;
                    int i11 = i10 + 1;
                    j12 = j16;
                    cVarArr2[i10] = aVar.f73384e;
                    q.g(objArr, J, e0Var);
                    q.g(objArr, j17, aVar.f73383d);
                    j13 = 1;
                    j17++;
                    if (i11 >= iMin) {
                        break;
                    }
                    i10 = i11;
                } else {
                    j12 = j16;
                    j13 = 1;
                }
                J += j13;
                j14 = j11;
                j16 = j12;
            }
            J = j17;
        } else {
            j11 = j14;
            j12 = j16;
        }
        int i12 = (int) (J - jK);
        long j18 = l() == 0 ? J : j11;
        long jMax = Math.max(this.f73377j, J - ((long) Math.min(this.f73373f, i12)));
        if (this.f73374g == 0 && jMax < j12) {
            Object[] objArr2 = this.f73376i;
            p.h(objArr2);
            if (p.f(q.f(objArr2, jMax), q.f62655a)) {
                J++;
                jMax++;
            }
        }
        V(jMax, j18, J, j12);
        z();
        return (cVarArr2.length == 0) ^ true ? I(cVarArr2) : cVarArr2;
    }

    public final long X() {
        long j10 = this.f73377j;
        if (j10 < this.f73378k) {
            this.f73378k = j10;
        }
        return j10;
    }

    @Override // ho.j
    @NotNull
    public go.d<T> a(@NotNull kotlin.coroutines.d dVar, int i10, @NotNull BufferOverflow bufferOverflow) {
        return q.e(this, dVar, i10, bufferOverflow);
    }

    @Override // go.p, go.d
    @Nullable
    public Object collect(@NotNull e<? super T> eVar, @NotNull c<?> cVar) {
        return A(this, eVar, cVar);
    }

    @Override // go.k, go.e
    @Nullable
    public Object emit(T t10, @NotNull c<? super bn.r> cVar) {
        return F(this, t10, cVar);
    }

    @Override // go.k
    public void g() {
        synchronized (this) {
            V(J(), this.f73378k, J(), N());
            bn.r rVar = bn.r.f5635a;
        }
    }

    @Override // go.k
    public boolean h(T t10) {
        int i10;
        boolean z10;
        c<bn.r>[] cVarArrI = ho.b.f63557a;
        synchronized (this) {
            if (R(t10)) {
                cVarArrI = I(cVarArrI);
                z10 = true;
            } else {
                z10 = false;
            }
        }
        for (c<bn.r> cVar : cVarArrI) {
            if (cVar != null) {
                Result.a aVar = Result.Companion;
                cVar.resumeWith(Result.m7534constructorimpl(bn.r.f5635a));
            }
        }
        return z10;
    }

    public final Object x(r rVar, c<? super bn.r> cVar) {
        kotlinx.coroutines.c cVar2 = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.d(cVar), 1);
        cVar2.K();
        synchronized (this) {
            if (T(rVar) < 0) {
                rVar.f62657b = cVar2;
            } else {
                Result.a aVar = Result.Companion;
                cVar2.resumeWith(Result.m7534constructorimpl(bn.r.f5635a));
            }
            bn.r rVar2 = bn.r.f5635a;
        }
        Object objB = cVar2.B();
        if (objB == in.a.g()) {
            f.c(cVar);
        }
        return objB == in.a.g() ? objB : bn.r.f5635a;
    }

    public final void y(a aVar) {
        synchronized (this) {
            if (aVar.f73382c < K()) {
                return;
            }
            Object[] objArr = this.f73376i;
            p.h(objArr);
            if (q.f(objArr, aVar.f73382c) != aVar) {
                return;
            }
            q.g(objArr, aVar.f73382c, q.f62655a);
            z();
            bn.r rVar = bn.r.f5635a;
        }
    }

    public final void z() {
        if (this.f73374g != 0 || this.f73380m > 1) {
            Object[] objArr = this.f73376i;
            p.h(objArr);
            while (this.f73380m > 0 && q.f(objArr, (K() + ((long) P())) - 1) == q.f62655a) {
                this.f73380m--;
                q.g(objArr, K() + ((long) P()), null);
            }
        }
    }
}
