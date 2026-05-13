package al;

import bn.r;
import io.ktor.client.HttpClient;
import io.ktor.client.plugins.api.RequestHook;
import io.ktor.client.plugins.api.TransformResponseBodyHook;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import sn.s;
import tn.p;

/* JADX INFO: compiled from: ClientPluginBuilder.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class d<PluginConfig> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final kl.a<g<PluginConfig>> f3985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final HttpClient f3986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final PluginConfig f3987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final List<j<?>> f3988d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public sn.a<r> f3989e;

    public d(@NotNull kl.a<g<PluginConfig>> aVar, @NotNull HttpClient httpClient, @NotNull PluginConfig pluginconfig) {
        p.k(aVar, "key");
        p.k(httpClient, "client");
        p.k(pluginconfig, "pluginConfig");
        this.f3985a = aVar;
        this.f3986b = httpClient;
        this.f3987c = pluginconfig;
        this.f3988d = new ArrayList();
        this.f3989e = new sn.a() { // from class: al.c
            @Override // sn.a
            public final Object invoke() {
                return d.g();
            }
        };
    }

    public static final r g() {
        return r.f5635a;
    }

    @NotNull
    public final HttpClient b() {
        return this.f3986b;
    }

    @NotNull
    public final List<j<?>> c() {
        return this.f3988d;
    }

    @NotNull
    public final sn.a<r> d() {
        return this.f3989e;
    }

    @NotNull
    public final PluginConfig e() {
        return this.f3987c;
    }

    public final <HookHandler> void f(@NotNull a<HookHandler> aVar, HookHandler hookhandler) {
        p.k(aVar, "hook");
        this.f3988d.add(new j<>(aVar, hookhandler));
    }

    public final void h(@NotNull sn.r<? super k, ? super cl.d, Object, ? super hn.c<? super r>, ? extends Object> rVar) {
        p.k(rVar, "block");
        f(RequestHook.f71162a, rVar);
    }

    public final void i(@NotNull s<? super l, ? super dl.c, ? super io.ktor.utils.io.a, ? super rl.a, ? super hn.c<Object>, ? extends Object> sVar) {
        p.k(sVar, "block");
        f(TransformResponseBodyHook.f71167a, sVar);
    }
}
