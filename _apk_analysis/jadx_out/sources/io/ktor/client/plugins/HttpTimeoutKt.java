package io.ktor.client.plugins;

import al.d;
import al.i;
import bn.r;
import cl.e;
import com.vungle.ads.internal.ui.AdActivity;
import io.ktor.client.network.sockets.ConnectTimeoutException;
import io.ktor.client.plugins.HttpTimeoutKt;
import io.ktor.client.plugins.api.Send;
import kotlinx.coroutines.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.k0;
import p000do.l0;
import sn.l;
import tn.p;
import zk.f0;
import zk.g0;

/* JADX INFO: compiled from: HttpTimeout.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class HttpTimeoutKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final rs.c f71152a = pl.a.a("io.ktor.client.plugins.HttpTimeout");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final al.b<g0> f71153b = i.b("HttpTimeout", HttpTimeoutKt$HttpTimeout$2.INSTANCE, new l() { // from class: zk.h0
        @Override // sn.l
        public final Object invoke(Object obj) {
            return HttpTimeoutKt.d((al.d) obj);
        }
    });

    @NotNull
    public static final ConnectTimeoutException c(@NotNull e eVar, @Nullable Throwable th2) {
        Object objB;
        p.k(eVar, AdActivity.REQUEST_KEY_EXTRA);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Connect timeout has expired [url=");
        sb2.append(eVar.h());
        sb2.append(", connect_timeout=");
        g0 g0Var = (g0) eVar.c(f0.f98297a);
        if (g0Var == null || (objB = g0Var.b()) == null) {
            objB = "unknown";
        }
        sb2.append(objB);
        sb2.append(" ms]");
        return new ConnectTimeoutException(sb2.toString(), th2);
    }

    public static final r d(d dVar) {
        p.k(dVar, "$this$createClientPlugin");
        dVar.f(Send.f71163a, new HttpTimeoutKt$HttpTimeout$3$1(((g0) dVar.e()).c(), ((g0) dVar.e()).b(), ((g0) dVar.e()).d(), null));
        return r.f5635a;
    }

    public static final boolean e(Long l10, Long l11, Long l12, boolean z10) {
        return ((!z10 || l10 == null) && l11 == null && l12 == null) ? false : true;
    }

    public static final void j(l0 l0Var, cl.d dVar, Long l10) {
        if (l10 == null || l10.longValue() == Long.MAX_VALUE) {
            return;
        }
        final g gVarD = p000do.i.d(l0Var, new k0("request-timeout"), null, new HttpTimeoutKt$applyRequestTimeout$killer$1(l10, dVar, dVar.g(), null), 2, null);
        dVar.g().f(new l() { // from class: zk.i0
            @Override // sn.l
            public final Object invoke(Object obj) {
                return HttpTimeoutKt.k(gVarD, (Throwable) obj);
            }
        });
    }

    public static final r k(g gVar, Throwable th2) {
        g.a.a(gVar, null, 1, null);
        return r.f5635a;
    }

    public static final int l(long j10) {
        if (j10 == Long.MAX_VALUE) {
            return 0;
        }
        if (j10 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        if (j10 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j10;
    }

    @NotNull
    public static final al.b<g0> m() {
        return f71153b;
    }

    public static final boolean n(cl.d dVar) {
        if (gl.g0.b(dVar.i().o())) {
            return false;
        }
        dVar.d();
        dVar.d();
        return true;
    }

    public static final void o(@NotNull cl.d dVar, @NotNull l<? super g0, r> lVar) {
        p.k(dVar, "<this>");
        p.k(lVar, "block");
        f0 f0Var = f0.f98297a;
        g0 g0Var = new g0(null, null, null, 7, null);
        lVar.invoke(g0Var);
        dVar.l(f0Var, g0Var);
    }
}
