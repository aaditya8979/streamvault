package xk;

import cn.v0;
import java.util.Map;
import java.util.Set;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import org.jetbrains.annotations.NotNull;
import tn.t;
import zk.f0;

/* JADX INFO: compiled from: HttpClientEngineCapability.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final kl.a<Map<d<?>, Object>> f86967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Set<d<?>> f86968b;

    static {
        KType kTypeD;
        KClass kClassB = t.b(Map.class);
        try {
            KTypeProjection.Companion companion = KTypeProjection.Companion;
            kTypeD = t.d(t.o(Map.class, companion.invariant(t.n(d.class, companion.getSTAR())), companion.invariant(t.m(Object.class))));
        } catch (Throwable unused) {
            kTypeD = null;
        }
        f86967a = new kl.a<>("EngineCapabilities", new rl.a(kClassB, kTypeD));
        f86968b = v0.d(f0.f98297a);
    }

    @NotNull
    public static final kl.a<Map<d<?>, Object>> a() {
        return f86967a;
    }
}
