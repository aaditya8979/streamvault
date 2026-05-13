package al;

import bn.r;
import io.ktor.client.HttpClient;
import java.io.Closeable;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: ClientPluginInstance.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class g<PluginConfig> implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final kl.a<g<PluginConfig>> f3993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final PluginConfig f3994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final sn.l<d<PluginConfig>, r> f3995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public sn.a<r> f3996e;

    /* JADX WARN: Multi-variable type inference failed */
    public g(@NotNull kl.a<g<PluginConfig>> aVar, @NotNull PluginConfig pluginconfig, @NotNull sn.l<? super d<PluginConfig>, r> lVar) {
        p.k(aVar, "key");
        p.k(pluginconfig, "config");
        p.k(lVar, "body");
        this.f3993b = aVar;
        this.f3994c = pluginconfig;
        this.f3995d = lVar;
        this.f3996e = new sn.a() { // from class: al.f
            @Override // sn.a
            public final Object invoke() {
                return g.h();
            }
        };
    }

    public static final r h() {
        return r.f5635a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f3996e.invoke();
    }

    public final void z(@NotNull HttpClient httpClient) {
        p.k(httpClient, "scope");
        d<PluginConfig> dVar = new d<>(this.f3993b, httpClient, this.f3994c);
        this.f3995d.invoke(dVar);
        this.f3996e = dVar.d();
        Iterator<T> it = dVar.c().iterator();
        while (it.hasNext()) {
            ((j) it.next()).a(httpClient);
        }
    }
}
