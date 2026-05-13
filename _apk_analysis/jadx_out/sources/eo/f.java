package eo;

import android.os.Handler;
import android.os.Looper;
import bn.r;
import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.a2;
import p000do.k;
import p000do.t1;
import p000do.w0;
import p000do.y0;
import sn.l;
import tn.i;
import tn.p;
import zn.n;

/* JADX INFO: compiled from: HandlerDispatcher.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class f extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Handler f61170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f61171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f61172d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final f f61173e;

    public f(@NotNull Handler handler, @Nullable String str) {
        this(handler, str, false);
    }

    public /* synthetic */ f(Handler handler, String str, int i10, i iVar) {
        this(handler, (i10 & 2) != 0 ? null : str);
    }

    public f(Handler handler, String str, boolean z10) {
        super(null);
        this.f61170b = handler;
        this.f61171c = str;
        this.f61172d = z10;
        this.f61173e = z10 ? this : new f(handler, str, true);
    }

    public static final void T(f fVar, Runnable runnable) {
        fVar.f61170b.removeCallbacks(runnable);
    }

    public static final void U(k kVar, f fVar) {
        kVar.s(fVar, r.f5635a);
    }

    public static final r V(f fVar, Runnable runnable, Throwable th2) {
        fVar.f61170b.removeCallbacks(runnable);
        return r.f5635a;
    }

    @Override // eo.g, p000do.r0
    @NotNull
    public y0 A(long j10, @NotNull final Runnable runnable, @NotNull kotlin.coroutines.d dVar) {
        if (this.f61170b.postDelayed(runnable, n.k(j10, 4611686018427387903L))) {
            return new y0() { // from class: eo.c
                @Override // p000do.y0
                public final void dispose() {
                    f.T(this.f61164b, runnable);
                }
            };
        }
        R(dVar, runnable);
        return a2.f59823b;
    }

    public final void R(kotlin.coroutines.d dVar, Runnable runnable) {
        t1.c(dVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        w0.b().dispatch(dVar, runnable);
    }

    @Override // eo.g
    @NotNull
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public f M() {
        return this.f61173e;
    }

    @Override // p000do.r0
    public void a(long j10, @NotNull final k<? super r> kVar) {
        final Runnable runnable = new Runnable() { // from class: eo.d
            @Override // java.lang.Runnable
            public final void run() {
                f.U(kVar, this);
            }
        };
        if (this.f61170b.postDelayed(runnable, n.k(j10, 4611686018427387903L))) {
            kVar.P(new l() { // from class: eo.e
                @Override // sn.l
                public final Object invoke(Object obj) {
                    return f.V(this.f61168b, runnable, (Throwable) obj);
                }
            });
        } else {
            R(kVar.getContext(), runnable);
        }
    }

    @Override // p000do.h0
    public void dispatch(@NotNull kotlin.coroutines.d dVar, @NotNull Runnable runnable) {
        if (this.f61170b.post(runnable)) {
            return;
        }
        R(dVar, runnable);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (fVar.f61170b == this.f61170b && fVar.f61172d == this.f61172d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return System.identityHashCode(this.f61170b) ^ (this.f61172d ? 1231 : 1237);
    }

    @Override // p000do.h0
    public boolean isDispatchNeeded(@NotNull kotlin.coroutines.d dVar) {
        return (this.f61172d && p.f(Looper.myLooper(), this.f61170b.getLooper())) ? false : true;
    }

    @Override // p000do.y1, p000do.h0
    @NotNull
    public String toString() {
        String strL = L();
        if (strL != null) {
            return strL;
        }
        String string = this.f61171c;
        if (string == null) {
            string = this.f61170b.toString();
        }
        if (!this.f61172d) {
            return string;
        }
        return string + ".immediate";
    }
}
