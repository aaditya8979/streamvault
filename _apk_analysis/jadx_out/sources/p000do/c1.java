package p000do;

import cn.m;
import io.n;
import kotlinx.coroutines.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: EventLoop.common.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c1 extends h0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f59828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f59829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public m<f<?>> f59830d;

    public static /* synthetic */ void L(c1 c1Var, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        c1Var.I(z10);
    }

    public static /* synthetic */ void R(c1 c1Var, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        c1Var.Q(z10);
    }

    public final void I(boolean z10) {
        long jM = this.f59828b - M(z10);
        this.f59828b = jM;
        if (jM <= 0 && this.f59829c) {
            shutdown();
        }
    }

    public final long M(boolean z10) {
        return z10 ? 4294967296L : 1L;
    }

    public final void O(@NotNull f<?> fVar) {
        m<f<?>> mVar = this.f59830d;
        if (mVar == null) {
            mVar = new m<>();
            this.f59830d = mVar;
        }
        mVar.addLast(fVar);
    }

    public long P() {
        m<f<?>> mVar = this.f59830d;
        return (mVar == null || mVar.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    public final void Q(boolean z10) {
        this.f59828b += M(z10);
        if (z10) {
            return;
        }
        this.f59829c = true;
    }

    public final boolean S() {
        return this.f59828b >= M(true);
    }

    public final boolean T() {
        m<f<?>> mVar = this.f59830d;
        if (mVar != null) {
            return mVar.isEmpty();
        }
        return true;
    }

    public long U() {
        return !V() ? Long.MAX_VALUE : 0L;
    }

    public final boolean V() {
        f<?> fVarR;
        m<f<?>> mVar = this.f59830d;
        if (mVar == null || (fVarR = mVar.r()) == null) {
            return false;
        }
        fVarR.run();
        return true;
    }

    public boolean W() {
        return false;
    }

    @Override // p000do.h0
    @NotNull
    public final h0 limitedParallelism(int i10, @Nullable String str) {
        n.a(i10);
        return n.b(this, str);
    }

    public void shutdown() {
    }
}
