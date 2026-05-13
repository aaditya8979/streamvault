package io.ktor.client.plugins;

import al.d;
import al.i;
import bn.r;
import io.ktor.client.plugins.HttpRequestLifecycleKt;
import kotlinx.coroutines.g;
import org.jetbrains.annotations.NotNull;
import p000do.t1;
import p000do.w;
import p000do.y0;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: HttpRequestLifecycle.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class HttpRequestLifecycleKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final rs.c f71125a = pl.a.a("io.ktor.client.plugins.HttpRequestLifecycle");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final al.b<r> f71126b = i.c("RequestLifecycle", new l() { // from class: zk.r
        @Override // sn.l
        public final Object invoke(Object obj) {
            return HttpRequestLifecycleKt.d((al.d) obj);
        }
    });

    public static final r d(d dVar) {
        p.k(dVar, "$this$createClientPlugin");
        dVar.f(SetupRequestContext.f71158a, new HttpRequestLifecycleKt$HttpRequestLifecycle$1$1(dVar, null));
        return r.f5635a;
    }

    public static final void f(final w wVar, g gVar) {
        final y0 y0VarF = gVar.f(new l() { // from class: zk.s
            @Override // sn.l
            public final Object invoke(Object obj) {
                return HttpRequestLifecycleKt.g(wVar, (Throwable) obj);
            }
        });
        wVar.f(new l() { // from class: zk.t
            @Override // sn.l
            public final Object invoke(Object obj) {
                return HttpRequestLifecycleKt.h(y0VarF, (Throwable) obj);
            }
        });
    }

    public static final r g(w wVar, Throwable th2) {
        if (th2 != null) {
            f71125a.trace("Cancelling request because engine Job failed with error: " + th2);
            t1.d(wVar, "Engine failed", th2);
        } else {
            f71125a.trace("Cancelling request because engine Job completed");
            wVar.complete();
        }
        return r.f5635a;
    }

    public static final r h(y0 y0Var, Throwable th2) {
        y0Var.dispose();
        return r.f5635a;
    }

    @NotNull
    public static final al.b<r> i() {
        return f71126b;
    }
}
