package zk;

import com.ironsource.Q6;
import io.ktor.client.HttpClient;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: HttpClientPlugin.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final kl.a<kl.b> f98310a;

    static {
        KType kTypeM;
        KClass kClassB = tn.t.b(kl.b.class);
        try {
            kTypeM = tn.t.m(kl.b.class);
        } catch (Throwable unused) {
            kTypeM = null;
        }
        f98310a = new kl.a<>("ApplicationPluginRegistry", new rl.a(kClassB, kTypeM));
    }

    @NotNull
    public static final kl.a<kl.b> a() {
        return f98310a;
    }

    @NotNull
    public static final <B, F> F b(@NotNull HttpClient httpClient, @NotNull l<? extends B, F> lVar) {
        tn.p.k(httpClient, "<this>");
        tn.p.k(lVar, Q6.L);
        F f10 = (F) c(httpClient, lVar);
        if (f10 != null) {
            return f10;
        }
        throw new IllegalStateException("Plugin " + lVar + " is not installed. Consider using `install(" + lVar.getKey() + ")` in client config first.");
    }

    @Nullable
    public static final <B, F> F c(@NotNull HttpClient httpClient, @NotNull l<? extends B, F> lVar) {
        tn.p.k(httpClient, "<this>");
        tn.p.k(lVar, Q6.L);
        kl.b bVar = (kl.b) httpClient.getAttributes().e(f98310a);
        if (bVar != null) {
            return (F) bVar.e(lVar.getKey());
        }
        return null;
    }
}
