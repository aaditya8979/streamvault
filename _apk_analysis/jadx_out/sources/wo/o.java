package wo;

import java.util.List;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Caching.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f86578a;

    static {
        boolean z10;
        try {
            Class.forName("java.lang.ClassValue");
            z10 = true;
        } catch (Throwable unused) {
            z10 = false;
        }
        f86578a = z10;
    }

    @NotNull
    public static final <T> s2<T> a(@NotNull sn.l<? super KClass<?>, ? extends KSerializer<T>> lVar) {
        tn.p.k(lVar, "factory");
        return f86578a ? new s(lVar) : new x(lVar);
    }

    @NotNull
    public static final <T> z1<T> b(@NotNull sn.p<? super KClass<Object>, ? super List<? extends KType>, ? extends KSerializer<T>> pVar) {
        tn.p.k(pVar, "factory");
        return f86578a ? new t(pVar) : new y(pVar);
    }
}
