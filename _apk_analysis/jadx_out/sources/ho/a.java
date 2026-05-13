package ho;

import go.u;
import ho.c;
import java.util.Arrays;
import kotlin.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AbstractSharedFlow.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a<S extends c<?>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public S[] f63553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f63554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f63555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public s f63556e;

    @NotNull
    public final S e() {
        S s10;
        s sVar;
        synchronized (this) {
            S[] sArr = this.f63553b;
            if (sArr == null) {
                sArr = (S[]) j(2);
                this.f63553b = sArr;
            } else if (this.f63554c >= sArr.length) {
                Object[] objArrCopyOf = Arrays.copyOf(sArr, sArr.length * 2);
                tn.p.j(objArrCopyOf, "copyOf(...)");
                this.f63553b = (S[]) ((c[]) objArrCopyOf);
                sArr = (S[]) ((c[]) objArrCopyOf);
            }
            int i10 = this.f63555d;
            do {
                s10 = sArr[i10];
                if (s10 == null) {
                    s10 = (S) f();
                    sArr[i10] = s10;
                }
                i10++;
                if (i10 >= sArr.length) {
                    i10 = 0;
                }
                tn.p.i(s10, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
            } while (!s10.a(this));
            this.f63555d = i10;
            this.f63554c++;
            sVar = this.f63556e;
        }
        if (sVar != null) {
            sVar.Z(1);
        }
        return s10;
    }

    @NotNull
    public abstract S f();

    @NotNull
    public final u<Integer> i() {
        s sVar;
        synchronized (this) {
            sVar = this.f63556e;
            if (sVar == null) {
                sVar = new s(this.f63554c);
                this.f63556e = sVar;
            }
        }
        return sVar;
    }

    @NotNull
    public abstract S[] j(int i10);

    public final void k(@NotNull S s10) {
        s sVar;
        int i10;
        hn.c<bn.r>[] cVarArrB;
        synchronized (this) {
            int i11 = this.f63554c - 1;
            this.f63554c = i11;
            sVar = this.f63556e;
            if (i11 == 0) {
                this.f63555d = 0;
            }
            tn.p.i(s10, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
            cVarArrB = s10.b(this);
        }
        for (hn.c<bn.r> cVar : cVarArrB) {
            if (cVar != null) {
                Result.a aVar = Result.Companion;
                cVar.resumeWith(Result.m7534constructorimpl(bn.r.f5635a));
            }
        }
        if (sVar != null) {
            sVar.Z(-1);
        }
    }

    public final int l() {
        return this.f63554c;
    }

    @Nullable
    public final S[] m() {
        return this.f63553b;
    }
}
