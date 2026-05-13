package io.ktor.client.plugins;

import al.d;
import al.i;
import bn.g;
import bn.r;
import io.ktor.client.plugins.DoubleReceivePluginKt;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import org.jetbrains.annotations.NotNull;
import sn.l;
import tn.p;
import tn.t;
import zk.k0;

/* JADX INFO: compiled from: SaveBody.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class DoubleReceivePluginKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final kl.a<r> f71106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final kl.a<r> f71107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final g f71108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final al.b<r> f71109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final al.b<k0> f71110e;

    static {
        KType kTypeM;
        KClass kClassB = t.b(r.class);
        KType kTypeM2 = null;
        try {
            kTypeM = t.m(r.class);
        } catch (Throwable unused) {
            kTypeM = null;
        }
        f71106a = new kl.a<>("SkipSaveBody", new rl.a(kClassB, kTypeM));
        KClass kClassB2 = t.b(r.class);
        try {
            kTypeM2 = t.m(r.class);
        } catch (Throwable unused2) {
        }
        f71107b = new kl.a<>("ResponseBodySaved", new rl.a(kClassB2, kTypeM2));
        f71108c = kotlin.b.b(new sn.a() { // from class: zk.e
            @Override // sn.a
            public final Object invoke() {
                return DoubleReceivePluginKt.d();
            }
        });
        f71109d = i.c("SaveBody", new l() { // from class: zk.f
            @Override // sn.l
            public final Object invoke(Object obj) {
                return DoubleReceivePluginKt.e((al.d) obj);
            }
        });
        f71110e = i.b("DoubleReceivePlugin", DoubleReceivePluginKt$SaveBodyPlugin$1.INSTANCE, new l() { // from class: zk.g
            @Override // sn.l
            public final Object invoke(Object obj) {
                return DoubleReceivePluginKt.f((al.d) obj);
            }
        });
    }

    public static final rs.c d() {
        return pl.a.a("io.ktor.client.plugins.SaveBody");
    }

    public static final r e(d dVar) {
        p.k(dVar, "$this$createClientPlugin");
        dVar.b().m().l(dl.b.f59808h.b(), new DoubleReceivePluginKt$SaveBody$1$1(null));
        return r.f5635a;
    }

    public static final r f(d dVar) {
        p.k(dVar, "$this$createClientPlugin");
        if (((k0) dVar.e()).a()) {
            j().warn("It is no longer possible to disable body saving for all requests. Use client.prepareRequest(...).execute { ... } syntax to prevent saving the body in memory.\n\nThis API is deprecated and will be removed in Ktor 4.0.0\nIf you were relying on this functionality, share your use case by commenting on this issue: https://youtrack.jetbrains.com/issue/KTOR-8367/");
        } else {
            j().warn("The SaveBodyPlugin plugin is deprecated and can be safely removed. Request bodies are now saved in memory by default for all non-streaming responses.");
        }
        return r.f5635a;
    }

    public static final rs.c j() {
        return (rs.c) f71108c.getValue();
    }

    @NotNull
    public static final al.b<r> k() {
        return f71109d;
    }

    public static final boolean l(@NotNull dl.c cVar) {
        p.k(cVar, "<this>");
        return cVar.L().getAttributes().g(f71107b);
    }
}
