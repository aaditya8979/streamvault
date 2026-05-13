package io.ktor.client.engine;

import bn.g;
import io.ktor.client.HttpClient;
import io.ktor.client.engine.HttpClientEngine;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import p000do.h0;
import p000do.k0;
import p000do.w;
import tn.p;
import xk.c;

/* JADX INFO: compiled from: HttpClientEngineBase.kt */
/* JADX INFO: loaded from: classes6.dex */
public abstract class b implements HttpClientEngine {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f71078e = AtomicIntegerFieldUpdater.newUpdater(b.class, "closed");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f71079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final g f71080c;

    @NotNull
    private volatile /* synthetic */ int closed;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final g f71081d;

    public b(@NotNull String str) {
        p.k(str, "engineName");
        this.f71079b = str;
        this.closed = 0;
        this.f71080c = kotlin.b.b(new sn.a() { // from class: xk.a
            @Override // sn.a
            public final Object invoke() {
                return io.ktor.client.engine.b.d(this.f86965b);
            }
        });
        this.f71081d = kotlin.b.b(new sn.a() { // from class: xk.b
            @Override // sn.a
            public final Object invoke() {
                return io.ktor.client.engine.b.c(this.f86966b);
            }
        });
    }

    public static final d c(b bVar) {
        return kl.p.b(null, 1, null).plus(bVar.k()).plus(new k0(bVar.f71079b + "-context"));
    }

    public static final h0 d(b bVar) {
        h0 h0VarA = bVar.getConfig().a();
        return h0VarA == null ? c.a() : h0VarA;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (f71078e.compareAndSet(this, 0, 1)) {
            d.b bVar = getCoroutineContext().get(kotlinx.coroutines.g.H8);
            w wVar = bVar instanceof w ? (w) bVar : null;
            if (wVar == null) {
                return;
            }
            wVar.complete();
        }
    }

    @Override // p000do.l0
    @NotNull
    public d getCoroutineContext() {
        return (d) this.f71081d.getValue();
    }

    @NotNull
    public h0 k() {
        return (h0) this.f71080c.getValue();
    }

    @Override // io.ktor.client.engine.HttpClientEngine
    @NotNull
    public Set<xk.d<?>> u() {
        return HttpClientEngine.DefaultImpls.g(this);
    }

    @Override // io.ktor.client.engine.HttpClientEngine
    public void z(@NotNull HttpClient httpClient) {
        HttpClientEngine.DefaultImpls.h(this, httpClient);
    }
}
