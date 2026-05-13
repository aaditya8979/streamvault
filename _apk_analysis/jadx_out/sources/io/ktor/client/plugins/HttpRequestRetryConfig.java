package io.ktor.client.plugins;

import bn.r;
import bo.z;
import cl.d;
import gl.m;
import gl.s;
import io.ktor.client.plugins.HttpRequestRetryConfig;
import java.util.concurrent.CancellationException;
import kotlin.random.Random;
import org.jetbrains.annotations.NotNull;
import sn.p;
import sn.q;
import zk.b0;
import zk.d0;
import zk.e0;

/* JADX INFO: compiled from: HttpRequestRetry.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class HttpRequestRetryConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q<? super e0, ? super cl.b, ? super dl.c, Boolean> f71127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q<? super e0, ? super d, ? super Throwable, Boolean> f71128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p<? super b0, ? super Integer, Long> f71129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public p<? super Long, ? super hn.c<? super r>, ? extends Object> f71130d = new HttpRequestRetryConfig$delay$1(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public p<? super d0, ? super d, r> f71131e = new p() { // from class: zk.u
        @Override // sn.p
        /* JADX INFO: renamed from: invoke */
        public final Object mo2invoke(Object obj, Object obj2) {
            return HttpRequestRetryConfig.s((d0) obj, (cl.d) obj2);
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f71132f;

    public HttpRequestRetryConfig() {
        z(3);
        j(this, 0.0d, 0L, 0L, 0L, false, 31, null);
    }

    public static final boolean B(e0 e0Var, cl.b bVar, dl.c cVar) {
        tn.p.k(e0Var, "$this$retryIf");
        tn.p.k(bVar, "<unused var>");
        tn.p.k(cVar, "response");
        int iE0 = cVar.d().e0();
        return 500 <= iE0 && iE0 < 600;
    }

    public static /* synthetic */ void g(HttpRequestRetryConfig httpRequestRetryConfig, boolean z10, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        httpRequestRetryConfig.f(z10, pVar);
    }

    public static final long h(boolean z10, p pVar, b0 b0Var, int i10) {
        m headers;
        String str;
        Long lT;
        tn.p.k(b0Var, "<this>");
        if (!z10) {
            return ((Number) pVar.mo2invoke(b0Var, Integer.valueOf(i10))).longValue();
        }
        dl.c cVarA = b0Var.a();
        Long lValueOf = (cVarA == null || (headers = cVarA.getHeaders()) == null || (str = headers.get(s.f62569a.u())) == null || (lT = z.t(str)) == null) ? null : Long.valueOf(lT.longValue() * ((long) 1000));
        return Math.max(((Number) pVar.mo2invoke(b0Var, Integer.valueOf(i10))).longValue(), lValueOf != null ? lValueOf.longValue() : 0L);
    }

    public static /* synthetic */ void j(HttpRequestRetryConfig httpRequestRetryConfig, double d10, long j10, long j11, long j12, boolean z10, int i10, Object obj) {
        httpRequestRetryConfig.i((i10 & 1) != 0 ? 2.0d : d10, (i10 & 2) != 0 ? 1000L : j10, (i10 & 4) != 0 ? 60000L : j11, (i10 & 8) == 0 ? j12 : 1000L, (i10 & 16) != 0 ? true : z10);
    }

    public static final long k(double d10, long j10, long j11, HttpRequestRetryConfig httpRequestRetryConfig, long j12, b0 b0Var, int i10) {
        tn.p.k(b0Var, "$this$delayMillis");
        return Math.min((long) (Math.pow(d10, i10 - 1) * j10), j11) + httpRequestRetryConfig.t(j12);
    }

    public static final r s(d0 d0Var, d dVar) {
        tn.p.k(d0Var, "<this>");
        tn.p.k(dVar, "it");
        return r.f5635a;
    }

    public static /* synthetic */ void w(HttpRequestRetryConfig httpRequestRetryConfig, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -1;
        }
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        httpRequestRetryConfig.v(i10, z10);
    }

    public static final boolean x(boolean z10, e0 e0Var, d dVar, Throwable th2) {
        tn.p.k(e0Var, "$this$retryOnExceptionIf");
        tn.p.k(dVar, "<unused var>");
        tn.p.k(th2, "cause");
        return HttpRequestRetryKt.u(th2) ? z10 : !(th2 instanceof CancellationException);
    }

    public final void A(int i10) {
        u(i10, new q() { // from class: zk.w
            @Override // sn.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return Boolean.valueOf(HttpRequestRetryConfig.B((e0) obj, (cl.b) obj2, (dl.c) obj3));
            }
        });
    }

    public final void C(@NotNull p<? super b0, ? super Integer, Long> pVar) {
        tn.p.k(pVar, "<set-?>");
        this.f71129c = pVar;
    }

    public final void D(int i10) {
        this.f71132f = i10;
    }

    public final void E(@NotNull q<? super e0, ? super cl.b, ? super dl.c, Boolean> qVar) {
        tn.p.k(qVar, "<set-?>");
        this.f71127a = qVar;
    }

    public final void F(@NotNull q<? super e0, ? super d, ? super Throwable, Boolean> qVar) {
        tn.p.k(qVar, "<set-?>");
        this.f71128b = qVar;
    }

    public final void f(final boolean z10, @NotNull final p<? super b0, ? super Integer, Long> pVar) {
        tn.p.k(pVar, "block");
        C(new p() { // from class: zk.y
            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public final Object mo2invoke(Object obj, Object obj2) {
                return Long.valueOf(HttpRequestRetryConfig.h(z10, pVar, (b0) obj, ((Integer) obj2).intValue()));
            }
        });
    }

    public final void i(final double d10, final long j10, final long j11, final long j12, boolean z10) {
        if (!(d10 > 0.0d)) {
            throw new IllegalStateException("Check failed.");
        }
        if (!(j10 > 0)) {
            throw new IllegalStateException("Check failed.");
        }
        if (!(j11 > 0)) {
            throw new IllegalStateException("Check failed.");
        }
        if (!(j12 >= 0)) {
            throw new IllegalStateException("Check failed.");
        }
        f(z10, new p() { // from class: zk.v
            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public final Object mo2invoke(Object obj, Object obj2) {
                return Long.valueOf(HttpRequestRetryConfig.k(d10, j10, j11, this, j12, (b0) obj, ((Integer) obj2).intValue()));
            }
        });
    }

    @NotNull
    public final p<Long, hn.c<? super r>, Object> l() {
        return this.f71130d;
    }

    @NotNull
    public final p<b0, Integer, Long> m() {
        p pVar = this.f71129c;
        if (pVar != null) {
            return pVar;
        }
        tn.p.C("delayMillis");
        return null;
    }

    public final int n() {
        return this.f71132f;
    }

    @NotNull
    public final p<d0, d, r> o() {
        return this.f71131e;
    }

    @NotNull
    public final q<e0, cl.b, dl.c, Boolean> p() {
        q qVar = this.f71127a;
        if (qVar != null) {
            return qVar;
        }
        tn.p.C("shouldRetry");
        return null;
    }

    @NotNull
    public final q<e0, d, Throwable, Boolean> q() {
        q qVar = this.f71128b;
        if (qVar != null) {
            return qVar;
        }
        tn.p.C("shouldRetryOnException");
        return null;
    }

    public final void r(@NotNull p<? super d0, ? super d, r> pVar) {
        tn.p.k(pVar, "block");
        this.f71131e = pVar;
    }

    public final long t(long j10) {
        if (j10 == 0) {
            return 0L;
        }
        return Random.Default.nextLong(j10);
    }

    public final void u(int i10, @NotNull q<? super e0, ? super cl.b, ? super dl.c, Boolean> qVar) {
        tn.p.k(qVar, "block");
        if (i10 != -1) {
            this.f71132f = i10;
        }
        E(qVar);
    }

    public final void v(int i10, final boolean z10) {
        y(i10, new q() { // from class: zk.x
            @Override // sn.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return Boolean.valueOf(HttpRequestRetryConfig.x(z10, (e0) obj, (cl.d) obj2, (Throwable) obj3));
            }
        });
    }

    public final void y(int i10, @NotNull q<? super e0, ? super d, ? super Throwable, Boolean> qVar) {
        tn.p.k(qVar, "block");
        if (i10 != -1) {
            this.f71132f = i10;
        }
        F(qVar);
    }

    public final void z(int i10) {
        A(i10);
        w(this, i10, false, 2, null);
    }
}
