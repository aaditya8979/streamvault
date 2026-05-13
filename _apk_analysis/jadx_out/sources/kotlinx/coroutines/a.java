package kotlinx.coroutines;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.f0;
import p000do.j0;
import p000do.l0;
import p000do.m0;
import p000do.v1;
import p000do.y;
import p000do.z;
import sn.p;

/* JADX INFO: compiled from: AbstractCoroutine.kt */
/* JADX INFO: loaded from: classes12.dex */
public abstract class a<T> extends JobSupport implements hn.c<T>, l0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final kotlin.coroutines.d f73265d;

    public a(@NotNull kotlin.coroutines.d dVar, boolean z10, boolean z11) {
        super(z11);
        if (z10) {
            z0((g) dVar.get(g.H8));
        }
        this.f73265d = dVar.plus(this);
    }

    @Override // kotlinx.coroutines.JobSupport
    @NotNull
    public String H0() {
        String strG = f0.g(this.f73265d);
        if (strG == null) {
            return super.H0();
        }
        return '\"' + strG + "\":" + super.H0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.JobSupport
    public final void O0(@Nullable Object obj) {
        if (!(obj instanceof y)) {
            h1(obj);
        } else {
            y yVar = (y) obj;
            g1(yVar.f59911a, yVar.a());
        }
    }

    @Override // kotlinx.coroutines.JobSupport
    @NotNull
    public String e0() {
        return m0.a(this) + " was cancelled";
    }

    public void f1(@Nullable Object obj) {
        W(obj);
    }

    public void g1(@NotNull Throwable th2, boolean z10) {
    }

    @Override // hn.c
    @NotNull
    public final kotlin.coroutines.d getContext() {
        return this.f73265d;
    }

    @Override // p000do.l0
    @NotNull
    public kotlin.coroutines.d getCoroutineContext() {
        return this.f73265d;
    }

    public void h1(T t10) {
    }

    public final <R> void i1(@NotNull CoroutineStart coroutineStart, R r10, @NotNull p<? super R, ? super hn.c<? super T>, ? extends Object> pVar) {
        coroutineStart.invoke(pVar, r10, this);
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.g
    public boolean isActive() {
        return super.isActive();
    }

    @Override // hn.c
    public final void resumeWith(@NotNull Object obj) {
        Object objG0 = G0(z.b(obj));
        if (objG0 == v1.f59893b) {
            return;
        }
        f1(objG0);
    }

    @Override // kotlinx.coroutines.JobSupport
    public final void y0(@NotNull Throwable th2) {
        j0.a(this.f73265d, th2);
    }
}
