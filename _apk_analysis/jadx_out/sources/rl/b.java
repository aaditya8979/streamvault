package rl;

import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: TypeInfoJvm.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b {
    public static final boolean a(@NotNull Object obj, @NotNull KClass<?> kClass) {
        p.k(obj, "<this>");
        p.k(kClass, "type");
        return rn.a.a(kClass).isInstance(obj);
    }
}
